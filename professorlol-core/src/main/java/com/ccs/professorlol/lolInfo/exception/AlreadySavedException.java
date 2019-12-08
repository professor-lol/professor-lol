package com.ccs.professorlol.lolInfo.exception;

public class AlreadySavedException extends RuntimeException {
    public AlreadySavedException(String message) {
        super(message + " is already exist!");
    }
}
