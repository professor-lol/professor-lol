package com.ccs.professorlol.match;

import com.ccs.professorlol.match.dto.match.MatchDto;
import com.ccs.professorlol.match.dto.matchList.MatchQueryParam;
import com.ccs.professorlol.match.dto.matchList.MatchlistDto;

public interface MatchRestTemplate {
    MatchlistDto getMatchList(final String encryptedAccountId, MatchQueryParam queryParam);

    MatchDto getMatchByMatchId(Long matchId);
}
