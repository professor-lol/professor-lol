package com.ccs.professorlol.dto.champion;

import org.jsoup.nodes.Element;

import static com.ccs.professorlol.util.ElementContextUtil.getTextFromCssSelector;
import static com.ccs.professorlol.util.ElementContextUtil.getUrlFromCssSelector;


public class ChampionMapper {

    public static Champion convert(Element element) {
        return Champion.builder()
                .name(getTextFromCssSelector(element, NAME.cssQuery))
                .summary(getTextFromCssSelector(element, SUMMARY.cssQuery))
                .context(getTextFromCssSelector(element, CONTEXT.cssQuery))
                .image(getUrlFromCssSelector(element, IMAGE.cssQuery))
                .abilities(AbilityParser.of(element))
                .build();
    }

}
