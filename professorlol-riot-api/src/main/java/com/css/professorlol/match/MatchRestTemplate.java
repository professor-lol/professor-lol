package com.css.professorlol.match;

import com.css.professorlol.match.dto.MatchQueryParam;
import com.css.professorlol.match.dto.MatchlistDto;

public interface MatchRestTemplate {
    MatchlistDto getMatchList(final String encryptedAccountId, MatchQueryParam queryParam);

    Object getMatch(String matchId);
}
