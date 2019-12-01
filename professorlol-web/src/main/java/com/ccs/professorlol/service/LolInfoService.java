package com.ccs.professorlol.service;

import com.ccs.professorlol.dto.lolinfo.LolInfoResDto;
import com.ccs.professorlol.dto.lolinfo.LolInfoSaveDto;
import com.ccs.professorlol.dto.lolinfo.LolInfoUpdateDto;
import com.ccs.professorlol.dto.lolinfo.champion.ChampionResDto;
import com.ccs.professorlol.dto.lolinfo.champion.ChampionSaveDto;
import com.ccs.professorlol.dto.lolinfo.champion.ChampionUpdateDto;
import com.ccs.professorlol.dto.lolinfo.stat.StatResDto;
import com.ccs.professorlol.dto.lolinfo.stat.StatSaveDto;
import com.ccs.professorlol.dto.lolinfo.stat.StatUpdateDto;
import com.ccs.professorlol.lolInfo.LolInfo;
import com.ccs.professorlol.lolInfo.LolInfoRepository;
import com.ccs.professorlol.lolInfo.champion.Champion;
import com.ccs.professorlol.lolInfo.champion.Stat;
import com.ccs.professorlol.lolInfo.champion.StatRepository;
import com.ccs.professorlol.lolInfo.champion.repository.ChampionRepository;
import com.ccs.professorlol.lolInfo.exception.NotExistEntityException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


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
                .ifPresent(LolInfo::alreadySavedException);

        LolInfo lolInfo = lolInfoRepository.save(lolInfoSaveDto.toEntity());
        return LolInfoResDto.of(lolInfo);
    }

    // 롤 버전 정보 수정
    @Transactional
    public LolInfoResDto updateLolInfo(LolInfoUpdateDto updateDto) {
        LolInfo lolInfo = lolInfoRepository.findByPatchNoteVersion(updateDto.getSavedPatchVersion())
                .orElseThrow(() -> new NotExistEntityException(updateDto.getSavedPatchVersion()));

        LolInfoUpdater.updateLolInfo(lolInfo, updateDto);

        return LolInfoResDto.of(lolInfo);
    }

    // 챔피언 정보 저장
    @Transactional
    public ChampionResDto saveChampion(ChampionSaveDto championSaveDto) {
        championRepository.findByName(championSaveDto.getName())
                .ifPresent(Champion::alreadySavedException);

        Champion champion = championRepository.save(championSaveDto.toEntity());
        return ChampionResDto.of(champion, champion.getStats());
    }

    // 챔피언 정보 수정
    @Transactional
    public ChampionResDto updateChampion(ChampionUpdateDto updateDto) {
        Champion champion = championRepository.findById(updateDto.getId())
                .orElseThrow(() -> new NotExistEntityException(updateDto.getId()));

        LolInfoUpdater.updateChampion(champion, updateDto);

        return ChampionResDto.of(champion);
    }

    // 챔피언 스탯 정보 저장
    @Transactional
    public StatResDto saveStat(StatSaveDto statSaveDto, Long championId, Long lolInfoId) {
        Champion champion = championRepository.findById(championId)
                .orElseThrow(() -> new NotExistEntityException(championId));
        LolInfo lolInfo = lolInfoRepository.findById(lolInfoId)
                .orElseThrow(() -> new NotExistEntityException(lolInfoId));

        champion.addStat(statSaveDto.toEntity(lolInfo));

        return StatResDto.of(champion.getLatestStat());
    }

    // 스탯 정보 수정
    @Transactional
    public StatResDto updateStat(StatUpdateDto statUpdateDto) {
        Stat stat = statRepository.findById(statUpdateDto.getId())
                .orElseThrow(() -> new NotExistEntityException(statUpdateDto.getId()));
        LolInfo lolInfo = lolInfoRepository.findByPatchNoteVersion(statUpdateDto.getLolInfoVersion())
                .orElseThrow(() -> new NotExistEntityException(statUpdateDto.getLolInfoVersion()));

        LolInfoUpdater.updateStat(stat, statUpdateDto, lolInfo);

        return StatResDto.of(stat);
    }
}
