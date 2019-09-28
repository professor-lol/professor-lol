package com.css.professorlol.dto.bug;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.List;
import java.util.stream.Collectors;

public class BugFixFactory {

    private static final String CONTENT_BORDER = ".content-border .white-stone ul li";
    private List<BugFix> bugFixes;

    public BugFixFactory(Document document) {
        Elements elements = document.select(CONTENT_BORDER);
        this.bugFixes = elements.stream()
                .filter(element -> element.select("a").size() == 0) //신챔 제외
                .map(BugFixMapper::convert)
                .collect(Collectors.toList());
    }

    public List<BugFix> getBugFixes() {
        return this.bugFixes;
    }
}
