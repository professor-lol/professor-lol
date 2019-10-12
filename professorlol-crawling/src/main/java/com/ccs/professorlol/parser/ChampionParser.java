package com.ccs.professorlol.parser;

import com.ccs.professorlol.dto.champion.Champion;
import org.jsoup.nodes.Document;

import java.util.List;
import java.util.stream.Collectors;


public class ChampionParser implements PatchNoteParser<Champion> {
    private static final String CONTENT_BORDER = ".content-border .patch-change-block";


    @Override
    public List<Champion> parse(Document document) {
        return document.select(CONTENT_BORDER).stream()
                .map(Champion::of)
                .collect(Collectors.toList());
    }
}
