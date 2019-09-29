package com.ccs.professorlol.dto.champion;

import com.ccs.professorlol.dto.champion.ability.AbilityFactory;
import com.ccs.professorlol.util.ElementContextUtil;
import org.jsoup.nodes.Element;

import static com.ccs.professorlol.dto.champion.ChampionMapper.ChampionSelector.CONTEXT;
import static com.ccs.professorlol.dto.champion.ChampionMapper.ChampionSelector.IMAGE;
import static com.ccs.professorlol.dto.champion.ChampionMapper.ChampionSelector.NAME;
import static com.ccs.professorlol.dto.champion.ChampionMapper.ChampionSelector.SUMMARY;

public class ChampionMapper {

    public static Champion convert(Element element) {

        return Champion.builder()
                .name(ElementContextUtil.getTextFromCssSelector(element, NAME.cssQuery))
                .summary(ElementContextUtil.getTextFromCssSelector(element, SUMMARY.cssQuery))
                .context(ElementContextUtil.getTextFromCssSelector(element, CONTEXT.cssQuery))
                .image(ElementContextUtil.getUrlFromCssSelector(element, IMAGE.cssQuery))
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
