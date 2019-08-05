package domain.champion;


import org.jsoup.select.Elements;

import java.util.List;
import java.util.stream.Collectors;

public class PatchChampion {

    private List<Champion> champions;

    public PatchChampion(Elements contentBorder) {
        this.champions = contentBorder.stream()
                .map(ChampionMapper::of)
                .collect(Collectors.toList());
    }

    public List<Champion> getChampions() {
        return champions;
    }
}
