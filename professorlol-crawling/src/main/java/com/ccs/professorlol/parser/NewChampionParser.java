package com.ccs.professorlol.parser;

import com.ccs.professorlol.dto.champion.NewChampion;
import org.jsoup.nodes.Document;

import java.util.List;
import java.util.stream.Collectors;

public class NewChampionParser implements PatchNoteParser<NewChampion> {

    private static final String CONTENT_BORDER = ".content-border .patch-change-block";
    private static final String EXTRACT_NEW_CHAMPION_TAG = "li a";

    @Override
    public List<NewChampion> parse(Document document) {
        return document.select(CONTENT_BORDER).stream()
                .filter(element -> element.select(EXTRACT_NEW_CHAMPION_TAG).size() > 0) //신챔만 골라내기
                .map(NewChampion::of)
                .collect(Collectors.toList());
    }
}
