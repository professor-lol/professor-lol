package com.ccs.professorlol.ddragon.impl;

import com.ccs.professorlol.ddragon.DdragonRestTemplate;
import com.ccs.professorlol.ddragon.dto.ChampionDataDto;
import com.ccs.professorlol.ddragon.dto.ChampionDto;
import com.ccs.professorlol.ddragon.dto.RealmsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
public class DdragonRestTemplateImpl implements DdragonRestTemplate {

    private static final String REALM_BY_LANGUAGE = "/realms/kr.json";
    private static final String CHAMPIONS = "/cdn/{version}/data/kr/champion.json";
    private static final String INDIVIDUAL_CHAMPION = "/cdn/{version}/data/ko_KR/champion/{championName}.json";

    final RestTemplate restTemplate;

    @Override
    public RealmsDto getCurrentRealms() {
        return restTemplate.getForObject(REALM_BY_LANGUAGE, RealmsDto.class);
    }

    @Override
    public ChampionDataDto getChampions(String version) {
        return restTemplate.getForObject(CHAMPIONS, ChampionDataDto.class, version);
    }

    @Override
    public ChampionDto getIndividualChampion(String version, String championName) {
        return restTemplate.getForObject(INDIVIDUAL_CHAMPION, ChampionDto.class);
    }
}
