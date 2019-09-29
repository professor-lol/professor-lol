package com.css.professorlol.dto.champion.ability;

import com.css.professorlol.dto.champion.ability.attribute.AttributeFactory;
import org.jsoup.select.Elements;

import static com.css.professorlol.dto.champion.ability.AbilityMapper.AbilitySelector.*;
import static com.css.professorlol.dto.champion.ability.attribute.AttributeFactory.ofNews;
import static com.css.professorlol.dto.champion.ability.attribute.AttributeFactory.ofRemoves;
import static com.css.professorlol.util.ElementContextUtil.getTextFromCssSelector;
import static com.css.professorlol.util.ElementContextUtil.getUrlFromCssSelector;


public class AbilityMapper {

    public static Ability convert(Elements elements) {

        Elements attributeElements = elements.select(ATTRIBUTE_CHANGE.cssQuery);

        return Ability.builder()
                .title(getTextFromCssSelector(elements, TITLE.cssQuery))
                .image(getUrlFromCssSelector(elements, IMAGE.cssQuery))
                .changes(AttributeFactory.ofChanges(attributeElements))
                .news(ofNews(attributeElements))
                .removes(ofRemoves(attributeElements))
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