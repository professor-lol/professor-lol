package com.css.professorlol;

import com.css.professorlol.dto.champion.Champion;

import java.util.List;

public interface PatchNoteCrawler {
    List<Champion> findChampionPatchById(Long id);
}
