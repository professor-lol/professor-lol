package com.css.riotapi.match;

import com.css.riotapi.match.dto.MatchQueryParam;
import com.css.riotapi.match.dto.MatchlistDto;

public interface MatchRestTemplate {
    MatchlistDto getMatchlist(final String encryptedAccountId, MatchQueryParam queryParam);

    Object getMatch(String matchId);
}
