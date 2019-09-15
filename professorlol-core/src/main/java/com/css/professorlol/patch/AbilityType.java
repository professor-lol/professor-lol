package com.css.professorlol.patch;

import lombok.Getter;

@Getter
public enum AbilityType {
    PASSIVE("passive"),
    Q("skillQ"),
    W("skillW"),
    E("skillE"),
    R("skillR"),
    HPR("healthPointRegen"),
    MPR("magicPointRegen"),
    AP("attackPower"),
    AS("attackSeed"),
    DEF("defense"),
    MR("magicResistance"),
    SPEED("speed"),
    RANGE("range");

    private String name;

    AbilityType(String name) {
        this.name = name;
    }
}
