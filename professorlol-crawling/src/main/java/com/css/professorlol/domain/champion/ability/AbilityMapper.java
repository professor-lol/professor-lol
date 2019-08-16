package com.css.professorlol.domain.champion.ability;

import com.css.professorlol.domain.champion.ability.attribute.AttributeFactory;
import org.jsoup.select.Elements;

import static com.css.professorlol.domain.champion.ability.AbilityMapper.AbilitySelector.IMAGE;
import static com.css.professorlol.domain.champion.ability.AbilityMapper.AbilitySelector.TITLE;
import static com.css.professorlol.domain.champion.ability.attribute.AttributeFactory.ofNews;
import static com.css.professorlol.domain.champion.ability.attribute.AttributeFactory.ofRemoves;
import static com.css.professorlol.jsoupUtil.ElementContextUtil.getTextFromCssSelector;
import static com.css.professorlol.jsoupUtil.ElementContextUtil.getUrlFromCssSelector;


class AbilityMapper {

    public static Ability of(Elements elements) {

        Elements attributeElements = elements.select(".attribute-change");

        return Ability.builder()
                .title(getTextFromCssSelector(elements, TITLE.cssQuery))
                .image(getUrlFromCssSelector(elements, IMAGE.cssQuery))
                .changes(AttributeFactory.ofChanges(attributeElements))
                .news(ofNews(attributeElements))
                .removes(ofRemoves(attributeElements))
                .build();
    }

    enum AbilitySelector {

        TITLE(".change-detail-title"),
        IMAGE(".change-detail-title img"),
        ATTRIBUTE_CHANGE(".attribute_change");

        private String cssQuery;

        AbilitySelector(String cssQuery) {
            this.cssQuery = cssQuery;
        }
    }

}
