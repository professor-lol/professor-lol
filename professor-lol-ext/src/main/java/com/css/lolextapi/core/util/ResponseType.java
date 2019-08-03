package com.css.lolextapi.core.util;

import com.css.lolextapi.league.dto.LeagueEntryDto;
import org.springframework.core.ParameterizedTypeReference;

import java.util.List;

public class ResponseType {

    public static ParameterizedTypeReference<List<LeagueEntryDto>> LEAGUE_ENTRY_LIST_TYPE = getLeagueEntryListType();

    private static ParameterizedTypeReference<List<LeagueEntryDto>> getLeagueEntryListType() {
        return new ParameterizedTypeReference<List<LeagueEntryDto>>() {
        };
    }
}
