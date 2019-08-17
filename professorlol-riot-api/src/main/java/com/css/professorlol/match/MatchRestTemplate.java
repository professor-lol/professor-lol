package com.css.professorlol.match;

import com.css.professorlol.match.dto.match.MatchDto;
import com.css.professorlol.match.dto.matchList.MatchQueryParam;
import com.css.professorlol.match.dto.matchList.MatchlistDto;

public interface MatchRestTemplate {
    MatchlistDto getMatchList(final String encryptedAccountId, MatchQueryParam queryParam);

    MatchDto getMatch(String matchId);
}
