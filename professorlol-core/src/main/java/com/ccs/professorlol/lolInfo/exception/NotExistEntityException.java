package com.ccs.professorlol.lolInfo.exception;

public class NotExistEntityException extends RuntimeException {
    public NotExistEntityException(Long id) {
        super(id + " is not exist!");
    }

    public NotExistEntityException(String version) {
        super(version + " is not exist!");
    }
}
