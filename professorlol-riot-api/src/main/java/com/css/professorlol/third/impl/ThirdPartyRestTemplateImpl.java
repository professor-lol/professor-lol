package com.css.professorlol.third.impl;

import com.css.professorlol.third.ThirdPartyRestTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

//TODO : TEST CODE 작성하기
@Slf4j
public class ThirdPartyRestTemplateImpl implements ThirdPartyRestTemplate {

    private static final String THIRD_PARTY_CODE_URL = "/lol/platform/v4/third-party-code/by-summoner/{encryptedSummonerId}";
    private final RestTemplate restTemplate;

    public ThirdPartyRestTemplateImpl(RestTemplateBuilder restTemplateBuilder) {
        log.info("ThirdPartyRestTemplate created.");
        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public String getThirdPartyCode(final String encryptedSummonerId) {
        return restTemplate.getForObject(THIRD_PARTY_CODE_URL, String.class);
    }
}