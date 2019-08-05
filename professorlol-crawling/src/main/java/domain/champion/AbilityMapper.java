package domain.champion;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import static domain.champion.AbilityMapper.AbilitySelector.*;


public class AbilityMapper {

    public static Ability of(Element element) {
        return new Ability.Builder()
                .title(element.select(TITLE.cssQuery))
                .image(element.select(IMAGE.cssQuery))
                .changes(element.select(ATTRIBUTE.cssQuery))
                .news(element.select(ATTRIBUTE.cssQuery))
                .removes(element.select(ATTRIBUTE.cssQuery))
                .build();
    }

    protected enum AbilitySelector {

        TITLE(".change-detail-title"),
        IMAGE(".change-detail-title img"),
        ATTRIBUTE(".attribute_change");

        private String cssQuery;

        AbilitySelector(String cssQuery) {
            this.cssQuery = cssQuery;
        }
    }

}
