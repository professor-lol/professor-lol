package com.ccs.professorlol.ddragon.impl;

import com.ccs.professorlol.ddragon.DdragonRestTemplate;
import com.ccs.professorlol.ddragon.dto.ChampionDataDto;
import com.ccs.professorlol.ddragon.dto.ChampionDto;
import com.ccs.professorlol.ddragon.dto.ItemDataDto;
import com.ccs.professorlol.ddragon.dto.RealmsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
public class DdragonRestTemplateImpl implements DdragonRestTemplate {

    private static final String REALMS = "/realms/kr.json";
    private static final String CHAMPIONS = "/cdn/{version}/data/ko_KR/champion.json";
    private static final String INDIVIDUAL_CHAMPION = "/cdn/{version}/data/ko_KR/champion/{championName}.json";
    private static final String ITEMS = "/cdn/{version}/data/ko_KR/item.json";

    final RestTemplate restTemplate;

    @Override
    public RealmsDto getCurrentRealms() {
        return restTemplate.getForObject(REALMS, RealmsDto.class);
    }

    @Override
    public ChampionDataDto getChampions(String version) {
        return restTemplate.getForObject(CHAMPIONS, ChampionDataDto.class, version);
    }

    //TODO : 챔피언 상세정보 가져오기, 데이터가 너무 많아서 정리하고 구현해야할듯
    @Override
    public ChampionDto getIndividualChampion(String version, String championName) {
        return restTemplate.getForObject(INDIVIDUAL_CHAMPION, ChampionDto.class);
    }

    @Override
    public ItemDataDto getItems(String version) {
        return restTemplate.getForObject(ITEMS, ItemDataDto.class, version);
    }
}
