package com.css.professorlol.dto.champion.ability;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AbilityFactory {

    static final String SIBLING_DELIMITER = "<hr class=\"divider\">";
    static final String UNNECESSARY_STRING = "</body>";
    static final String EMPTY_STRING = "";

    public static List<Ability> of(Element element) {
        return pretreatmentHtml(element).stream()
                .map(abilityString -> Jsoup.parse(abilityString).children())
                .map(AbilityMapper::convert)
                .collect(Collectors.toList());
    }

    //:TODO 최적화
    private static List<String> pretreatmentHtml(Element element) {
        String championHtml = element.html().replace(UNNECESSARY_STRING, EMPTY_STRING);
        String[] abilities = championHtml.split(SIBLING_DELIMITER);
        ArrayList<String> abilitiesString = new ArrayList<>(Arrays.asList(abilities));
        abilitiesString.remove(0);
        return abilitiesString;
    }
}
