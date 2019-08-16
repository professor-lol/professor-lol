package com.css.professorlol.domain.champion;

import com.css.professorlol.domain.champion.ability.AbilityFactory;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import static com.css.professorlol.domain.champion.ChampionMapper.ChampionSelector.*;
import static com.css.professorlol.jsoupUtil.ElementContextUtil.getTextFromCssSelector;
import static com.css.professorlol.jsoupUtil.ElementContextUtil.getUrlFromCssSelector;

public class ChampionMapper {

    static Champion of(Element element) {

        Elements abilitiesElements = element.select(CONTEXT.cssQuery).nextAll();

        return Champion.builder()
                .name(getTextFromCssSelector(element, NAME.cssQuery))
                .summary(getTextFromCssSelector(element, SUMMARY.cssQuery))
                .context(getTextFromCssSelector(element, CONTEXT.cssQuery))
                .image(getUrlFromCssSelector(element, IMAGE.cssQuery))
                .abilities(AbilityFactory.of(abilitiesElements))
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
