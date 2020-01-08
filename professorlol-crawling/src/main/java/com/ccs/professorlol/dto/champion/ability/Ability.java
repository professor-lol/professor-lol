package com.ccs.professorlol.dto.champion.ability;


import com.ccs.professorlol.dto.champion.ability.attribute.Attribute;
import com.ccs.professorlol.dto.champion.ability.attribute.AttributeParser;
import com.ccs.professorlol.type.SkillType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.jsoup.select.Elements;

import java.util.List;

import static com.ccs.professorlol.dto.champion.ability.Ability.AbilitySelector.*;
import static com.ccs.professorlol.util.ElementContextUtil.getTextFromCssSelector;
import static com.ccs.professorlol.util.ElementContextUtil.getUrlFromCssSelector;


@Getter
public class Ability {  //스킬 .change-detail-title .attribute-title

    //기본 능력치는 .change-detail-title
    private static final String ATTRIBUTE_SPLITTER = "-";

    private String title;           // 스킬 명 .attribute-detail-title .attribute-title
    private String image;           // 스킬 이미지   img src
    private SkillType skillType;
    private List<Attribute> attributes;

    @Builder
    private Ability(String title, String image, List<Attribute> attributes) {
        if(hasSplitter(title)) {
            String[] splitAttributes = title.split(ATTRIBUTE_SPLITTER);
            this.skillType = SkillType.findBy(splitAttributes[0].trim());
            this.title = splitAttributes[1].trim();
        }else{
            this.skillType = SkillType.STAT;
            this.title = title.trim();
        }
        this.image = image;
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "{" +
                "\"title\" :\"" + title + '"' +
                ", \"image\" :\"" + image + '"' +
                ", \"skillType\" :\"" + skillType + '"' +
                ", \"attributes\" :" + attributes +
                '}';
    }

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

    private boolean hasSplitter(String attribute) {
        return attribute.contains(ATTRIBUTE_SPLITTER);
    }
}
