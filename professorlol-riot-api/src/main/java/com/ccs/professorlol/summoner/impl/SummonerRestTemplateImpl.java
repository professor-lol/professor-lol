package com.ccs.professorlol.summoner.impl;

import com.ccs.professorlol.config.exception.NotCorrectInputException;
import com.ccs.professorlol.summoner.SummonerRestTemplate;
import com.ccs.professorlol.summoner.dto.SummonerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

@Slf4j
public class SummonerRestTemplateImpl implements SummonerRestTemplate {

    private static final String SUMMONER_BY_NAME_URL = "/lol/summoner/v4/summoners/by-name/{summonerName}";
    private static final String SUMMONER_BY_ID_URL = "/lol/summoner/v4/summoners/{encryptedSummonerId}";

    private final RestTemplate restTemplate;

    public SummonerRestTemplateImpl(final RestTemplate restTemplate) {
        log.debug("SummonerRestTemplate created.");
        this.restTemplate = restTemplate;
    }

    @Override
    public SummonerDto getSummonerDtoBySummonerName(final String summonerName) {
        validateSummonerIdentifier(summonerName);
        return restTemplate.getForObject(SUMMONER_BY_NAME_URL, SummonerDto.class, summonerName);
    }

    @Override
    public SummonerDto getSummonerDtoBySummonerId(final String encryptedSummonerId) {
        validateSummonerIdentifier(encryptedSummonerId);
        return restTemplate.getForObject(SUMMONER_BY_ID_URL, SummonerDto.class, encryptedSummonerId);
    }

    private void validateSummonerIdentifier(final String summonerIdentifier) {
        if (StringUtils.isEmpty(summonerIdentifier)) {
            throw new NotCorrectInputException("The Summoner Identifier must be entered.");
        }
    }

}