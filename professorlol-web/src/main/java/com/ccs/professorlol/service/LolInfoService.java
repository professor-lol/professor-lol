package com.ccs.professorlol.service;

import com.ccs.professorlol.dto.lolinfo.ChampionResDto;
import com.ccs.professorlol.dto.lolinfo.ChampionSaveDto;
import com.ccs.professorlol.dto.lolinfo.LolInfoResDto;
import com.ccs.professorlol.dto.lolinfo.LolInfoSaveDto;
import com.ccs.professorlol.dto.lolinfo.StatResDto;
import com.ccs.professorlol.dto.lolinfo.StatSaveDto;
import com.ccs.professorlol.lolInfo.LolInfo;
import com.ccs.professorlol.lolInfo.LolInfoRepository;
import com.ccs.professorlol.lolInfo.champion.Champion;
import com.ccs.professorlol.lolInfo.champion.ChampionRepository;
import com.ccs.professorlol.lolInfo.champion.StatRepository;
import com.ccs.professorlol.lolInfo.exception.AlreadyExistException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

// TODO : exception 처리
@Service
@RequiredArgsConstructor
public class LolInfoService {

    private final ChampionRepository championRepository;
    private final LolInfoRepository lolInfoRepository;
    private final StatRepository statRepository;

    // 롤 버전 정보 저장
    @Transactional
    public LolInfoResDto saveLolInfo(LolInfoSaveDto lolInfoSaveDto) {
        lolInfoRepository.findByPatchNoteVersion(lolInfoSaveDto.getPatchNoteVersion())
                .ifPresent(this::existLolInfoException);

        LolInfo lolInfo = lolInfoRepository.save(lolInfoSaveDto.toEntity());
        return LolInfoResDto.of(lolInfo);
    }

    private void existLolInfoException(LolInfo lolInfo) {
        throw new AlreadyExistException(lolInfo.getPatchNoteVersion());
    }

    // 챔피언 정보 저장
    @Transactional
    public ChampionResDto saveChampion(ChampionSaveDto championSaveDto) {
        championRepository.findByName(championSaveDto.getName())
                .ifPresent(this::existChampionException);

        Champion champion = championRepository.save(championSaveDto.toEntity());
        return ChampionResDto.of(champion, champion.getStats());
    }

    private void existChampionException(Champion champion) {
        throw new AlreadyExistException(champion.getName());
    }

    // 챔피언 스탯 정보 저장
    @Transactional
    public StatResDto saveStat(StatSaveDto statSaveDto, Long championId, Long lolInfoId) {
        Champion champion = championRepository.findById(championId)
                .orElseThrow(RuntimeException::new);
        LolInfo lolInfo = lolInfoRepository.findById(lolInfoId)
                .orElseThrow(RuntimeException::new);

        champion.addStat(statSaveDto.toEntity(lolInfo));

        return StatResDto.of(champion.getStats().get(0));
    }
}
