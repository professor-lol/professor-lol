package com.css.riotapi.league.impl;

import com.css.riotapi.core.properties.RiotURIProperties;
import com.css.riotapi.core.interceptor.RiotTokenInterceptor;
import com.css.riotapi.league.LeagueRestTemplate;
import com.css.riotapi.league.dto.LeagueEntryDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;
import java.util.HashSet;
import java.util.Set;

@Component
@Slf4j
public class LeagueRestTemplateImpl implements LeagueRestTemplate {

    private static final Duration READ_TIME = Duration.ofMillis(2000L);
    private static final Duration CONN_TIME = Duration.ofMillis(2000L);

    private final String LEAGUE_ENTRY_BY_SUMMONER_URL;
    private final RestTemplate restTemplate;

    public LeagueRestTemplateImpl(RiotTokenInterceptor riotTokenInterceptor, RiotURIProperties riotURIProperties) {
        log.info("LeagueRestTemplate Default Constructor.");
        this.LEAGUE_ENTRY_BY_SUMMONER_URL = riotURIProperties.getLeagueEntryBySummoner();
        this.restTemplate = new RestTemplateBuilder()
                .additionalInterceptors(riotTokenInterceptor)
                .rootUri(riotURIProperties.getHost())
                .setReadTimeout(READ_TIME)
                .setConnectTimeout(CONN_TIME)
                .build();
    }

    @Override
    public Set<LeagueEntryDto> getLeagueEntries(String encryptedSummonerId) {
        Set<LeagueEntryDto> leagueEntrySet;
        try {
            leagueEntrySet = restTemplate.getForObject(LEAGUE_ENTRY_BY_SUMMONER_URL, LeagueEntrySet.class, encryptedSummonerId);
        } catch (RestClientException restClientException) {
            throw restClientException;
        }
        return leagueEntrySet;
    }

    private static class LeagueEntrySet extends HashSet<LeagueEntryDto> {
    }

}