package com.css.professorlol.domain.champion;

import com.css.professorlol.domain.champion.ability.AbilityFactory;
import org.jsoup.nodes.Element;

import static com.css.professorlol.domain.champion.ChampionMapper.ChampionSelector.*;
import static com.css.professorlol.util.ElementContextUtil.getTextFromCssSelector;
import static com.css.professorlol.util.ElementContextUtil.getUrlFromCssSelector;

public class ChampionMapper {

    public static Champion convert(Element element) {

        return Champion.builder()
                .name(getTextFromCssSelector(element, NAME.cssQuery))
                .summary(getTextFromCssSelector(element, SUMMARY.cssQuery))
                .context(getTextFromCssSelector(element, CONTEXT.cssQuery))
                .image(getUrlFromCssSelector(element, IMAGE.cssQuery))
                .abilities(AbilityFactory.of(element))
                .build();
    }


    protected enum ChampionSelector {
        NAME(".change-title a"),
        SUMMARY(".summary"),
        CONTEXT(".context"),
        IMAGE(".reference-link img");

        private String cssQuery;

        ChampionSelector(String cssQuery) {
            this.cssQuery = cssQuery;
        }
    }

}
