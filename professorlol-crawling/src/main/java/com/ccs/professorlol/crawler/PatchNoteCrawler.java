package com.ccs.professorlol.crawler;

import com.ccs.professorlol.dto.champion.Champion;

public interface PatchNoteCrawler {

    PatchResponseDto<Champion> findChampionPatchById(Long id);
}
