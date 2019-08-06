package com.css.riotapi.summoner.impl;

import com.css.riotapi.summoner.SummonerRestTemplate;
import com.css.riotapi.summoner.dto.SummonerDto;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class SummonerRestTemplateImpl implements SummonerRestTemplate {

    private RestTemplate restTemplate;

    public SummonerRestTemplateImpl() {

        //인터셉터등록
        //각종 설정

        this.restTemplate = new RestTemplate();
    }

    public SummonerDto getSummonerDto(String summonerName) {

        return null;
    }

}
