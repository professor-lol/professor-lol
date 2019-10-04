package com.ccs.professorlol.patch.skill;

import lombok.Getter;

@Getter
public enum SkillType {

    STAT("stat"),
    PASSIVE("passive"),
    Q("skillQ"),
    W("skillW"),
    E("skillE"),
    R("skillR");

    private String name;

    SkillType(String name) {
        this.name = name;
    }
}
