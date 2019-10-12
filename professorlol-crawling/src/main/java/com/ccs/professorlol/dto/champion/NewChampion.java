package com.ccs.professorlol.dto.champion;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.ccs.professorlol.dto.champion.ChampionSelector.*;
import static com.ccs.professorlol.util.ElementContextUtil.*;

@Getter
@ToString
public class NewChampion { // 신챔같은 경우는 attribute가 없어서 일단 상속관계는 뺏음

    private String name;
    private String image;
    private String summary;
    private String context;
    private List<LinkGroup> linkGroups;

    @Builder
    public NewChampion(String name, String image, String summary, String context, List<LinkGroup> linkGroups) {
        this.name = name;
        this.image = image;
        this.summary = summary;
        this.context = context;
        this.linkGroups = linkGroups;
    }

    public static NewChampion of(Element element) {
        return NewChampion.builder()
                .name(getTextFromCssSelector(element, NAME.getCssQuery()))
                .summary(getTextFromCssSelector(element, SUMMARY.getCssQuery()))
                .context(getTextFromCssSelector(element, CONTEXT.getCssQuery()))
                .image(getUrlFromCssSelector(element, IMAGE.getCssQuery()))
                .linkGroups(parse(element, LINK.getCssQuery()))
                .build();
    }

    private static List<LinkGroup> parse(@NonNull Element element, String cssSelector) {
        if (element.select(cssSelector).isEmpty()) {
            return new ArrayList<>();
        }

        return element.select(cssSelector).stream()
                .map(LinkGroup::of)
                .collect(Collectors.toList());
    }


    @Getter
    static public class LinkGroup {
        private String content;
        private String url;

        @Builder
        private LinkGroup(String content, String url) {
            this.content = content;
            this.url = url;
        }

        static LinkGroup of(Element element) {
            return LinkGroup.builder()
                    .content(element.text())
                    .url(getLinkElement(element))
                    .build();
        }
    }
}
