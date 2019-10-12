package com.ccs.professorlol.parser;

import com.ccs.professorlol.dto.bug.BugFix;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.util.List;
import java.util.stream.Collectors;

public class BugFixParser implements PatchNoteParser<BugFix> {

    private static final String CONTENT_BORDER = ".content-border .white-stone ul li";
    private static final String EXTRACT_NEW_CHAMPION_TAG = "a";

    public List<BugFix> parse(Document document) {
        return document.select(CONTENT_BORDER).stream()
                .filter(this::isOldChamp) //신챔 제외
                .map(BugFix::of)
                .collect(Collectors.toList());
    }

    private boolean isOldChamp(Element element) {
        return element.select(EXTRACT_NEW_CHAMPION_TAG).size() == 0;
    }
}
