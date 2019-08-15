package com.css.professorlol.config.exception;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.ResponseErrorHandler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
            InputStreamReader inputStreamReader = new InputStreamReader(response.getBody());
            BufferedReader br = new BufferedReader(inputStreamReader);
            String exceptionBody = br.readLine();
            RiotExceptionDto exceptionDto = new ObjectMapper().readValue(exceptionBody, RiotExceptionDto.class);
            log.info("exception body : "+exceptionDto.toString());
            return;
        }
        log.info("[Server error] : {}", response.getStatusCode());
    }

    private boolean isClientError(ClientHttpResponse response) throws IOException {
        return response.getStatusCode().series() == HttpStatus.Series.CLIENT_ERROR;
    }

    private boolean isServerError(ClientHttpResponse response) throws IOException {
        return response.getStatusCode().series() == HttpStatus.Series.SERVER_ERROR;
    }
}