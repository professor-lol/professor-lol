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

    @Builder
    public StatSaveDto(Integer hp, Integer hpPerLevel, Integer mp, Integer mpPerLevel, Integer moveSpeed, Integer armor, Double armorPerLevel, Double spellBlock, Double spellBlockPerLevel, Integer attackRange, Integer hpRegen, Double hpRegenPerLevel, Integer mpRegen, Integer mpRegenPerLevel, Integer crit, Integer critPerLevel, Integer attackDamage, Integer attackDamagePerLevel, Double attackSpeed, Double attackSpeedPerLevel) {
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
