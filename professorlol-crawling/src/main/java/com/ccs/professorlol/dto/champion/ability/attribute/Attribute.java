package com.ccs.professorlol.dto.champion.ability.attribute;

import com.ccs.professorlol.type.AttributeType;
import lombok.Builder;
import lombok.Getter;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import static com.ccs.professorlol.dto.champion.ability.attribute.AttributeSelector.*;
import static com.ccs.professorlol.util.ElementContextUtil.getTextFromCssSelector;
import static com.ccs.professorlol.util.ElementContextUtil.getTextFromElement;

@Getter
public class Attribute {

    private static final String ATTRIBUTE_EXTRA_STRING = ":";
    private static final String EMPTY_STRING = "";

    private AttributeType attributeType;
    private String attribute;
    private String beforeContent;
    private String afterContent;

    @Builder
    private Attribute(AttributeType attributeType, String attribute, String beforeContent, String afterContent) {
        this.attributeType = attributeType;
        this.attribute = attribute;
        this.beforeContent = beforeContent;
        this.afterContent = afterContent;
    }

    public static Attribute ofChange(Element element) {
        return Attribute.builder()
                .attribute(getAttributeTextClearly(element))
                .beforeContent(getTextFromCssSelector(element, BEFORE.getCssQuery()))
                .afterContent(getTextFromCssSelector(element, AFTER.getCssQuery()))
                .attributeType(AttributeType.CHANGE)
                .build();
    }

    public static Attribute ofNew(Element element) {
        return Attribute.builder()
                .attribute(getAttributeTextClearly(element))
                .afterContent(getTextFromCssSelector(element, AFTER.getCssQuery()))
                .attributeType(AttributeType.NEW)
                .build();
    }

    public static Attribute ofRemove(Element element) {
        return Attribute.builder()
                .attribute(getAttributeTextClearly(element))
                .afterContent(getTextFromCssSelector(element, REMOVE.getCssQuery()))
                .attributeType(AttributeType.REMOVE)
                .build();
    }

    private static String getAttributeTextClearly(org.jsoup.nodes.Element element) {
        Elements selectElements = element.select(ATTRIBUTE.getCssQuery());
        Elements destroyElements = element.select(ATTRIBUTE_EXTRA.getCssQuery());
        destroyElements.remove();
        return getTextFromElement(selectElements).replace(ATTRIBUTE_EXTRA_STRING, EMPTY_STRING);
    }
}
