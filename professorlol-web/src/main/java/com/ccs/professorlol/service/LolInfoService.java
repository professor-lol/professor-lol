package com.ccs.professorlol.service;

import com.ccs.professorlol.ddragon.DdragonRestTemplate;
import com.ccs.professorlol.ddragon.dto.RealmsDto;
import com.ccs.professorlol.ddragon.dto.champion.DdragonChampionSimplesDto;
import com.ccs.professorlol.ddragon.dto.champion.DdragonChampionStandAloneDto;
import com.ccs.professorlol.ddragon.dto.champion.StatDto;
import com.ccs.professorlol.lolInfo.LolInfo;
import com.ccs.professorlol.lolInfo.LolInfoRepository;
import com.ccs.professorlol.lolInfo.LolInfoSaveDto;
import com.ccs.professorlol.lolInfo.champion.Champion;
import com.ccs.professorlol.lolInfo.champion.ChampionRepository;
import com.ccs.professorlol.lolInfo.champion.Stat;
import com.ccs.professorlol.lolInfo.champion.StatRepository;
import com.ccs.professorlol.lolInfo.champion.dto.ChampionSaveDto;
import com.ccs.professorlol.lolInfo.champion.dto.StatSaveDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class LolInfoService {

    private final DdragonRestTemplate ddragonRestTemplate;
    private final LolInfoRepository lolInfoRepository;
    private final ChampionRepository championRepository;
    private final StatRepository statRepository;

    @Transactional
    public boolean saveDdragonData() {
        RealmsDto currentRealms = ddragonRestTemplate.getCurrentRealms();
        String currentChampionVersion = currentRealms.getChampionVersion();

        LolInfo lolInfo = lolInfoRepository.findByPatchNoteVersion(currentChampionVersion)
                .orElse(makeLolInfo(currentChampionVersion));

        if (alreadySaved(lolInfo)) {
            return false;
        }

        DdragonChampionSimplesDto championSimples = ddragonRestTemplate.getChampionSimples(currentChampionVersion);
        List<DdragonChampionStandAloneDto> champions = championSimples.getChampions();

        champions.forEach(champion -> saveStat(lolInfo, champion));
        return true;
    }

    private boolean alreadySaved(LolInfo lolInfo) {
        return lolInfo.getId() != null;
    }

    private void saveStat(LolInfo lolInfo, DdragonChampionStandAloneDto championDto) {
        Champion champion = championRepository.findByName(championDto.getName())
                .orElse(makeChampion(championDto));

        StatDto statDto = championDto.getStats();
        Stat stat = makeStat(lolInfo, champion, statDto);

        statRepository.save(stat);
    }

    private Stat makeStat(LolInfo lolInfo, Champion champion, StatDto statDto) {
        return StatSaveDto.builder()
                .hp(statDto.getHp())
                .hpPerLevel(statDto.getHpperlevel())
                .mp(statDto.getMp())
                .mpPerLevel(statDto.getMpperlevel())
                .moveSpeed(statDto.getMovespeed())
                .armor(statDto.getArmor())
                .armorPerLevel(statDto.getArmorperlevel())
                .spellBlock(statDto.getSpellblock())
                .spellBlockPerLevel(statDto.getSpellblockperlevel())
                .attackRange(statDto.getAttackrange())
                .hpRegen(statDto.getHpregen())
                .hpRegenPerLevel(statDto.getHpregenperlevel())
                .mpRegen(statDto.getMpregen())
                .mpRegenPerLevel(statDto.getMpregenperlevel())
                .crit(statDto.getCrit())
                .critPerLevel(statDto.getCritperlevel())
                .attackDamage(statDto.getAttackdamage())
                .attackDamagePerLevel(statDto.getAttackdamageperlevel())
                .attackSpeed(statDto.getAttackspeed())
                .attackSpeedPerLevel(statDto.getAttackspeedperlevel())
                .build()
                .toEntity(lolInfo, champion);
    }

    private Champion makeChampion(DdragonChampionStandAloneDto championDto) {
        return ChampionSaveDto.builder()
                .id(championDto.getId())
                .key(championDto.getKey())
                .name(championDto.getName())
                .build()
                .toEntity();
    }

    private LolInfo makeLolInfo(String currentChampionVersion) {
        return LolInfoSaveDto.builder()
                .patchNoteVersion(currentChampionVersion)
                .build()
                .toEntity();
    }

}
