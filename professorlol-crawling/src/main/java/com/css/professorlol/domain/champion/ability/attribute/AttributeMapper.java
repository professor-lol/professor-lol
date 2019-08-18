package com.css.professorlol.domain.champion.ability.attribute;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import static com.css.professorlol.domain.champion.ability.attribute.AttributeMapper.AttributeSelector.*;
import static com.css.professorlol.util.ElementContextUtil.getTextFromCssSelector;
import static com.css.professorlol.util.ElementContextUtil.getTextFromElement;

public class AttributeMapper {

    public static final String ATTRIBUTE_EXTRA_STRING = ":";
    public static final String EMPTY_STRING = "";

    protected static Change convertChange(Element element) {
        return Change.builder()
                .attribute(getAttributeTextClearly(element))
                .beforeContent(getTextFromCssSelector(element, BEFORE.cssQuery))
                .afterContent(getTextFromCssSelector(element, AFTER.cssQuery))
                .build();
    }

    protected static Remove convertRemove(Element element) {
        return Remove.builder()
                .attribute(getAttributeTextClearly(element))
                .content(getTextFromCssSelector(element, REMOVE.cssQuery))
                .build();
    }

    protected static New convertNew(Element element) {
        return New.builder()
                .attribute(getAttributeTextClearly(element))
                .content(getTextFromCssSelector(element, AFTER.cssQuery))
                .build();
    }

    private static String getAttributeTextClearly(Element element) {
        Elements selectElements = element.select(ATTRIBUTE.cssQuery);
        Elements destroyElements = element.select(ATTRIBUTE_EXTRA.cssQuery);
        destroyElements.remove();
        return getTextFromElement(selectElements).replace(ATTRIBUTE_EXTRA_STRING, EMPTY_STRING);
    }

    protected enum AttributeSelector {

        ATTRIBUTE(".attribute"),
        BEFORE(".attribute-before"),
        AFTER(".attribute-after"),
        REMOVE(".attribute-removed"),
        ATTRIBUTE_EXTRA(".attribute span");

        private String cssQuery;

        AttributeSelector(String cssQuery) {
            this.cssQuery = cssQuery;
        }

    }
}
