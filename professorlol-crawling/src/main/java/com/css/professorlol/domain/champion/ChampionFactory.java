package com.css.professorlol.domain.champion;


import org.jsoup.select.Elements;

import java.util.List;
import java.util.stream.Collectors;

public class ChampionFactory {

    private List<Champion> champions;

    public ChampionFactory(Elements contentBorder) {
        this.champions = contentBorder.stream()
                .map(ChampionMapper::of)
                .collect(Collectors.toList());
    }

    public List<Champion> getChampions() {
        return champions;
    }
}
