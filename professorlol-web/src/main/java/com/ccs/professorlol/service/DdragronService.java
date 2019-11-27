package com.ccs.professorlol.service;

import com.ccs.professorlol.ddragon.DdragonRestTemplate;
import com.ccs.professorlol.ddragon.dto.RealmsDto;
import com.ccs.professorlol.ddragon.dto.champion.DdragonChampionSimplesDto;
import com.ccs.professorlol.ddragon.dto.champion.DdragonChampionStandAloneDto;
import com.ccs.professorlol.ddragon.dto.champion.StatDto;
import com.ccs.professorlol.dto.lolinfo.ChampionSaveDto;
import com.ccs.professorlol.dto.lolinfo.LolInfoSaveDto;
import com.ccs.professorlol.dto.lolinfo.StatSaveDto;
import com.ccs.professorlol.lolInfo.LolInfo;
import com.ccs.professorlol.lolInfo.LolInfoRepository;
import com.ccs.professorlol.lolInfo.champion.Champion;
import com.ccs.professorlol.lolInfo.champion.Stat;
import com.ccs.professorlol.lolInfo.champion.repository.ChampionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DdragronService {

    private final DdragonRestTemplate ddragonRestTemplate;
    private final LolInfoRepository lolInfoRepository;
    private final ChampionRepository championRepository;

    @Transactional
    public void saveDdragonData() {
        RealmsDto currentRealms = ddragonRestTemplate.getCurrentRealms();
        String currentChampionVersion = currentRealms.getChampionVersion();

        lolInfoRepository.findByPatchNoteVersion(currentChampionVersion)
                .ifPresent(LolInfo::alreadySavedException);
        LolInfo lolInfo = lolInfoRepository.save(LolInfoSaveDto.makeLolInfo(currentChampionVersion));

        DdragonChampionSimplesDto championSimples = ddragonRestTemplate.getChampionSimples(currentChampionVersion);
        List<DdragonChampionStandAloneDto> ddragonChampionStandAloneDtos = championSimples.getChampions();

        ddragonChampionStandAloneDtos.forEach(championStandAloneDto -> saveStat(lolInfo, championStandAloneDto));
    }

    private void saveStat(LolInfo lolInfo, DdragonChampionStandAloneDto championStandAloneDto) {
        Champion champion = championRepository.findByName(championStandAloneDto.getName())
                .orElseGet(() -> championRepository.save(ChampionSaveDto.makeChampion(championStandAloneDto)));

        StatDto statDto = championStandAloneDto.getStats();
        Stat stat = StatSaveDto.makeStat(lolInfo, statDto);

        champion.addStat(stat);
    }

}
