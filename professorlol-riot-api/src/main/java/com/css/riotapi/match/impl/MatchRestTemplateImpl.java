package com.css.riotapi.match.impl;

import com.css.riotapi.core.exception.ConnectionTimeOutException;
import com.css.riotapi.core.exception.ReadTimeOutException;
import com.css.riotapi.core.interceptor.RiotTokenInterceptor;
import com.css.riotapi.core.properties.RiotURIProperties;
import com.css.riotapi.match.MatchRestTemplate;
import com.css.riotapi.match.dto.MatchQueryParam;
import com.css.riotapi.match.dto.MatchlistDto;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.conn.ConnectTimeoutException;
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
    public MatchlistDto getMatchlist(final String encryptedAccountId, MatchQueryParam queryParam) {
        MatchlistDto matchlistDto;
        try {
            MultiValueMap params = queryParam.getQueryParam();
            String optional = queryParam.getOptionalURI();
            matchlistDto = restTemplate.getForObject(MATCH_LIST_BY_ACCOUNT_URL + optional, MatchlistDto.class, encryptedAccountId, params);
        } catch (RestClientException restClientException) {
            catchException(restClientException);
            throw restClientException;
        }
        return matchlistDto;
    }

    private void catchException(RestClientException restClientException) {
        if (restClientException.getCause().getClass().equals(SocketTimeoutException.class)) {
            log.error("READ TIME OUT");
            throw new ReadTimeOutException("Read Time Out");
        }
        if (restClientException.getCause().getClass().equals(ConnectTimeoutException.class)) {
            log.error("CONNECTION TIME OUT");
            throw new ConnectionTimeOutException("Connection Time Out");
        }
    }

    @Override
    public Object getMatch(String matchId) {

        return null;
    }
}
