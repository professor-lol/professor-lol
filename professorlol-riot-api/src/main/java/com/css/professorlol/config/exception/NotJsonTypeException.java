package com.css.professorlol.config.exception;

public class NotJsonTypeException extends RiotException {
    public NotJsonTypeException() {
        super("Media Type이 JSON이 아닙니다.");
    }
}
