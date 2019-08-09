package com.css.riotapi.match.impl;

import com.css.riotapi.interceptor.RiotTokenInterceptor;
import com.css.riotapi.match.MatchRestTemplate;
import com.css.riotapi.match.dto.MatchlistDto;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Component
public class MatchRestTemplateImpl implements MatchRestTemplate {

    private static final String ROOT_URI = "https://kr.api.riotgames.com";
    private static final String MATCH_LIST_BY_ACCOUNT = "/lol/match/v4/matchlists/by-account/{encryptedAccountId}";
    private static final Duration READ_TIME_OUT = Duration.ofMillis(2000);
    private static final Duration CONN_TIME_OUT = Duration.ofMillis(2000);

    private final RestTemplate restTemplate;

    public MatchRestTemplateImpl(final RiotTokenInterceptor riotTokenInterceptor) {
        this.restTemplate = new RestTemplateBuilder()
                .rootUri(ROOT_URI)
                .setReadTimeout(READ_TIME_OUT)
                .setConnectTimeout(CONN_TIME_OUT)
                .additionalInterceptors(riotTokenInterceptor)
                .build();
    }

    public MatchlistDto getMatchlist(String encryptedAccountId) {
        MatchlistDto matchlistDto;
        try {
            matchlistDto = restTemplate.getForObject(MATCH_LIST_BY_ACCOUNT, MatchlistDto.class, encryptedAccountId);
        } catch (RestClientException restClientException) {
            throw restClientException;
        }
        return matchlistDto;
    }

}
