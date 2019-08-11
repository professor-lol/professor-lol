package com.css.professorlol.match.impl;

import com.css.professorlol.core.exception.ConnectionTimeOutException;
import com.css.professorlol.core.exception.ReadTimeOutException;
import com.css.professorlol.core.interceptor.RiotTokenInterceptor;
import com.css.professorlol.core.properties.RiotURIProperties;
import com.css.professorlol.match.MatchRestTemplate;
import com.css.professorlol.match.dto.MatchQueryParam;
import com.css.professorlol.match.dto.MatchlistDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.net.SocketTimeoutException;
import java.time.Duration;

@Component
@Slf4j
public class MatchRestTemplateImpl implements MatchRestTemplate {

    private static final Duration READ_TIME = Duration.ofMillis(2000L);
    private static final Duration CONN_TIME = Duration.ofMillis(2000L);

    private final String MATCH_LIST_BY_ACCOUNT_URL;
    private final RestTemplate restTemplate;

    public MatchRestTemplateImpl(final RiotTokenInterceptor riotTokenInterceptor,final RiotURIProperties riotURIProperties) {
        this.MATCH_LIST_BY_ACCOUNT_URL = riotURIProperties.getMatchListByAccount();
        this.restTemplate = new RestTemplateBuilder()
                .rootUri(riotURIProperties.getHost())
                .setReadTimeout(READ_TIME)
                .setConnectTimeout(CONN_TIME)
                .additionalInterceptors(riotTokenInterceptor)
                .build();
        log.info("MatchRestTemplate Constructor.");
    }

    @Override
    public MatchlistDto getMatchList(final String encryptedAccountId, MatchQueryParam queryParam) {
            MultiValueMap params = queryParam.getQueryParam();
            String optional = queryParam.getOptionalURI();
        return restTemplate.getForObject(MATCH_LIST_BY_ACCOUNT_URL + optional, MatchlistDto.class, encryptedAccountId, params);
    }


    @Override
    public Object getMatch(String matchId) {

        return null;
    }
}
