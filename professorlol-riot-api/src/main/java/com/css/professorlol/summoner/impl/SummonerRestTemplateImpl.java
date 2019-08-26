package com.css.professorlol.summoner.impl;

import com.css.professorlol.config.exception.BadRequestException;
import com.css.professorlol.summoner.SummonerRestTemplate;
import com.css.professorlol.summoner.dto.SummonerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

@Slf4j
public class SummonerRestTemplateImpl implements SummonerRestTemplate {

    private static final String SUMMONER_BY_NAME_URL = "/lol/summoner/v4/summoners/by-name/{summonerName}";

    private final RestTemplate restTemplate;

    public SummonerRestTemplateImpl(final RestTemplateBuilder restTemplateBuilder) {
        log.debug("SummonerRestTemplate created.");
        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public SummonerDto getSummonerDto(final String summonerName) {
        validateSummonerName(summonerName);
        return restTemplate.getForObject(SUMMONER_BY_NAME_URL, SummonerDto.class, summonerName);
    }

    private void validateSummonerName(final String summonerName) {
        if (summonerName == null || summonerName.isEmpty()) {
            throw new BadRequestException("The Summoner name must be entered.");
        }
    }

}