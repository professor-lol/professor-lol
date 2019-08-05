package domain.champion;

import org.jsoup.nodes.Element;

import static domain.champion.ChampionMapper.ChampionSelector.*;

public class ChampionMapper {

    static Champion of(Element element) {
        return new Champion.Builder()
                .name(element.select(NAME.cssQuery))
                .summary(element.select(SUMMARY.cssQuery))
                .context(element.select(CONTEXT.cssQuery))
                .image(element.select(IMAGE.cssQuery))
                .abilities(element.select(CONTEXT.cssQuery).nextAll())
                .build();
    }

    protected enum ChampionSelector {
        NAME(".change-title a"),
        SUMMARY(".summary"),
        CONTEXT(".context"),
        IMAGE(".reference-link img");

        private String cssQuery;

        ChampionSelector(String cssQuery) {
            this.cssQuery = cssQuery;
        }
    }

}
