package com.css.professorlol.common;

import lombok.Getter;

@Getter
public enum RowStatus {
    Y(true),
    N(false);

    private boolean enable;

    RowStatus(boolean enable) {
        this.enable = enable;
    }
}
