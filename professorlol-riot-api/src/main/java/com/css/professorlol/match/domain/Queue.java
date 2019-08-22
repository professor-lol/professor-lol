package com.css.professorlol.match.domain;

import lombok.Getter;

@Getter
public enum Queue {
    SOLO("soloQueue", 420),
    FREE("freeQueue", 440);

    private String name;
    private Integer value;

    Queue(String name, Integer value) {
        this.name = name;
        this.value = value;
    }
}
