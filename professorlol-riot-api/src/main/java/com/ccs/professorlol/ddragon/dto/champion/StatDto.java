package com.ccs.professorlol.ddragon.dto.champion;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class StatDto {
    private double attackspeed;
    private double attackspeedperlevel;
    private int attackdamageperlevel;
    private int attackdamage;
    private int critperlevel;
    private int crit;
    private int mpregenperlevel;
    private int mpregen;
    private double hpregenperlevel;
    private int hpregen;
    private int attackrange;
    private double spellblockperlevel;
    private double spellblock;
    private double armorperlevel;
    private int armor;
    private int movespeed;
    private int mpperlevel;
    private int mp;
    private int hpperlevel;
    private int hp;
}
