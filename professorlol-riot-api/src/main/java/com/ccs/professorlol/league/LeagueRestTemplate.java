package com.ccs.professorlol.league;

import com.ccs.professorlol.league.dto.LeagueEntryDto;

import java.util.Set;

public interface LeagueRestTemplate {

    Set<LeagueEntryDto> getLeagueEntriesBySummonerId(String encryptedSummonerId);
}
