package com.ccs.professorlol.dto.bug;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.jsoup.nodes.Element;


@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BugFix {
    private String context; //버그 설명 <li>

    @Builder
    private BugFix(String context) {
        this.context = context;
    }

    public static BugFix of(Element element) {
        return BugFix.builder()
                .context(element.text())
                .build();
    }
}
