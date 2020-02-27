package com.ccs.professorlol.config.exception.handler;

import com.ccs.professorlol.MockResponse;
import com.ccs.professorlol.config.exception.NotCorrectInputException;
import com.ccs.professorlol.config.exception.NotJsonTypeException;
import com.ccs.professorlol.config.exception.RiotClientException;
import com.ccs.professorlol.config.exception.RiotServerException;
import com.ccs.professorlol.config.exception.dto.RiotExceptionDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.mock.http.client.MockClientHttpResponse;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class RiotErrorHandlerTest {

    private RiotErrorHandler riotErrorHandler;

    @BeforeEach
    void setUp() {
        riotErrorHandler = new RiotErrorHandler();
    }

    @DisplayName("hasError 4XX ~ 5XX 발생시 true")
    @ParameterizedTest
    @CsvSource(value = {"400", "451", "500", "511"})
    void hasError_4XX_5XX(int statusCode) throws IOException {
        //given
        HttpStatus status4XX_5XX = HttpStatus.valueOf(statusCode);
        MockClientHttpResponse response4XX_5XX = new MockClientHttpResponse(new byte[0], status4XX_5XX);

        //when
        boolean result4XX_5XX = riotErrorHandler.hasError(response4XX_5XX);

        //then
        assertThat(result4XX_5XX).isTrue();
    }

    @DisplayName("handleError 400 발생시")
    @Test
    void handleError_400() throws JsonProcessingException {
        //given
        String mockBody = MockResponse.getExceptionResponseBody("BadRequest Exception", HttpStatus.BAD_REQUEST);

        ClientHttpResponse response = new MockClientHttpResponse(mockBody.getBytes(), HttpStatus.BAD_REQUEST);
        RiotExceptionDto riotExceptionDto = new ObjectMapper().readValue(mockBody, RiotExceptionDto.class);

        //then
        assertThatThrownBy(() -> riotErrorHandler.handleError(response))
                .isInstanceOf(NotCorrectInputException.class)
                .hasMessage(riotExceptionDto.getMessage());
    }

    @DisplayName("handleError 400 이외 400번대 발생시")
    @ParameterizedTest
    @CsvSource(value = {"401", "451"})
    void handleError4XXExceptBadRequest(int statusCode) throws JsonProcessingException {
        //given
        HttpStatus status4XXExcept400 = HttpStatus.valueOf(statusCode);
        String responseBody = MockResponse.getExceptionResponseBody(status4XXExcept400.getReasonPhrase(), status4XXExcept400);

        ClientHttpResponse response = new MockClientHttpResponse(responseBody.getBytes(), status4XXExcept400);
        RiotExceptionDto riotExceptionDto = new ObjectMapper().readValue(responseBody, RiotExceptionDto.class);

        //then
        assertThatThrownBy(() -> riotErrorHandler.handleError(response))
                .isInstanceOf(RiotClientException.class)
                .hasMessage(riotExceptionDto.getMessage());
    }

    @DisplayName("handleError 5XX 발생시")
    @ParameterizedTest
    @CsvSource(value = {"500", "511"})
    void handleError_5XX(int statusCode) throws JsonProcessingException {
        //given
        HttpStatus status5XX = HttpStatus.valueOf(statusCode);
        String responseBody = MockResponse.getExceptionResponseBody(status5XX.getReasonPhrase(), status5XX);

        ClientHttpResponse response = new MockClientHttpResponse(responseBody.getBytes(), status5XX);
        RiotExceptionDto riotExceptionDto = new ObjectMapper().readValue(responseBody, RiotExceptionDto.class);

        //then
        assertThatThrownBy(() -> riotErrorHandler.handleError(response))
                .isInstanceOf(RiotServerException.class)
                .hasMessage(riotExceptionDto.getMessage());
    }

    @DisplayName("Response가 json 타입이 아닌경우")
    @Test
    void notJsonTypeResponse() {
        //given
        HttpStatus badRequest = HttpStatus.BAD_REQUEST;
        String notJsonMessage = "not json message";

        ClientHttpResponse response = new MockClientHttpResponse(notJsonMessage.getBytes(), badRequest);

        //then
        assertThatThrownBy(() -> riotErrorHandler.handleError(response))
                .isInstanceOf(NotJsonTypeException.class)
                .hasMessage("can't parse exception message");
    }

}