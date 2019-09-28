package com.css.professorlol.dto.bug;

import org.jsoup.nodes.Element;

public class BugFixMapper {

    public static BugFix convert(Element element) {
        return BugFix.builder()
                .context(element.text())
                .build();
    }
}
