package com.ccs.professorlol.dto.champion.ability.attribute;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AttributeParser {
    private static final String ATTRIBUTE_SELECTOR = ".attribute-change";

    public static List<Attribute> parse(Elements elements) {
        return elements.select(ATTRIBUTE_SELECTOR).stream()
                .map(AttributeSelector::convert)
                .collect(Collectors.toList());
    }

    @Getter
    @RequiredArgsConstructor
    enum AttributeSelector {
        CHANGE_CONDITION(":has(.change-indicator)", Attribute::ofChange),
        NEW_CONDITION(":has(.new)", Attribute::ofNew),
        REMOVE_CONDITION(":has(.removed)", Attribute::ofRemove);

        private final String cssQuery;
        private final Function<Element, Attribute> convertJob;

        public static Attribute convert(Element element) {
            return findBy(element).convertJob.apply(element);
        }

        private static AttributeSelector findBy(Element element) {
            return Arrays.stream(AttributeSelector.values())
                    .filter(selector -> element.select(selector.getSelector()).size() > 0)
                    .findFirst()
                    .orElse(NEW_CONDITION);
        }

        public String getSelector() {
            return ATTRIBUTE_SELECTOR + this.cssQuery;
        }
    }
}
