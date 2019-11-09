package com.ccs.professorlol.parser;

import com.ccs.professorlol.dto.champion.ChampionDto;
import org.jsoup.nodes.Document;

import java.util.List;
import java.util.stream.Collectors;


public class ChampionParser implements PatchNoteParser<ChampionDto> {
    private static final String CONTENT_BORDER = ".content-border .patch-change-block";


    @Override
    public List<ChampionDto> parse(Document document) {
        return document.select(CONTENT_BORDER).stream()
                .map(ChampionDto::of)
                .collect(Collectors.toList());
    }
}
