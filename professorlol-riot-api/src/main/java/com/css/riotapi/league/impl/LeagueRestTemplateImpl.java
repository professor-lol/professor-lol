package com.css.riotapi.league.impl;

import com.css.riotapi.interceptor.RiotTokenInterceptor;
import com.css.riotapi.league.dto.LeagueEntryDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

@Component
@Slf4j
public class LeagueRestTemplateImpl {

    private static final Duration READ_TIME_OUT = Duration.ofMillis(2000);
    private static final Duration CONN_TIME_OUT = Duration.ofMillis(2000);
    private static final String ROOT_URI = "";


    private RestTemplate restTemplate;

    public LeagueRestTemplateImpl() {
        log.info("LeagueRestTemplate Default Constructor.");

        this.restTemplate = new RestTemplateBuilder()
                .additionalInterceptors()
                .rootUri(ROOT_URI)
                .setConnectTimeout(CONN_TIME_OUT)
                .setReadTimeout(READ_TIME_OUT)
                .build();
    }

    private static ParameterizedTypeReference<List<LeagueEntryDto>> LEAGUE_ENTRY_LIST_TYPE = getLeagueEntryListType();

    private static ParameterizedTypeReference<List<LeagueEntryDto>> getLeagueEntryListType() {
        return new ParameterizedTypeReference<List<LeagueEntryDto>>() {
        };
    }

    private static class LeagueEntryList extends ArrayList<LeagueEntryList> {
    }
}
