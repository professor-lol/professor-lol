package com.ccs.professorlol;

import com.ccs.professorlol.dto.champion.ChampionDto;

public interface PatchNoteCrawler {

    PatchResponseDto<ChampionDto> findChampionPatchById(Long id);
}
