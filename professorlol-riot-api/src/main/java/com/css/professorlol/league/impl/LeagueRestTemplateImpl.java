package com.css.professorlol.league.impl;

import com.css.professorlol.config.exception.BadRequestException;
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

    public LeagueRestTemplateImpl(final RestTemplateBuilder restTemplateBuilder) {
        log.debug("LeagueRestTemplate created.");
        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public Set<LeagueEntryDto> getLeagueEntries(final String encryptedSummonerId) {
        validateSummonerId(encryptedSummonerId);
        return restTemplate.getForObject(LOL_LEAGUE_V_4_ENTRIES_BY_SUMMONER, LeagueEntrySet.class, encryptedSummonerId);
    }

    private void validateSummonerId(final String encryptedSummonerId) {
        if (encryptedSummonerId == null || encryptedSummonerId.isEmpty()) {
            throw new BadRequestException("The Summoner ID must be entered.");
        }
    }

    private static class LeagueEntrySet extends HashSet<LeagueEntryDto> {
    }

}