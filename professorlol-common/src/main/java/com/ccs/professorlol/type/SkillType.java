package com.ccs.professorlol.type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@Getter
@RequiredArgsConstructor
public enum SkillType {

    STAT("기본"),
    PASSIVE("기본 지속 효과"),
    Q("Q"),
    W("W"),
    E("E"),
    R("R");

    private final String name;

    public static SkillType findBy(String name){
        return Arrays.stream(SkillType.values())
                .filter(skillType -> skillType.getName().equals(name))
                .findFirst()
                .orElse(STAT);
    }
}
