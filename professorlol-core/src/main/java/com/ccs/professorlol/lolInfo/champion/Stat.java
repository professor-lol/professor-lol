package com.ccs.professorlol.lolInfo.champion;

import com.ccs.professorlol.lolInfo.LolInfo;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
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

    private Integer hp;
    private Integer hpPerLevel;
    private Integer mp;
    private Integer mpPerLevel;
    private Integer moveSpeed;
    private Integer armor;
    private Double armorPerLevel;
    private Double spellBlock;
    private Double spellBlockPerLevel;
    private Integer attackRange;
    private Integer hpRegen;
    private Double hpRegenPerLevel;
    private Integer mpRegen;
    private Integer mpRegenPerLevel;
    private Integer crit;
    private Integer critPerLevel;
    private Integer attackDamage;
    private Integer attackDamagePerLevel;
    private Double attackSpeed;
    private Double attackSpeedPerLevel;

    @ManyToOne(fetch = FetchType.LAZY)
    private LolInfo lolInfo;

    @Builder
    public Stat(Integer hp, Integer hpPerLevel, Integer mp, Integer mpPerLevel, Integer moveSpeed, Integer armor, Double armorPerLevel, Double spellBlock, Double spellBlockPerLevel, Integer attackRange, Integer hpRegen, Double hpRegenPerLevel, Integer mpRegen, Integer mpRegenPerLevel, Integer crit, Integer critPerLevel, Integer attackDamage, Integer attackDamagePerLevel, Double attackSpeed, Double attackSpeedPerLevel, LolInfo lolInfo) {
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
    }
}
