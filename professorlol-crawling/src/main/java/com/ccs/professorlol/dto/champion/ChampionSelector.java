package com.ccs.professorlol.dto.champion;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ChampionSelector {
    NAME(".change-title a"),
    SUMMARY(".summary"),
    CONTEXT(".context"),
    IMAGE(".reference-link img"),
    LINK("li");

    private final String cssQuery;
}
