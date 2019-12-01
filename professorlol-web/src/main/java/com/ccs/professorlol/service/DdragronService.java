package com.ccs.professorlol.service;

import com.ccs.professorlol.ddragon.DdragonRestTemplate;
import com.ccs.professorlol.ddragon.dto.RealmsDto;
import com.ccs.professorlol.ddragon.dto.champion.DdragonChampionSimplesDto;
import com.ccs.professorlol.ddragon.dto.champion.DdragonChampionStandAloneDto;
import com.ccs.professorlol.ddragon.dto.champion.StatDto;
import com.ccs.professorlol.dto.lolinfo.LolInfoSaveDto;
import com.ccs.professorlol.dto.lolinfo.champion.ChampionSaveDto;
import com.ccs.professorlol.dto.lolinfo.stat.StatSaveDto;
import com.ccs.professorlol.lolInfo.LolInfo;
import com.ccs.professorlol.lolInfo.LolInfoRepository;
import com.ccs.professorlol.lolInfo.champion.Champion;
import com.ccs.professorlol.lolInfo.champion.Stat;
import com.ccs.professorlol.lolInfo.champion.repository.ChampionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DdragronService {

    private final DdragonRestTemplate ddragonRestTemplate;
    private final LolInfoRepository lolInfoRepository;
    private final ChampionRepository championRepository;

    // 스케쥴링을 통해 호출되는 메소드
    @Transactional
    public void saveDdragonData() {
        RealmsDto currentRealms = ddragonRestTemplate.getCurrentRealms();
        String currentChampionVersion = currentRealms.getChampionVersion();

        lolInfoRepository.findByPatchNoteVersion(currentChampionVersion)
                .ifPresent(LolInfo::alreadySavedException);

        LolInfo lolInfo = lolInfoRepository.save(LolInfoSaveDto.makeLolInfo(currentChampionVersion));

        DdragonChampionSimplesDto championSimples = ddragonRestTemplate.getChampionSimples(currentChampionVersion);
        List<DdragonChampionStandAloneDto> ddragonChampionStandAloneDtos = championSimples.getChampions();

        ddragonChampionStandAloneDtos.forEach(championStandAloneDto -> addStat(championStandAloneDto, lolInfo));
    }

    private void addStat(DdragonChampionStandAloneDto championStandAloneDto, LolInfo lolInfo) {
        Champion champion = championRepository.findByName(championStandAloneDto.getName())
                .orElseGet(() -> ChampionSaveDto.makeChampion(championStandAloneDto));

        StatDto statDto = championStandAloneDto.getStats();
        Stat stat = StatSaveDto.makeStat(lolInfo, statDto);
        champion.addStat(stat);

        championRepository.save(champion);
    }
}
