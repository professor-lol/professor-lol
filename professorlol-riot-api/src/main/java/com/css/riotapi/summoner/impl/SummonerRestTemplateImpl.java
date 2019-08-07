package com.css.riotapi.summoner.impl;

import com.css.riotapi.interceptor.RiotTokenInterceptor;
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

    private static final String ROOT_URI = "https://kr.api.riotgames.com";
    private static final Duration READ_TIME_OUT = Duration.ofMillis(2000);
    private static final Duration CONN_TIME_OUT = Duration.ofMillis(2000);

    private final RestTemplate restTemplate;

    public SummonerRestTemplateImpl(RiotTokenInterceptor riotTokenInterceptor) {
        log.info("LeagueRestTemplate Default Constructor.");
        this.restTemplate = new RestTemplateBuilder()
                .additionalInterceptors(riotTokenInterceptor)
                .rootUri(ROOT_URI)
                .setConnectTimeout(CONN_TIME_OUT)
                .setReadTimeout(READ_TIME_OUT)
                .build();
    }

    public SummonerDto getSummonerDto(String summonerName) {
        SummonerDto summonerDto = null;
        try {
            summonerDto = restTemplate.getForObject("/lol/summoner/v4/summoners/by-name/{summonerName}", SummonerDto.class, summonerName);
        } catch (RestClientException restException) {
            throw new RuntimeException(restException.getMessage());
        }
        return summonerDto;
    }

}
