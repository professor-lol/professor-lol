package com.css.professorlol.league.impl;

import com.css.professorlol.league.LeagueRestTemplate;
import com.css.professorlol.league.dto.LeagueEntryDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.client.RestTemplate;

import java.util.HashSet;
import java.util.Set;

@Slf4j
public class LeagueRestTemplateImpl implements LeagueRestTemplate {

    private static final String LEAGUE_ENTRY_BY_SUMMONER_URL = "/lol/league/v4/entries/by-summoner/{encryptedSummonerId}";
    private final RestTemplate restTemplate;

    public LeagueRestTemplateImpl(RestTemplate restTemplate) {
        log.info("LeagueRestTemplate created.");
        this.restTemplate = restTemplate;
    }

    @Override
    public Set<LeagueEntryDto> getLeagueEntries(String encryptedSummonerId) {
        return restTemplate.getForObject(LEAGUE_ENTRY_BY_SUMMONER_URL, LeagueEntrySet.class, encryptedSummonerId);
    }

    private static class LeagueEntrySet extends HashSet<LeagueEntryDto> {
    }

}