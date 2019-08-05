package domain.champion;

import org.jsoup.select.Elements;

import java.util.List;
import java.util.stream.Collectors;

import static domain.champion.AbilityFactory.AbilityUnitSelector.UNIT;

class AbilityFactory {

    static List<Ability> of(Elements elements) {
        return elements.prev(".change-detail-title ~ attribute-change").stream()
                .map(AbilityMapper::of)
                .collect(Collectors.toList());
    }

    protected enum AbilityUnitSelector {

        UNIT(".change-detail-title");

        private String cssQuery;

        AbilityUnitSelector(String cssQuery) {
            this.cssQuery = cssQuery;
        }
    }


}
