package com.css.riotapi.league.impl;

import com.css.riotapi.interceptor.RiotTokenInterceptor;
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

    private static final Duration READ_TIME_OUT = Duration.ofMillis(2000);
    private static final Duration CONN_TIME_OUT = Duration.ofMillis(2000);
    private static final String ROOT_URI = "https://kr.api.riotgames.com";
    private static final String LEAGUE_ENTRY_BY_SUMMONER = "/lol/league/v4/entries/by-summoner/{encryptedSummonerId}";

    private final RestTemplate restTemplate;

    public LeagueRestTemplateImpl(RiotTokenInterceptor riotTokenInterceptor) {
        log.info("LeagueRestTemplate Default Constructor.");
        this.restTemplate = new RestTemplateBuilder()
                .additionalInterceptors(riotTokenInterceptor)
                .rootUri(ROOT_URI)
                .setConnectTimeout(CONN_TIME_OUT)
                .setReadTimeout(READ_TIME_OUT)
                .build();
    }

    @Override
    public Set<LeagueEntryDto> getLeagueEntries(String encryptedSummonerId) {
        Set<LeagueEntryDto> leagueEntrySet;
        try {
            leagueEntrySet = restTemplate.getForObject(LEAGUE_ENTRY_BY_SUMMONER, LeagueEntrySet.class, encryptedSummonerId);
        } catch (RestClientException restClientException) {
            log.error(restClientException.getMessage());
            throw restClientException;
        }
        return leagueEntrySet;
    }

    private static class LeagueEntrySet extends HashSet<LeagueEntryDto> {

    }

}