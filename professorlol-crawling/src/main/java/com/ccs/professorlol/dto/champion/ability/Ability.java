package com.ccs.professorlol.dto.champion.ability;


import com.ccs.professorlol.dto.champion.ability.attribute.Attribute;
import com.ccs.professorlol.dto.champion.ability.attribute.AttributeParser;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.jsoup.select.Elements;

import java.util.List;

import static com.ccs.professorlol.dto.champion.ability.Ability.AbilitySelector.*;
import static com.ccs.professorlol.util.ElementContextUtil.getTextFromCssSelector;
import static com.ccs.professorlol.util.ElementContextUtil.getUrlFromCssSelector;


@Builder
@AllArgsConstructor
@Getter
public class Ability {  //스킬 .change-detail-title .attribute-title

    //기본 능력치는 .change-detail-title

    private String title;           // 스킬 명 .attribute-detail-title .attribute-title
    private String image;           // 스킬 이미지   img src

    private List<Attribute> attributes;


    public static Ability of(Elements elements) {

        Elements attributeElements = elements.select(ATTRIBUTE_CHANGE.getCssQuery());

        return Ability.builder()
                .title(getTextFromCssSelector(elements, TITLE.getCssQuery()))
                .image(getUrlFromCssSelector(elements, IMAGE.getCssQuery()))
                .attributes(AttributeParser.parse(attributeElements))
                .build();
    }

    @Getter
    @RequiredArgsConstructor
    enum AbilitySelector {

        TITLE(".change-detail-title"),
        IMAGE(".change-detail-title img"),
        ATTRIBUTE_CHANGE(".attribute-change");

        private final String cssQuery;
    }


}
