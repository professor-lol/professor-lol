package com.css.professorlol.config.exception;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.*;

@Getter
@ToString
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class RiotExceptionDto {

    private Status status;

    public String getStatusCode(){
        return this.status.getStatusCode();
    }

    public String getMessage(){
        return this.status.getMessage();
    }

    @Getter
    @ToString
    private static class Status {
        @JsonAlias("status_code")
        private String statusCode;

        private String message;
    }
}
