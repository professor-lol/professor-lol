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
    private static final String SUMMONER_BY_ID_URL = "/lol/summoner/v4/summoners/{encryptedSummonerId}";

    private final RestTemplate restTemplate;

    public SummonerRestTemplateImpl(final RestTemplateBuilder restTemplateBuilder) {
        log.debug("SummonerRestTemplate created.");
        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public SummonerDto getSummonerDto(final String summonerName) {
        validateSummonerIdentifier(summonerName);
        return restTemplate.getForObject(SUMMONER_BY_NAME_URL, SummonerDto.class, summonerName);
    }

    @Override
    public SummonerDto getSummonerDtoBySummonerId(String encryptedSummonerId) {
        validateSummonerIdentifier(encryptedSummonerId);
        return restTemplate.getForObject(SUMMONER_BY_ID_URL, SummonerDto.class, encryptedSummonerId);
    }

    private void validateSummonerIdentifier(final String summonerIdentifier) {
        if (summonerIdentifier == null || summonerIdentifier.isEmpty()) {
            throw new BadRequestException("The Summoner Identifier must be entered.");
        }
    }

}