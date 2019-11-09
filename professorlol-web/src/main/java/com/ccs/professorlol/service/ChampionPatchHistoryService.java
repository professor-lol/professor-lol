package com.ccs.professorlol.service;


import com.ccs.professorlol.PatchNoteCrawler;
import com.ccs.professorlol.PatchResponseDto;
import com.ccs.professorlol.dto.champion.ChampionDto;
import com.ccs.professorlol.lolInfo.champion.Champion;
import com.ccs.professorlol.lolInfo.champion.ChampionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ChampionPatchHistoryService {


    private final PatchNoteCrawler patchNoteCrawler;

    //챔피언 리파지토리
    private final ChampionRepository championRepository;

    private final ChampionPatchHistoryConverter patchHistoryConverter;

    @Transactional
    public void createPatchHistory(Long patchNoteId) {
        PatchResponseDto<ChampionDto> patchResponseDto = patchNoteCrawler.findChampionPatchById(patchNoteId);
        List<Champion> champions = findAll(patchResponseDto.getPatch());

        patchHistoryConverter.convert(champions, patchResponseDto);
    }

    private List<Champion> findAll(List<ChampionDto> championDtoDtos) {
        List<String> championNames = championDtoDtos.stream()
                .map(ChampionDto::getName)
                .collect(Collectors.toList());

        return championRepository.findAllByNameIn(championNames);
    }

}
