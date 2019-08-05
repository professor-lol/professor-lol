package domain.champion.ability;

import org.jsoup.select.Elements;

import java.util.List;
import java.util.stream.Collectors;

import static domain.champion.ability.AttributeFactory.AttributeSelector.*;

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
        return elements.select(UNIT.cssQuery)
                .not(REMOVE.cssQuery);
    }

    private static Elements selectNewUnit(Elements elements) {
        return elements.select(UNIT.cssQuery)
                .not(BEFORE.cssQuery)
                .not(REMOVE.cssQuery);
    }

    private static Elements selectRemoveUnit(Elements elements) {
        return elements.select(UNIT.cssQuery)
                .not(BEFORE.cssQuery)
                .not(AFTER.cssQuery);
    }

    protected enum AttributeSelector {
        UNIT(".attribute-change"),
        ATTRIBUTE(".attribute"),
        BEFORE(".attribute-before"),
        AFTER(".attribute-after"),
        REMOVE(".attribute-remove");

        private String cssQuery;

        AttributeSelector(String cssQuery) {
            this.cssQuery = cssQuery;
        }

        public String getCssQuery() {
            return cssQuery;
        }
    }
}
