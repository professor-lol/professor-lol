package com.css.professorlol.config.exception;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.ResponseErrorHandler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;

@Slf4j
@Component
public class RiotExceptionHandler implements ResponseErrorHandler {

    @Override
    public boolean hasError(ClientHttpResponse response) throws IOException {
        return (isClientError(response) || isServerError(response));
    }

    @Override
    public void handleError(ClientHttpResponse response) throws IOException {
        if (isClientError(response)) {
            log.info("[Client Error] : {}", response.getStatusCode());
            log.info(response.getStatusCode().getReasonPhrase());
//            RiotExceptionDto exceptionDto = parseRiotExceptionBody(response);
            throw RiotExceptionGroup.findExceptionByHttpStatus(response.getStatusCode());
        }
        log.info("[Server error] : {}", response.getStatusCode());
        throw new RiotException("[Server Error] : " + response.getStatusCode());
    }

    private boolean isClientError(ClientHttpResponse response) throws IOException {
        return response.getStatusCode().series() == HttpStatus.Series.CLIENT_ERROR;
    }

    private boolean isServerError(ClientHttpResponse response) throws IOException {
        return response.getStatusCode().series() == HttpStatus.Series.SERVER_ERROR;
    }

    private RiotExceptionDto parseRiotExceptionBody(ClientHttpResponse response) throws IOException {
        if (isJson(response)) {
            InputStreamReader inputStreamReader = new InputStreamReader(response.getBody());
            BufferedReader br = new BufferedReader(inputStreamReader);
            String exceptionBody = br.readLine();
            return new ObjectMapper().readValue(exceptionBody, RiotExceptionDto.class);
        }
        log.error("[Json Parsing Error] {} : {}", response.getStatusCode(), response.getStatusText());
        throw new NotJsonTypeException(response.getStatusText());
    }

    private boolean isJson(ClientHttpResponse response) {
        return Optional.ofNullable(response.getHeaders().getContentType())
                .filter(MediaType.APPLICATION_JSON_UTF8::equals)
                .isPresent();
    }

}