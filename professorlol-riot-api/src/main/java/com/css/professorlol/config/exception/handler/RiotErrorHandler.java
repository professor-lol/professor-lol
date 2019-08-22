package com.css.professorlol.config.exception.handler;

import com.css.professorlol.config.exception.BadRequestException;
import com.css.professorlol.config.exception.ClientException;
import com.css.professorlol.config.exception.NotJsonTypeException;
import com.css.professorlol.config.exception.ServerException;
import com.css.professorlol.config.exception.dto.RiotExceptionDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.ResponseErrorHandler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;

@Slf4j
public class RiotErrorHandler implements ResponseErrorHandler {

    @Override
    public boolean hasError(ClientHttpResponse response) throws IOException {
        return (isClientError(response) || isServerError(response));
    }

    @Override
    public void handleError(ClientHttpResponse response) throws IOException {
        RiotExceptionDto exceptionDto = parseRiotExceptionBody(response);
        if (isBadRequest(response)) {
            log.error("[Bad Request Exception] {} : {}", exceptionDto.getStatusCode(), exceptionDto.getMessage());
            throw new BadRequestException(exceptionDto.getMessage());
        }
        if (isClientError(response)) {
            log.error("[Client Exception] {} : {}", exceptionDto.getStatusCode(), exceptionDto.getMessage());
            throw new ClientException(exceptionDto.getMessage());
        }
        log.error("[Server Exception] {} : {}", exceptionDto.getStatusCode(), exceptionDto.getMessage());
        throw new ServerException(exceptionDto.getMessage());
    }

    private boolean isClientError(ClientHttpResponse response) throws IOException {
        return response.getStatusCode().series() == HttpStatus.Series.CLIENT_ERROR;
    }

    private boolean isServerError(ClientHttpResponse response) throws IOException {
        return response.getStatusCode().series() == HttpStatus.Series.SERVER_ERROR;
    }

    private boolean isBadRequest(ClientHttpResponse response) throws IOException {
        return response.getStatusCode().equals(HttpStatus.BAD_REQUEST);
    }

    private RiotExceptionDto parseRiotExceptionBody(ClientHttpResponse response) throws IOException {
        if (isJson(response)) {
            InputStreamReader inputStreamReader = new InputStreamReader(response.getBody());
            BufferedReader br = new BufferedReader(inputStreamReader);
            String exceptionBody = br.readLine();
            return new ObjectMapper().readValue(exceptionBody, RiotExceptionDto.class);
        }
        log.error("[Json Parsing Exception] {} : {}", response.getStatusCode(), response.getStatusText());
        throw new NotJsonTypeException(response.getStatusText());
    }

    private boolean isJson(ClientHttpResponse response) {
        return Optional.ofNullable(response.getHeaders().getContentType())
                .filter(MediaType.APPLICATION_JSON_UTF8::equals)
                .isPresent();
    }

}