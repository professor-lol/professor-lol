package com.css.professorlol.third.impl;

import com.css.professorlol.third.ThirdPartyRestTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//TODO : TEST CODE 작성하기
@Component
@Slf4j
public class ThirdPartyRestTemplateImpl implements ThirdPartyRestTemplate {

    private static final String THIRD_PARTY_CODE_URL = "/lol/platform/v4/third-party-code/by-summoner/{encryptedSummonerId}";
    private final RestTemplate restTemplate;

    public ThirdPartyRestTemplateImpl(@Qualifier("thirdPartyRestTemplateBean") RestTemplate restTemplate) {
        log.info("ThirdPartyRestTemplate created.");
        this.restTemplate = restTemplate;
    }

    @Override
    public String getThirdPartyCode(String encryptedSummonerId) {
        return restTemplate.getForObject(THIRD_PARTY_CODE_URL, String.class);
    }
}
