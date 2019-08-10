package com.css.riotapi.match.impl;

import com.css.riotapi.core.properties.RiotURIProperties;
import com.css.riotapi.interceptor.RiotTokenInterceptor;
import com.css.riotapi.match.MatchRestTemplate;
import com.css.riotapi.match.dto.MatchQueryParam;
import com.css.riotapi.match.dto.MatchlistDto;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Component
public class MatchRestTemplateImpl implements MatchRestTemplate {

    private static final Duration READ_TIME_OUT = Duration.ofMillis(2000);
    private static final Duration CONN_TIME_OUT = Duration.ofMillis(2000);

    private final String MATCH_LIST_BY_ACCOUNT;
    private final RestTemplate restTemplate;

    public MatchRestTemplateImpl(final RiotTokenInterceptor riotTokenInterceptor, RiotURIProperties riotURIProperties) {
        this.MATCH_LIST_BY_ACCOUNT = riotURIProperties.getMatchListByAccount();
        this.restTemplate = new RestTemplateBuilder()
                .rootUri(riotURIProperties.getHost())
                .setReadTimeout(READ_TIME_OUT)
                .setConnectTimeout(CONN_TIME_OUT)
                .additionalInterceptors(riotTokenInterceptor)
                .build();
    }

    public MatchlistDto getMatchlist(final String encryptedAccountId, MatchQueryParam queryParam) {
        MatchlistDto matchlistDto;
        try {
            matchlistDto = restTemplate.getForObject(MATCH_LIST_BY_ACCOUNT, MatchlistDto.class, encryptedAccountId, queryParam);
        } catch (RestClientException restClientException) {
            throw restClientException;
        }
        return matchlistDto;
    }

}
