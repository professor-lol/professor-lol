package com.css.professorlol.config.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.util.Arrays;

@Getter
public enum RiotExceptionGroup {
    BAD_REQUEST(HttpStatus.BAD_REQUEST, new RiotException("")),
    NOT_FOUND(HttpStatus.NOT_FOUND, new RiotException("")),
    FORBIDDEN(HttpStatus.FORBIDDEN, new RiotException("")),
    UNAUTHORIZED(HttpStatus.UNAUTHORIZED, new RiotException("")),
    DEFAULT(HttpStatus.BAD_REQUEST, new RiotException(""));

    private HttpStatus httpStatus;
    private RiotException exception;

    RiotExceptionGroup(HttpStatus httpStatus, RiotException exception) {
        this.httpStatus = httpStatus;
        this.exception = exception;
    }

    public static RiotException findExceptionByHttpStatus(HttpStatus status) {
        return Arrays.stream(RiotExceptionGroup.values())
                .filter(httpStatus -> httpStatus.isEqualStatus(status))
                .findFirst()
                .orElse(DEFAULT)
                .getException();
    }

    private boolean isEqualStatus(HttpStatus status) {
        return httpStatus.equals(status);
    }

}
