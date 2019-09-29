package com.css.professorlol.ddragon.impl;

import com.css.professorlol.ddragon.DdragonRestTemplate;
import com.css.professorlol.ddragon.dto.RealmsDto;
import com.google.gson.JsonObject;
import lombok.RequiredArgsConstructor;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
public class DdragonRestTemplateImpl implements DdragonRestTemplate {

    private static final String REALM_BY_LANGUAGE = "/realms/{language}.json";
    private static final String CHAMPIONS = "/cdn/{version}/data/{language}/champion.json";
    private static final String INDIVIDUAL_CHAMPION = "/cdn/{version}/data/{language}/champion/{championName}.json";

    final RestTemplate restTemplate;

    @Override
    public RealmsDto getCurrentRealms(String language) {
        return restTemplate.getForObject(REALM_BY_LANGUAGE, RealmsDto.class, language);
    }

    @Override
    public JsonObject getChampions(String version, String language) {
        return restTemplate.getForObject(CHAMPIONS, JsonObject.class, version, language);
    }

    @Override
    public JsonObject getIndividualChampion(String version, String language, String championName) {
        return restTemplate.getForObject(INDIVIDUAL_CHAMPION, JsonObject.class, language);
    }
}
