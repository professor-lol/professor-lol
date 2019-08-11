package com.css.riotapi.core.exception;

public class ConnectionTimeOutException extends RuntimeException {
    public ConnectionTimeOutException(String message) {
        super(message);
    }
}
