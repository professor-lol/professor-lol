package com.css.professorlol.config.exception.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;

@Slf4j
@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RiotExceptionDto {

    private Status status;

    public String getStatusCode() {
        return this.status.getStatusCode();
    }

    public String getMessage() {
        return this.status.getMessage();
    }

    public boolean isBadRequestError() {
        return getStatusCode().equals(String.valueOf(HttpStatus.BAD_REQUEST.value()));
    }

    public boolean is4xxError() {
        return 400 < Integer.parseInt(getStatusCode()) && Integer.parseInt(getStatusCode()) < 500;
    }

    @Getter
    @ToString
    public static class Status {
        @JsonAlias("status_code")
        private String statusCode;

        private String message;
    }

}
