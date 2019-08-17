package com.css.professorlol.domain.champion.ability.attribute;

import org.jsoup.select.Elements;

import java.util.List;
import java.util.stream.Collectors;

import static com.css.professorlol.domain.champion.ability.attribute.AttributeFactory.AttributeSelector.*;

public class AttributeFactory {

    public static List<Change> ofChanges(Elements elements) {
        return selectChangeUnit(elements).stream()
                .map(AttributeMapper::ofChange)
                .collect(Collectors.toList());
    }

    public static List<Remove> ofRemoves(Elements elements) {
        return selectRemoveUnit(elements).stream()
                .map(AttributeMapper::ofRemove)
                .collect(Collectors.toList());
    }

    public static List<New> ofNews(Elements elements) {
        return selectNewUnit(elements).stream()
                .map(AttributeMapper::ofNew)
                .collect(Collectors.toList());
    }

    private static Elements selectChangeUnit(Elements elements) {
        return elements.select(UNIT.cssQuery + CHANGE_CONDITION.cssQuery);
    }

    private static Elements selectNewUnit(Elements elements) {
        return elements.select(UNIT.cssQuery + NEW_CONDITION.cssQuery);
    }

    private static Elements selectRemoveUnit(Elements elements) {
        return elements.select(UNIT.cssQuery + REMOVE_CONDITION.cssQuery);
    }

    protected enum AttributeSelector {
        UNIT(".attribute-change"),
        CHANGE_CONDITION(":has(.change-indicator)"),
        NEW_CONDITION(":has(.new)"),
        REMOVE_CONDITION(":has(.removed)");

        private String cssQuery;

        AttributeSelector(String cssQuery) {
            this.cssQuery = cssQuery;
        }
    }
}