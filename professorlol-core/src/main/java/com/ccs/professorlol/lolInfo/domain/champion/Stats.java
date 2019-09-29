package com.ccs.professorlol.lolInfo.domain.champion;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class Stats {
    private Double hp;
    private Double hpPerLevel;
    private Double mp;
    private Double mpPerLevel;
    private Double moveSpeed;
    private Double armor;
    private Double armorPerLevel;
    private Double spellBlock;
    private Double spellBlockPerLevel;
    private Double attackRange;
    private Double hpRegen;
    private Double hpRegenPerLevel;
    private Double mpRegen;
    private Double mpRegenPerLevel;
    private Double crit;
    private Double critPerLevel;
    private Double attackDamage;
    private Double attackDamagePerLevel;
    private Double attackSpeed;
    private Double attackSpeedPerLevel;

}
