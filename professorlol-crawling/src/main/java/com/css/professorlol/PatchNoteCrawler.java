package com.css.professorlol;

import com.css.professorlol.domain.champion.ChampionFactory;

import java.io.IOException;

public interface PatchNoteCrawler {

    ChampionFactory getChampionPatchById(Long id) throws IOException;


}
