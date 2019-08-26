package com.css.professorlol.summoner.impl;

import com.css.professorlol.MockResponse;
import com.css.professorlol.config.exception.BadRequestException;
import com.css.professorlol.config.exception.ClientException;
import com.css.professorlol.config.properties.XRiotTokenProperties;
import com.css.professorlol.config.resttemplate.SummonerRestTemplateConfig;
import com.css.professorlol.summoner.SummonerRestTemplate;
import com.css.professorlol.summoner.dto.SummonerDto;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.MockRestServiceServer;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.*;

@RestClientTest(value = {SummonerRestTemplateConfig.class, XRiotTokenProperties.class})
@RunWith(SpringRunner.class)
@ActiveProfiles("major")
public class SummonerRestTemplateImplMockTest {

    private static final Logger log = LoggerFactory.getLogger(SummonerRestTemplateImplMockTest.class);
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    private static final String SUMMONER_BY_NAME_URL = "/lol/summoner/v4/summoners/by-name/";

    @Autowired
    private MockRestServiceServer mockServer;

    @Autowired
    private SummonerRestTemplate summonerRestTemplate;

    @Test
    public void getSummonerDto_정상입력() {
        //given
        String summonerName = "뱅기현";
        String encodedName = "%EB%B1%85%EA%B8%B0%ED%98%84";

        SummonerDto expectSummonerDto = SummonerDto.stubBuilder()
                .accountId("ZCKKNXiQCxnU6iZItHeoPu8skeTkf2LMZjd8_SxXIBqY")
                .summonerId("wUIpM_FpV6kGdN15plnbstnSBbh33CFxoHJgdkhbaa4GCg")
                .build();

        String expectBody = MockResponse.getSummonerMockBody();

        this.mockServer.expect(requestTo(SUMMONER_BY_NAME_URL + encodedName))
                .andRespond(withSuccess(expectBody, MediaType.APPLICATION_JSON_UTF8));

        //when
        SummonerDto resultSummonerDto = summonerRestTemplate.getSummonerDto(summonerName);

        //then
        assertThat(resultSummonerDto.getAccountId()).isEqualTo(expectSummonerDto.getAccountId());
        assertThat(resultSummonerDto.getSummonerId()).isEqualTo(expectSummonerDto.getSummonerId());
        log.info(gson.toJson(resultSummonerDto));
    }

    @Test
    public void getSummonerDto_잘못된_입력값() {
        //given
        String summonerName = "이상한새기";
        String encodedName = "%EC%9D%B4%EC%83%81%ED%95%9C%EC%83%88%EA%B8%B0";

        String exceptBody = MockResponse.getExceptionResponseBody("Bad Request", HttpStatus.BAD_REQUEST);

        this.mockServer.expect(requestTo(SUMMONER_BY_NAME_URL + encodedName))
                .andRespond(withBadRequest()
                        .body(exceptBody)
                        .contentType(MediaType.APPLICATION_JSON_UTF8));

        //when
        //then
        assertThatThrownBy(() -> summonerRestTemplate.getSummonerDto(summonerName))
                .isInstanceOf(BadRequestException.class);
    }

    @Test
    public void getSummonerDto_결과값_없음() {
        //given
        String summonerName = "@";
        String exceptBody = MockResponse.getExceptionResponseBody("Data not found - summoner not found", HttpStatus.BAD_REQUEST);

        this.mockServer.expect(requestTo(SUMMONER_BY_NAME_URL + summonerName))
                .andRespond(withStatus(HttpStatus.NOT_FOUND)
                        .body(exceptBody)
                        .contentType(MediaType.APPLICATION_JSON_UTF8));

        //when
        //then
        assertThatThrownBy(() -> summonerRestTemplate.getSummonerDto(summonerName))
                .isInstanceOf(ClientException.class);
    }

    @Test
    public void getSummonerDto_널_입력() {
        //given
        String summonerName = null;

        this.mockServer.expect(requestTo(SUMMONER_BY_NAME_URL + summonerName))
                .andRespond(withSuccess("expectBody", MediaType.APPLICATION_JSON_UTF8));

        //when
        //then
        assertThatThrownBy(() -> summonerRestTemplate.getSummonerDto(summonerName))
                .isInstanceOf(BadRequestException.class)
                .hasMessage("The Summoner name must be entered.");
    }

    @Test
    public void getSummonerDto_공백_입력() {
        //given
        String summonerName = "";

        this.mockServer.expect(requestTo(SUMMONER_BY_NAME_URL + summonerName))
                .andRespond(withSuccess("expectBody", MediaType.APPLICATION_JSON_UTF8));

        //when
        //then
        assertThatThrownBy(() -> summonerRestTemplate.getSummonerDto(summonerName))
                .isInstanceOf(BadRequestException.class)
                .hasMessage("The Summoner name must be entered.");
    }
}