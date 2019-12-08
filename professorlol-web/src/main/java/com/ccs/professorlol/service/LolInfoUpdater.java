package com.ccs.professorlol.service;

import com.ccs.professorlol.dto.lolinfo.LolInfoUpdateDto;
import com.ccs.professorlol.dto.lolinfo.champion.ChampionUpdateDto;
import com.ccs.professorlol.dto.lolinfo.stat.StatUpdateDto;
import com.ccs.professorlol.lolInfo.LolInfo;
import com.ccs.professorlol.lolInfo.champion.Champion;
import com.ccs.professorlol.lolInfo.champion.Stat;

public class LolInfoUpdater {

    public static void updateLolInfo(LolInfo lolInfo, LolInfoUpdateDto updateDto) {
        lolInfo.setPatchNoteVersion(updateDto.getChangePatchVersion());
    }

    public static void updateStat(Stat stat, StatUpdateDto updateDto, LolInfo lolInfo) {
        stat.setHp(updateDto.getHp());
        stat.setHpPerLevel(updateDto.getHpPerLevel());
        stat.setHpRegen(updateDto.getHpRegen());
        stat.setHpRegenPerLevel(updateDto.getHpRegenPerLevel());
        stat.setMp(updateDto.getMp());
        stat.setMpPerLevel(updateDto.getMpPerLevel());
        stat.setMpRegen(updateDto.getMpRegen());
        stat.setMpRegenPerLevel(updateDto.getMpRegenPerLevel());
        stat.setArmor(updateDto.getArmor());
        stat.setArmorPerLevel(updateDto.getArmorPerLevel());
        stat.setSpellBlock(updateDto.getSpellBlock());
        stat.setSpellBlockPerLevel(updateDto.getSpellBlockPerLevel());
        stat.setAttackDamage(updateDto.getAttackDamage());
        stat.setAttackDamagePerLevel(updateDto.getAttackDamagePerLevel());
        stat.setAttackRange(updateDto.getAttackRange());
        stat.setAttackSpeed(updateDto.getAttackSpeed());
        stat.setAttackSpeedPerLevel(updateDto.getAttackSpeedPerLevel());
        stat.setCrit(updateDto.getCrit());
        stat.setCritPerLevel(updateDto.getCritPerLevel());
        stat.setMoveSpeed(updateDto.getMoveSpeed());
        stat.setLolInfo(lolInfo);
    }

    public static void updateChampion(Champion champion, ChampionUpdateDto updateDto) {
        champion.setKey(updateDto.getKey());
        champion.setName(updateDto.getName());
        champion.setRiotId(updateDto.getRiotId());
    }

}
