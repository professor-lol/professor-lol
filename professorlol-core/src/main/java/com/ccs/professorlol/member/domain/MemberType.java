package com.ccs.professorlol.member.domain;

import lombok.Getter;

@Getter
public enum MemberType {
    GOOGLE("gmail.com");

    private String domain;

    MemberType(String domain) {
        this.domain = domain;
    }
}
