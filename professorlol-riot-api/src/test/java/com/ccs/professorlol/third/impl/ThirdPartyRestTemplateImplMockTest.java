package com.ccs.professorlol.third.impl;

import com.ccs.professorlol.config.properties.RiotProperties;
import com.ccs.professorlol.config.resttemplate.RiotRestTemplateBuilder;
import com.ccs.professorlol.third.ThirdPartyRestTemplate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

class ThirdPartyRestTemplateImplMockTest {

    private static final String THIRD_PARTY_URL = "https://kr.api.riotgames.com/lol/platform/v4/third-party-code/by-summoner/";

    private MockRestServiceServer mockServer;
    private ThirdPartyRestTemplate thirdPartyRestTemplate;

    @BeforeEach
    void setUp() {
        RiotProperties riotProperties = new RiotProperties();
        riotProperties.setToken(new RiotProperties.Token());
        riotProperties.getToken().setValue("value");
        RestTemplateBuilder restTemplateBuilder = RiotRestTemplateBuilder.get(new RestTemplateBuilder(), riotProperties);
        RestTemplate restTemplate = restTemplateBuilder.build();
        mockServer = MockRestServiceServer.createServer(restTemplate);
        thirdPartyRestTemplate = new ThirdPartyRestTemplateImpl(restTemplate);
    }

    @Test
    void getThirdPartyCodeBySummonerId() {
        //given
        String encryptedSummonerId = "zN1v1n2XlkIY9cYKj9XydSSKItQNRtDLVdJHEWIkVhN5fQ";
        mockServer.expect(requestTo(THIRD_PARTY_URL + encryptedSummonerId))
                .andRespond(withSuccess(encryptedSummonerId, MediaType.APPLICATION_JSON));

        //when
        String thirdPartyCodeBySummonerId = thirdPartyRestTemplate.getThirdPartyCodeBySummonerId(encryptedSummonerId);

        //then
        assertThat(thirdPartyCodeBySummonerId).isEqualTo(encryptedSummonerId);
    }
}