package com.ccs.professorlol.lolInfo.champion.dto;

import com.ccs.professorlol.lolInfo.LolInfo;
import com.ccs.professorlol.lolInfo.champion.Champion;
import com.ccs.professorlol.lolInfo.champion.Stat;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class StatSaveDto {

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

    @Builder
    public StatSaveDto(Double hp, Double hpPerLevel, Double mp, Double mpPerLevel, Double moveSpeed, Double armor, Double armorPerLevel, Double spellBlock, Double spellBlockPerLevel, Double attackRange, Double hpRegen, Double hpRegenPerLevel, Double mpRegen, Double mpRegenPerLevel, Double crit, Double critPerLevel, Double attackDamage, Double attackDamagePerLevel, Double attackSpeed, Double attackSpeedPerLevel) {
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
    }

    public Stat toEntity(LolInfo lolInfo, Champion champion) {
        return Stat.builder()
                .hp(this.hp)
                .hpPerLevel(this.hpPerLevel)
                .mp(this.mp)
                .mpPerLevel(this.mpPerLevel)
                .moveSpeed(this.moveSpeed)
                .armor(this.armor)
                .armorPerLevel(this.armorPerLevel)
                .spellBlock(this.spellBlock)
                .spellBlockPerLevel(this.spellBlockPerLevel)
                .attackRange(this.attackRange)
                .hpRegen(this.hpRegen)
                .hpRegenPerLevel(this.hpRegenPerLevel)
                .mpRegen(this.mpRegen)
                .mpRegenPerLevel(this.mpRegenPerLevel)
                .crit(this.crit)
                .critPerLevel(this.critPerLevel)
                .attackDamage(this.attackDamage)
                .attackDamagePerLevel(this.attackDamagePerLevel)
                .attackSpeed(this.attackSpeed)
                .attackSpeedPerLevel(this.attackSpeedPerLevel)
                .lolInfo(lolInfo)
                .champion(champion)
                .build();
    }
}
