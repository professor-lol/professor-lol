package com.css.professorlol.summoner.impl;

import com.css.professorlol.summoner.SummonerRestTemplate;
import com.css.professorlol.summoner.dto.SummonerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.client.RestTemplate;

@Slf4j
public class SummonerRestTemplateImpl implements SummonerRestTemplate {

    private static final String SUMMONER_BY_NAME_URL = "/lol/summoner/v4/summoners/by-name/{summonerName}";

    private final RestTemplate restTemplate;

    public SummonerRestTemplateImpl(RestTemplate restTemplate) {
        log.info("SummonerRestTemplate created.");
        this.restTemplate = restTemplate;
    }

    @Override
    public SummonerDto getSummonerDto(String summonerName) {
        return restTemplate.getForObject(SUMMONER_BY_NAME_URL, SummonerDto.class, summonerName);
    }

}
