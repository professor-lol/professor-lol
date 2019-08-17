package com.css.professorlol;

import com.css.professorlol.domain.champion.ChampionFactory;

import java.io.File;
import java.io.IOException;

public interface PatchNoteCrawler {

    ChampionFactory getChampionPatchById(Long id) throws IOException;

    ChampionFactory getChampionPatchByHtml(File html) throws IOException;
}
