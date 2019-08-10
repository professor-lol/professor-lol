package com.css.riotapi.league;

import com.css.riotapi.league.dto.LeagueEntryDto;

import java.util.Set;

public interface LeagueRestTemplate {

    Set<LeagueEntryDto> getLeagueEntries(String encryptedSummonerId);
}
