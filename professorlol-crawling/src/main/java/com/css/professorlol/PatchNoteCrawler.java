package com.css.professorlol;

import com.css.professorlol.domain.champion.Champion;

import java.util.List;

public interface PatchNoteCrawler {
    List<Champion> getChampionPatchById(Long id);
}
