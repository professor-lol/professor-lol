package com.ccs.professorlol.lolInfo.champion;

import com.ccs.professorlol.lolInfo.LolInfo;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Stat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    @ManyToOne(cascade = CascadeType.ALL)
    private LolInfo lolInfo;

    @ManyToOne(cascade = CascadeType.ALL)
    private Champion champion;

    @Builder
    public Stat(Double hp, Double hpPerLevel, Double mp, Double mpPerLevel, Double moveSpeed, Double armor, Double armorPerLevel, Double spellBlock, Double spellBlockPerLevel, Double attackRange, Double hpRegen, Double hpRegenPerLevel, Double mpRegen, Double mpRegenPerLevel, Double crit, Double critPerLevel, Double attackDamage, Double attackDamagePerLevel, Double attackSpeed, Double attackSpeedPerLevel, LolInfo lolInfo, Champion champion) {
        this.hp = hp;
        this.hpPerLevel = hpPerLevel;
        this.mp = mp;
        this.mpPerLevel = mpPerLevel;
        this.moveSpeed = moveSpeed;
        this.armor = armor;
        this.armorPerLevel = armorPerLevel;
        this.spellBlock = spellBlock;
        this.spellBlockPerLevel = spellBlockPerLevel;
        this.attackRange = attackRange;
        this.hpRegen = hpRegen;
        this.hpRegenPerLevel = hpRegenPerLevel;
        this.mpRegen = mpRegen;
        this.mpRegenPerLevel = mpRegenPerLevel;
        this.crit = crit;
        this.critPerLevel = critPerLevel;
        this.attackDamage = attackDamage;
        this.attackDamagePerLevel = attackDamagePerLevel;
        this.attackSpeed = attackSpeed;
        this.attackSpeedPerLevel = attackSpeedPerLevel;
        this.lolInfo = lolInfo;
        this.champion = champion;
    }
}
