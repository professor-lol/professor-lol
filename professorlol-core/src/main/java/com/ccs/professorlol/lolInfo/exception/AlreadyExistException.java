package com.ccs.professorlol.lolInfo.exception;

public class AlreadyExistException extends RuntimeException {
    public AlreadyExistException(String message) {
        super(message + " is already exist!");
    }
}
