package com.ccs.professorlol.ddragon.dto.champion;

import lombok.AccessLevel;
import lombok.Builder;
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

    @Builder(builderMethodName = "testBuilder")
    private StatDto(double attackspeed, double attackspeedperlevel, int attackdamageperlevel, int attackdamage, int critperlevel, int crit, int mpregenperlevel, int mpregen, double hpregenperlevel, int hpregen, int attackrange, double spellblockperlevel, double spellblock, double armorperlevel, int armor, int movespeed, int mpperlevel, int mp, int hpperlevel, int hp) {
        this.attackspeed = attackspeed;
        this.attackspeedperlevel = attackspeedperlevel;
        this.attackdamageperlevel = attackdamageperlevel;
        this.attackdamage = attackdamage;
        this.critperlevel = critperlevel;
        this.crit = crit;
        this.mpregenperlevel = mpregenperlevel;
        this.mpregen = mpregen;
        this.hpregenperlevel = hpregenperlevel;
        this.hpregen = hpregen;
        this.attackrange = attackrange;
        this.spellblockperlevel = spellblockperlevel;
        this.spellblock = spellblock;
        this.armorperlevel = armorperlevel;
        this.armor = armor;
        this.movespeed = movespeed;
        this.mpperlevel = mpperlevel;
        this.mp = mp;
        this.hpperlevel = hpperlevel;
        this.hp = hp;
    }

}
