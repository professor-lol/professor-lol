package com.css.professorlol.third.impl;

import com.css.professorlol.core.interceptor.RiotTokenInterceptor;
import com.css.professorlol.core.properties.RiotURIProperties;
import com.css.professorlol.third.ThirdPartyRestTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

//TODO : TEST CODE 작성하기
@Component
@Slf4j
public class ThirdPartyRestTemplateImpl implements ThirdPartyRestTemplate {

    private static final Duration READ_TIME = Duration.ofMillis(2000L);
    private static final Duration CONN_TIME = Duration.ofMillis(2000L);

    private final String THIRD_PARTY_CODE_URL;
    private final RestTemplate restTemplate;

    public ThirdPartyRestTemplateImpl(RiotTokenInterceptor riotTokenInterceptor, RiotURIProperties riotURIProperties) {
        this.THIRD_PARTY_CODE_URL = riotURIProperties.getThirdPartyCode();
        this.restTemplate = new RestTemplateBuilder()
                .rootUri(riotURIProperties.getHost())
                .setReadTimeout(READ_TIME)
                .setConnectTimeout(CONN_TIME)
                .additionalInterceptors(riotTokenInterceptor)
                .build();
    }

    @Override
    public String getThirdPartyCode(String encryptedSummonerId) {
        String code;
        try {
            code = restTemplate.getForObject(THIRD_PARTY_CODE_URL, String.class);
        } catch (RestClientException restClientException) {
            throw restClientException;
        }
        return code;
    }
}
