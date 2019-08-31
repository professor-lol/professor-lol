package com.css.professorlol.config.exception.handler;

import com.css.professorlol.config.exception.NotCorrectInputException;
import com.css.professorlol.config.exception.NotJsonTypeException;
import com.css.professorlol.config.exception.RiotClientException;
import com.css.professorlol.config.exception.RiotServerException;
import com.css.professorlol.config.exception.dto.RiotExceptionDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.DefaultResponseErrorHandler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Slf4j
public class RiotErrorHandler extends DefaultResponseErrorHandler {

    @Override
    public boolean hasError(ClientHttpResponse response) throws IOException {
        return super.hasError(response);
    }

    @Override
    public void handleError(ClientHttpResponse response) {
        RiotExceptionDto exceptionDto = parseRiotExceptionBody(response);
        if (exceptionDto.isBadRequestError()) {
            log.error("[NotCorrectInputException] {} : {}", exceptionDto.getStatusCode(), exceptionDto.getMessage());
            throw new NotCorrectInputException(exceptionDto.getMessage());
        }

        if (exceptionDto.is4xxError()) {
            log.error("[ClientException] {} : {}", exceptionDto.getStatusCode(), exceptionDto.getMessage());
            throw new RiotClientException(exceptionDto.getMessage());
        }

        log.error("[ServerException] {} : {}", exceptionDto.getStatusCode(), exceptionDto.getMessage());
        throw new RiotServerException(exceptionDto.getMessage());
    }

    private RiotExceptionDto parseRiotExceptionBody(ClientHttpResponse response) {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(response.getBody());
            BufferedReader br = new BufferedReader(inputStreamReader);
            String exceptionBody = br.readLine();
            return new ObjectMapper().readValue(exceptionBody, RiotExceptionDto.class);
        } catch (Exception e) {
            log.error("[Json Parsing Exception] {} : {}", HttpStatus.UNPROCESSABLE_ENTITY, "can't not parse error");
            throw new NotJsonTypeException("can't not parse error");
        }
    }

}