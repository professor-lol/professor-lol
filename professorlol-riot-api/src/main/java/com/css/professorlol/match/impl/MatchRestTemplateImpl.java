package com.css.professorlol.match.impl;

import com.css.professorlol.match.MatchRestTemplate;
import com.css.professorlol.match.dto.match.MatchDto;
import com.css.professorlol.match.dto.matchList.MatchQueryParam;
import com.css.professorlol.match.dto.matchList.MatchlistDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.client.RestTemplate;

import javax.validation.constraints.NotBlank;
import java.util.Map;

@Slf4j
public class MatchRestTemplateImpl implements MatchRestTemplate {

    private static final String MATCH_LIST_BY_ACCOUNT_URL = "/lol/match/v4/matchlists/by-account/{encryptedAccountId}?queue={queue}&season={season}&endIndex={endIndex}&beginIndex={beginIndex}";
    private static final String MATCH_URL = "/lol/match/v4/matches/{matchId}";

    private final RestTemplate restTemplate;

    public MatchRestTemplateImpl(RestTemplate restTemplate) {
        log.info("MatchRestTemplate created.");
        this.restTemplate = restTemplate;
    }

    @Override
    public MatchlistDto getMatchList(@NotBlank final String encryptedAccountId, MatchQueryParam queryParam) {
        Map<String, Object> params = queryParam.getQueryParam();
        params.put("encryptedAccountId", encryptedAccountId);
        return restTemplate.getForObject(MATCH_LIST_BY_ACCOUNT_URL, MatchlistDto.class, params);
    }

    @Override
    public MatchDto getMatch(String matchId) {
        return restTemplate.getForObject(MATCH_URL, MatchDto.class, matchId);
    }
}