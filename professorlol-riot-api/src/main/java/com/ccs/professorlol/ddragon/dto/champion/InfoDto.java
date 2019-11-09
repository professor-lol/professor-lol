package com.ccs.professorlol.ddragon.dto.champion;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class InfoDto {
    private int difficulty;
    private int magic;
    private int defense;
    private int attack;
}
