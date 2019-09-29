package com.ccs.professorlol.util;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ElementContextUtil {

    public static final String EMPTY_STRING = "";
    public static final String IMAGE_LINK_ATTRIBUTE_KEY = "src";

    public static String getTextFromElement(Elements elements) {
        return elements.isEmpty() ? EMPTY_STRING : elements.text();
    }

    public static String getTextFromCssSelector(Element element, String cssSelector) {
        return getTextFromElement(element.select(cssSelector));
    }

    public static String getTextFromCssSelector(Elements elements, String cssSelector) {
        return getTextFromElement(elements.select(cssSelector));
    }

    public static String getUrlFromElement(Elements elements) {
        return elements.isEmpty() ? EMPTY_STRING : elements.attr(IMAGE_LINK_ATTRIBUTE_KEY);
    }

    public static String getUrlFromCssSelector(Element element, String cssSelector) {
        return getUrlFromElement(element.select(cssSelector));
    }

    public static String getUrlFromCssSelector(Elements elements, String cssSelector) {
        return getUrlFromElement(elements.select(cssSelector));
    }


}
