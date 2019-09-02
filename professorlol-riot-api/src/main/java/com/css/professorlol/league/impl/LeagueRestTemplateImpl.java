package com.css.professorlol.league.impl;

import com.css.professorlol.config.exception.NotCorrectInputException;
import com.css.professorlol.league.LeagueRestTemplate;
import com.css.professorlol.league.dto.LeagueEntryDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import java.util.HashSet;
import java.util.Set;

@Slf4j
public class LeagueRestTemplateImpl implements LeagueRestTemplate {

    private static final String LOL_LEAGUE_V_4_ENTRIES_BY_SUMMONER = "/lol/league/v4/entries/by-summoner/{encryptedSummonerId}";
    private final RestTemplate restTemplate;

    public LeagueRestTemplateImpl(final RestTemplate restTemplate) {
        log.debug("LeagueRestTemplate created.");
        this.restTemplate = restTemplate;
    }

    @Override
    public Set<LeagueEntryDto> getLeagueEntriesBySummonerId(final String encryptedSummonerId) {
        validateSummonerId(encryptedSummonerId);
        return restTemplate.getForObject(LOL_LEAGUE_V_4_ENTRIES_BY_SUMMONER, LeagueEntrySet.class, encryptedSummonerId);
    }

    private void validateSummonerId(final String encryptedSummonerId) {
        if (StringUtils.isEmpty(encryptedSummonerId)) {
            throw new NotCorrectInputException("The Summoner ID must be entered.");
        }
    }

    private static class LeagueEntrySet extends HashSet<LeagueEntryDto> {
    }

}