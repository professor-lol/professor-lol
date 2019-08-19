package com.css.professorlol.summoner.impl;

import com.css.professorlol.summoner.SummonerRestTemplate;
import com.css.professorlol.summoner.dto.SummonerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.client.RestTemplate;

@Slf4j
public class SummonerRestTemplateStubImpl implements SummonerRestTemplate {

    private static final String SUMMONER_BY_NAME_URL = "/lol/summoner/v4/summoners/by-name/{summonerName}";

    private final RestTemplate restTemplate;

    public SummonerRestTemplateStubImpl(RestTemplate restTemplate) {
        log.info("Stub SummonerRestTemplate created.");
        this.restTemplate = restTemplate;
    }

    @Override
    public SummonerDto getSummonerDto(String summonerName) {
        return SummonerDto.stubBuilder()
                .id("zN1v1n2XlkIY9cYKj9XydSSKItQNRtDLVdJHEWIkVhN5fQ")
                .accountId("w94qxPIxhJ2ALZoRItVSwyN6R-CNMXOE1VJwesmrZdAv")
                .build();
    }

}
