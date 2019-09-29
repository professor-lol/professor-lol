package com.ccs.professorlol.ddragon.impl;

import com.ccs.professorlol.ddragon.DdragonRestTemplate;
import com.ccs.professorlol.ddragon.dto.ChampionDataDto;
import com.ccs.professorlol.ddragon.dto.RealmsDto;
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
    public ChampionDataDto getChampions(String version, String language) {
        return restTemplate.getForObject(CHAMPIONS, ChampionDataDto.class, version, language);
    }

    @Override
    public JsonObject getIndividualChampion(String version, String language, String championName) {
        return restTemplate.getForObject(INDIVIDUAL_CHAMPION, JsonObject.class, language);
    }
}
