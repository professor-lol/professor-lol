package com.css.professorlol.summoner.impl;

import com.css.professorlol.core.properties.RiotURIProperties;
import com.css.professorlol.summoner.SummonerRestTemplate;
import com.css.professorlol.summoner.dto.SummonerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Component
@Slf4j
public class SummonerRestTemplateImpl implements SummonerRestTemplate {

    private final String SUMMONER_BY_NAME_URL;

    private final RestTemplate restTemplate;

    public SummonerRestTemplateImpl(@Qualifier(value = "summonerRestTemplateBean") RestTemplate restTemplate, RiotURIProperties riotURIProperties) {
        log.debug("SummonerRestTemplate created.");
        this.SUMMONER_BY_NAME_URL = riotURIProperties.getSummonerByName();
        this.restTemplate = restTemplate;
    }

    @Override
    public SummonerDto getSummonerDto(String summonerName) {
        SummonerDto summonerDto;
        try {
            summonerDto = restTemplate.getForObject(SUMMONER_BY_NAME_URL, SummonerDto.class, summonerName);
        } catch (RestClientException restException) {
            throw restException;
        }
        return summonerDto;
    }

}
