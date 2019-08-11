package com.css.riotapi.summoner.impl;

import com.css.riotapi.core.interceptor.RiotTokenInterceptor;
import com.css.riotapi.core.properties.RiotURIProperties;
import com.css.riotapi.summoner.SummonerRestTemplate;
import com.css.riotapi.summoner.dto.SummonerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Component
@Slf4j
public class SummonerRestTemplateImpl implements SummonerRestTemplate {

    private static final Duration READ_TIME = Duration.ofMillis(2000L);
    private static final Duration CONN_TIME = Duration.ofMillis(2000L);

    private final String SUMMONER_BY_NAME_URL;
    private final RestTemplate restTemplate;

    public SummonerRestTemplateImpl(RiotTokenInterceptor riotTokenInterceptor, RiotURIProperties riotURIProperties) {
        this.SUMMONER_BY_NAME_URL = riotURIProperties.getSummonerByName();
        this.restTemplate = new RestTemplateBuilder()
                .additionalInterceptors(riotTokenInterceptor)
                .rootUri(riotURIProperties.getHost())
                .setReadTimeout(READ_TIME)
                .setConnectTimeout(CONN_TIME)
                .build();
        log.info("SummonerRestTemplatew Default Constructor.");
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
