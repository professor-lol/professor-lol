package com.css.professorlol.league.impl;

import com.css.professorlol.league.LeagueRestTemplate;
import com.css.professorlol.league.dto.LeagueEntryDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

import java.util.HashSet;
import java.util.Set;

@Slf4j
public class LeagueRestTemplateImpl implements LeagueRestTemplate {

    private static final String LOL_LEAGUE_V_4_ENTRIES_BY_SUMMONER = "/lol/league/v4/entries/by-summoner/{encryptedSummonerId}";
    private final RestTemplate restTemplate;

    public LeagueRestTemplateImpl(RestTemplateBuilder restTemplateBuilder) {
        log.info("LeagueRestTemplate created.");
        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public Set<LeagueEntryDto> getLeagueEntries(String encryptedSummonerId) {
        return restTemplate.getForObject(LOL_LEAGUE_V_4_ENTRIES_BY_SUMMONER, LeagueEntrySet.class, encryptedSummonerId);
    }

    private static class LeagueEntrySet extends HashSet<LeagueEntryDto> {
    }

}