package com.ccs.professorlol.config.exception.handler;

import com.ccs.professorlol.MockResponse;
import com.ccs.professorlol.config.exception.NotCorrectInputException;
import com.ccs.professorlol.config.exception.RiotClientException;
import com.ccs.professorlol.config.exception.RiotServerException;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.mock.http.client.MockClientHttpResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class RiotErrorHandlerTest {

    private RiotErrorHandler riotErrorHandler;

    @Before
    public void setUp() throws Exception {
        riotErrorHandler = new RiotErrorHandler();
    }

    private boolean hasError(ClientHttpResponse response) {
        try {
            return riotErrorHandler.hasError(response);
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    @Test
    public void hasError_4XX_발생시_true() throws IOException {
        //given
        List<HttpStatus> http4XX = Arrays.stream(HttpStatus.values())
                .filter(HttpStatus::is4xxClientError)
                .collect(Collectors.toList());

        //when
        List<Boolean> results = http4XX.stream()
                .map(status -> new MockClientHttpResponse(new byte[0], status))
                .map(this::hasError)
                .collect(Collectors.toList());

        //then
        assertThat(results.contains(false)).isFalse();
    }

    @Test
    public void hasError_5XX_발생시_true() throws IOException {
        //given
        List<HttpStatus> http5XX = Arrays.stream(HttpStatus.values())
                .filter(HttpStatus::is5xxServerError)
                .collect(Collectors.toList());

        //when
        List<Boolean> results = http5XX.stream()
                .map(status -> new MockClientHttpResponse(new byte[0], status))
                .map(this::hasError)
                .collect(Collectors.toList());

        //then
        assertThat(results.contains(false)).isFalse();
    }


    @Test
    public void handleError_400_발생시() throws IOException {
        //given
        String mockBody = MockResponse.getExceptionResponseBody("BadRequest Exception", HttpStatus.BAD_REQUEST);
        ClientHttpResponse response = new MockClientHttpResponse(mockBody.getBytes(), HttpStatus.BAD_REQUEST);

        //when
        //then
        assertThatThrownBy(() -> riotErrorHandler.handleError(response))
                .isInstanceOf(NotCorrectInputException.class);
    }

    private void assertThrownBy(ClientHttpResponse response, Class tClass) {
        assertThatThrownBy(() -> riotErrorHandler.handleError(response))
                .isInstanceOf(tClass);
    }

    @Test
    public void handleError_400_이외_발생시() throws IOException {
        //given
        List<HttpStatus> http4XXExceptBadRequest = Arrays.stream(HttpStatus.values())
                .filter(HttpStatus::is4xxClientError)
                .filter(status -> status.value() != 400)
                .collect(Collectors.toList());

        List<String> mockBodies = http4XXExceptBadRequest.stream()
                .map(status -> MockResponse.getExceptionResponseBody(status.getReasonPhrase(), status))
                .collect(Collectors.toList());

        List<ClientHttpResponse> responses = new ArrayList<>();
        for (int i = 0; i < http4XXExceptBadRequest.size(); i++) {
            HttpStatus status = http4XXExceptBadRequest.get(i);
            String mockBody = mockBodies.get(i);
            responses.add(new MockClientHttpResponse(mockBody.getBytes(), status));
        }

        //when
        //then
        responses.forEach(response -> assertThrownBy(response, RiotClientException.class));
    }

    @Test
    public void handleError_5xx_발생시() throws IOException {
        //given
        List<HttpStatus> http5xxStatus = Arrays.stream(HttpStatus.values())
                .filter(HttpStatus::is5xxServerError)
                .collect(Collectors.toList());

        List<String> mockBodies = http5xxStatus.stream()
                .map(status -> MockResponse.getExceptionResponseBody(status.getReasonPhrase(), status))
                .collect(Collectors.toList());

        List<ClientHttpResponse> responses = new ArrayList<>();
        for (int i = 0; i < http5xxStatus.size(); i++) {
            HttpStatus status = http5xxStatus.get(i);
            String mockBody = mockBodies.get(i);
            responses.add(new MockClientHttpResponse(mockBody.getBytes(), status));
        }

        //when
        //then
        responses.forEach(response -> assertThrownBy(response, RiotServerException.class));
    }

}