package com.ccs.professorlol.match.impl;

import com.ccs.professorlol.config.exception.NotCorrectInputException;
import com.ccs.professorlol.match.MatchRestTemplate;
import com.ccs.professorlol.match.dto.match.MatchDto;
import com.ccs.professorlol.match.dto.matchList.MatchQueryParam;
import com.ccs.professorlol.match.dto.matchList.MatchlistDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import javax.validation.constraints.NotBlank;
import java.util.Map;

@Slf4j
public class MatchRestTemplateImpl implements MatchRestTemplate {

    private static final String MATCH_LIST_BY_ACCOUNT_URL = "/lol/match/v4/matchlists/by-account/{encryptedAccountId}" +
            "?queue={soloQueue}" +
            "&season={season}" +
            "&endTime={endTime}&beginTime={beginTime}" +
            "&endIndex={endIndex}&beginIndex={beginIndex}";
    private static final String MATCH_URL = "/lol/match/v4/matches/{matchId}";

    private final RestTemplate restTemplate;

    public MatchRestTemplateImpl(final RestTemplate restTemplate) {
        log.debug("MatchRestTemplate created.");
        this.restTemplate = restTemplate;
    }

    @Override
    public MatchlistDto getMatchList(@NotBlank final String encryptedAccountId, final MatchQueryParam queryParam) {
        validateAccountId(encryptedAccountId);
        Map<String, Object> params = queryParam.getQueryParam();
        params.put("encryptedAccountId", encryptedAccountId);
        return restTemplate.getForObject(MATCH_LIST_BY_ACCOUNT_URL, MatchlistDto.class, params);
    }

    @Override
    public MatchDto getMatchByMatchId(final Long matchId) {
        validateMatchId(matchId);
        return restTemplate.getForObject(MATCH_URL, MatchDto.class, matchId);
    }

    private void validateAccountId(final String encryptedAccountId) {
        if (StringUtils.isEmpty(encryptedAccountId)) {
            throw new NotCorrectInputException("The Account ID must be entered.");
        }
    }

    private void validateMatchId(final Long matchId) {
        if (matchId <= 0) {
            throw new NotCorrectInputException("The Match ID can not be less than 0.");
        }
    }

}