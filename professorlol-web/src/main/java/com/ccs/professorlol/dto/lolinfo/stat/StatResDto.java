package com.ccs.professorlol.dto.lolinfo.stat;

import com.ccs.professorlol.dto.lolinfo.LolInfoResDto;
import com.ccs.professorlol.lolInfo.champion.Stat;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class StatResDto {
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

    private LolInfoResDto lolInfoResDto;

    @Builder
    private StatResDto(Long id, Integer hp, Integer hpPerLevel, Integer mp, Integer mpPerLevel, Integer moveSpeed, Integer armor, Double armorPerLevel, Double spellBlock, Double spellBlockPerLevel, Integer attackRange, Integer hpRegen, Double hpRegenPerLevel, Integer mpRegen, Integer mpRegenPerLevel, Integer crit, Integer critPerLevel, Integer attackDamage, Integer attackDamagePerLevel, Double attackSpeed, Double attackSpeedPerLevel, LolInfoResDto lolInfoResDto) {
        this.id = id;
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
        this.lolInfoResDto = lolInfoResDto;
    }

    public static StatResDto from(Stat stat) {
        return StatResDto.builder()
                .id(stat.getId())
                .hp(stat.getHp())
                .hpPerLevel(stat.getHpPerLevel())
                .mp(stat.getMp())
                .mpPerLevel(stat.getMpPerLevel())
                .moveSpeed(stat.getMoveSpeed())
                .armor(stat.getArmor())
                .armorPerLevel(stat.getArmorPerLevel())
                .spellBlock(stat.getSpellBlock())
                .spellBlockPerLevel(stat.getSpellBlockPerLevel())
                .attackRange(stat.getAttackRange())
                .hpRegen(stat.getHpRegen())
                .hpRegenPerLevel(stat.getHpRegenPerLevel())
                .mpRegen(stat.getMpRegen())
                .mpRegenPerLevel(stat.getMpRegenPerLevel())
                .crit(stat.getCrit())
                .critPerLevel(stat.getCritPerLevel())
                .attackDamage(stat.getAttackDamage())
                .attackDamagePerLevel(stat.getAttackDamagePerLevel())
                .attackSpeed(stat.getAttackSpeed())
                .attackSpeedPerLevel(stat.getAttackSpeedPerLevel())
                .lolInfoResDto(LolInfoResDto.from(stat.getLolInfo()))
                .build();
    }
}
