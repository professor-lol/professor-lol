package com.css.professorlol.match.impl;

import com.css.professorlol.match.MatchRestTemplate;
import com.css.professorlol.match.dto.MatchQueryParam;
import com.css.professorlol.match.dto.MatchlistDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Component
@Slf4j
public class MatchRestTemplateImpl implements MatchRestTemplate {

    private static final String MATCH_LIST_BY_ACCOUNT_URL = "/lol/match/v4/matchlists/by-account/{encryptedAccountId}?queue={queue}&season={season}&endIndex={endIndex}&beginIndex={beginIndex}";
    private static final String MATCH_URL = "/lol/match/v4/matches/{matchId}";

    private final RestTemplate restTemplate;

    public MatchRestTemplateImpl(@Qualifier("matchRestTemplateBean") RestTemplate restTemplate) {
        log.info("MatchRestTemplate created.");
        this.restTemplate = restTemplate;
    }

    @Override
    public MatchlistDto getMatchList(final String encryptedAccountId, MatchQueryParam queryParam) {
        Map<String, Object> params = queryParam.getQueryParam();
        Object[] parameters = {encryptedAccountId, queryParam.getQueue(), queryParam.getSeason(), queryParam.getEndIndex(), queryParam.getBeginIndex()};
        return restTemplate.getForObject(MATCH_LIST_BY_ACCOUNT_URL, MatchlistDto.class, parameters);
    }

    @Override
    public Object getMatch(String matchId) {
        return restTemplate.getForObject(MATCH_URL, Object.class);
    }
}