package com.css.professorlol.third.impl;

import com.css.professorlol.MockResponse;
import com.css.professorlol.config.exception.NotCorrectInputException;
import com.css.professorlol.config.exception.RiotClientException;
import com.css.professorlol.config.properties.RiotProperties;
import com.css.professorlol.config.restTemplate.RiotRestTemplateBuilder;
import com.css.professorlol.third.ThirdPartyRestTemplate;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withBadRequest;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

public class ThirdPartyRestTemplateImplMockTest {

    private static final Logger log = LoggerFactory.getLogger(ThirdPartyRestTemplateImplMockTest.class);
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    private static final String THIRD_PARTY_CODE_URL = "https://kr.api.riotgames.com/lol/platform/v4/third-party-code/by-summoner/";

    private MockRestServiceServer mockServer;

    private ThirdPartyRestTemplate thirdPartyRestTemplate;

    @Before
    public void setUp() throws Exception {
        RiotProperties riotProperties = new RiotProperties();
        riotProperties.setToken(new RiotProperties.Token());
        riotProperties.getToken().setValue("value");
        RestTemplateBuilder restTemplateBuilder = RiotRestTemplateBuilder.get(new RestTemplateBuilder(), riotProperties);
        RestTemplate restTemplate = restTemplateBuilder.build();
        mockServer = MockRestServiceServer.createServer(restTemplate);
        thirdPartyRestTemplate = new ThirdPartyRestTemplateImpl(restTemplate);
    }


    @Test
    public void getThirdPartyCodeBySummonerId_정상입력() {
        //given
        String encryptedSummonerId = "ikOkuPXpvz6vO7d5JOtFq2oBalTG2CHc9BkTKapqIOdVIXc";

        String expectBody = encryptedSummonerId;

        this.mockServer.expect(requestTo(THIRD_PARTY_CODE_URL + encryptedSummonerId))
                .andRespond(withSuccess(encryptedSummonerId, MediaType.APPLICATION_JSON_UTF8));

        //when
        String thirdPartyCodeBySummonerId = thirdPartyRestTemplate.getThirdPartyCodeBySummonerId(encryptedSummonerId);

        //then
        assertThat(thirdPartyCodeBySummonerId).isEqualTo(expectBody);
        log.info(thirdPartyCodeBySummonerId);
    }

    @Test
    public void getThirdPartyCodeBySummonerId_인증안된_유저_입력() {
        //given
        String encryptedSummonerId = "1M7EGb747N2UwwU9rrtHpcbiwnrXRVOR7h6b8FgEjZJj6-w";

        this.mockServer.expect(requestTo(THIRD_PARTY_CODE_URL + encryptedSummonerId))
                .andRespond(withBadRequest());

        //when
        //then
        assertThatThrownBy(() -> thirdPartyRestTemplate.getThirdPartyCodeBySummonerId(encryptedSummonerId))
                .isInstanceOf(RiotClientException.class);
    }

    @Test
    public void getThirdPartyCodeBySummonerId_잘못된_입력값() {

        //given
        String encryptedSummonerId = "ikOkuPXpvz6vO7d5JOtFq2oBalTG2CHc9BkTKapqIOd";

        String expectBody = MockResponse.getExceptionResponseBody("Bad Request - Exception decrypting " + encryptedSummonerId, HttpStatus.BAD_REQUEST);

        this.mockServer.expect(requestTo(THIRD_PARTY_CODE_URL + encryptedSummonerId))
                .andRespond(withBadRequest()
                        .body(expectBody)
                        .contentType(MediaType.APPLICATION_JSON_UTF8));

        //when
        //then
        assertThatThrownBy(() -> thirdPartyRestTemplate.getThirdPartyCodeBySummonerId(encryptedSummonerId))
                .isInstanceOf(NotCorrectInputException.class);

    }

    @Test
    public void getThirdPartyCodeBySummonerId_널_입력() {
        //given

        this.mockServer.expect(requestTo(THIRD_PARTY_CODE_URL + null))
                .andRespond(withBadRequest()
                        .body("Required parameter cannot be null [parameterName=encryptedSummonerId]")
                        .contentType(MediaType.APPLICATION_JSON_UTF8));

        //when
        //then
        assertThatThrownBy(() -> thirdPartyRestTemplate.getThirdPartyCodeBySummonerId(null))
                .isInstanceOf(NotCorrectInputException.class);
    }

    @Test
    public void getThirdPartyCodeBySummonerId_공백_입력() {
        //given
        String encryptedSummonerId = "";

        this.mockServer.expect(requestTo(THIRD_PARTY_CODE_URL + encryptedSummonerId))
                .andRespond(withBadRequest()
                        .body("Required parameter cannot be null [parameterName=encryptedSummonerId]")
                        .contentType(MediaType.APPLICATION_JSON_UTF8));

        //when
        //then
        assertThatThrownBy(() -> thirdPartyRestTemplate.getThirdPartyCodeBySummonerId(encryptedSummonerId))
                .isInstanceOf(NotCorrectInputException.class);
    }

}