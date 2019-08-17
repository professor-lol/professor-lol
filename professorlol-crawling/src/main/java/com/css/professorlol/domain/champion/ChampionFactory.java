package com.css.professorlol.domain.champion;


import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.List;
import java.util.stream.Collectors;

public class ChampionFactory {

    private static final String CONTENT_BORDER = ".content-border .patch-change-block";
    private List<Champion> champions;

    // TODO : 고민!!!

    public ChampionFactory(Document document) {
        Elements contentBorder = document.select(CONTENT_BORDER);

        this.champions = contentBorder.stream()
                .map(ChampionMapper::of)
                .collect(Collectors.toList());
    }

    public List<Champion> getChampions() {
        return champions;
    }
}
