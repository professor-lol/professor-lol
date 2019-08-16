package com.css.professorlol.domain.champion.ability;

import org.jsoup.Jsoup;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AbilityFactory {

    static final String SIBLING_DELIMITER = "<hr class=\"divider\">";
    static final String UNNECESSARY_STRING = "</body>";
    static final String EMPTY_STRING = "";
//    static final Integer UNNECESSARY_ELEMENTS_INDEX = 0;

    public static List<Ability> of(Elements elements) {
        return pretreatmentHtml(elements).stream()
                .map(abilityString -> Jsoup.parse(abilityString).children())
                .map(AbilityMapper::of)
                .collect(Collectors.toList());
    }

    //:TODO 최적화
    private static List<String> pretreatmentHtml(Elements elements) {
        String championHtml = elements.html();
        championHtml.replace(UNNECESSARY_STRING, EMPTY_STRING);
        String[] abilities = championHtml.split(SIBLING_DELIMITER);
        ArrayList<String> abilitiesString = new ArrayList<>(Arrays.asList(abilities));
        abilitiesString.remove(0);
        return abilitiesString;
    }
}
