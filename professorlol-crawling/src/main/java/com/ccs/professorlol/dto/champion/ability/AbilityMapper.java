package com.ccs.professorlol.dto.champion.ability;

import com.ccs.professorlol.dto.champion.ability.attribute.AttributeFactory;
import com.ccs.professorlol.util.ElementContextUtil;
import org.jsoup.select.Elements;

import static com.ccs.professorlol.dto.champion.ability.AbilityMapper.AbilitySelector.ATTRIBUTE_CHANGE;
import static com.ccs.professorlol.dto.champion.ability.AbilityMapper.AbilitySelector.IMAGE;
import static com.ccs.professorlol.dto.champion.ability.AbilityMapper.AbilitySelector.TITLE;


public class AbilityMapper {

    public static Ability convert(Elements elements) {

        Elements attributeElements = elements.select(ATTRIBUTE_CHANGE.cssQuery);

        return Ability.builder()
                .title(ElementContextUtil.getTextFromCssSelector(elements, TITLE.cssQuery))
                .image(ElementContextUtil.getUrlFromCssSelector(elements, IMAGE.cssQuery))
                .changes(AttributeFactory.ofChanges(attributeElements))
                .news(AttributeFactory.ofNews(attributeElements))
                .removes(AttributeFactory.ofRemoves(attributeElements))
                .build();
    }

    protected enum AbilitySelector {

        TITLE(".change-detail-title"),
        IMAGE(".change-detail-title img"),
        ATTRIBUTE_CHANGE(".attribute-change");

        private String cssQuery;

        AbilitySelector(String cssQuery) {
            this.cssQuery = cssQuery;
        }
    }

}
