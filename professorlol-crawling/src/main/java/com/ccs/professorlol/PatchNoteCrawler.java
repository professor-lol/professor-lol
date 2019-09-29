package com.ccs.professorlol;

import com.ccs.professorlol.dto.champion.Champion;

import java.util.List;

public interface PatchNoteCrawler {
    List<Champion> findChampionPatchById(Long id);
}
