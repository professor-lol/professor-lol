package com.ccs.professorlol;

import com.ccs.professorlol.dto.champion.Champion;

public interface PatchNoteCrawler {

    PatchResponseDto<Champion> findChampionPatchById(Long id);
}
