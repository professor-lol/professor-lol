package com.ccs.professorlol.third.impl;

import com.ccs.professorlol.config.exception.NotCorrectInputException;
import com.ccs.professorlol.third.ThirdPartyRestTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

//TODO : TEST CODE 작성하기
@Slf4j
public class ThirdPartyRestTemplateImpl implements ThirdPartyRestTemplate {

    private static final String THIRD_PARTY_CODE_URL = "/lol/platform/v4/third-party-code/by-summoner/{encryptedSummonerId}";
    private final RestTemplate restTemplate;

    public ThirdPartyRestTemplateImpl(final RestTemplate restTemplate) {
        log.debug("ThirdPartyRestTemplate created.");
        this.restTemplate = restTemplate;
    }

    @Override
    public String getThirdPartyCodeBySummonerId(final String encryptedSummonerId) {
        validateSummonerId(encryptedSummonerId);
        return restTemplate.getForObject(THIRD_PARTY_CODE_URL, String.class);
    }

    private void validateSummonerId(final String encryptedSummonerId) {
        if (StringUtils.isEmpty(encryptedSummonerId)) {
            throw new NotCorrectInputException("The Summoner name must be entered.");
        }
    }
}