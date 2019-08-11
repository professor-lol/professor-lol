package com.css.professorlol.league;

import com.css.professorlol.league.dto.LeagueEntryDto;

import java.util.Set;

public interface LeagueRestTemplate {

    Set<LeagueEntryDto> getLeagueEntries(String encryptedSummonerId);
}
