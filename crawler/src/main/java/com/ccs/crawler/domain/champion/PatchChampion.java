package com.ccs.crawler.domain.champion;

import com.ccs.crawler.parser.JsoupParser;

import java.util.List;
import java.util.stream.Collectors;


public class PatchChampion {
    private List<Champion> champions;

    public PatchChampion(List<String> contentBorder) {
        this.champions = contentBorder.stream()
                .map(JsoupParser::new)
                .map(c -> new Champion()
                        .name(c.single(".change-title a", "text"))
                        .summary(c.single(".summary", "text"))
                        .context(c.single(".context", "text"))
                        .image(c.single(".reference-link img", "src"))
                        .build()
                )
                .collect(Collectors.toList());

    }
}
