package com.css.professorlol.summoner.impl;

import com.css.professorlol.config.exception.BadRequestException;
import com.css.professorlol.config.exception.ClientException;
import com.css.professorlol.config.properties.XRiotTokenProperties;
import com.css.professorlol.config.resttemplate.SummonerRestTemplateConfig;
import com.css.professorlol.summoner.SummonerRestTemplate;
import com.css.professorlol.summoner.dto.SummonerDto;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.MockRestServiceServer;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.*;

@RestClientTest(value = {SummonerRestTemplateConfig.class, XRiotTokenProperties.class})
@RunWith(SpringRunner.class)
public class SummonerRestTemplateImplMockTest {

    private static final Logger log = LoggerFactory.getLogger(SummonerRestTemplateImplMockTest.class);
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    private static final String SUMMONER_BY_NAME_URL = "/lol/summoner/v4/summoners/by-name/";

    @Autowired
    private SummonerRestTemplateConfig.SummonerRestTemplateConfiguration summonerRestTemplateConfiguration;

    @Autowired
    private MockRestServiceServer mockServer;

    private SummonerRestTemplate summonerRestTemplate;

    @Before
    public void setUp() throws Exception {
        summonerRestTemplate = summonerRestTemplateConfiguration.summonerRestTemplate();
    }

    @Test
    public void getSummonerDto_정상입력() {
        //given
        String summonerName = "이상한새기";
        String encodedName = "%EC%9D%B4%EC%83%81%ED%95%9C%EC%83%88%EA%B8%B0";

        SummonerDto expectSummonerDto = SummonerDto.stubBuilder()
                .accountId("w94qxPIxhJ2ALZoRItVSwyN6R-CNMXOE1VJwesmrZdAv")
                .summonerId("zN1v1n2XlkIY9cYKj9XydSSKItQNRtDLVdJHEWIkVhN5fQ")
                .build();

        String expectBody = "{\n" +
                "    \"profileIconId\": 2095,\n" +
                "    \"name\": \"이상한새기\",\n" +
                "    \"puuid\": \"0unup92CswoD3CGo6qwydHzATD4pePmpi3XhZA-kX2urduks6nJke6nlnSpmJn0hEUPgHzuo0d5Tgg\",\n" +
                "    \"summonerLevel\": 97,\n" +
                "    \"accountId\": \"w94qxPIxhJ2ALZoRItVSwyN6R-CNMXOE1VJwesmrZdAv\",\n" +
                "    \"id\": \"zN1v1n2XlkIY9cYKj9XydSSKItQNRtDLVdJHEWIkVhN5fQ\",\n" +
                "    \"revisionDate\": 1561881475000\n" +
                "}";

        this.mockServer.expect(requestTo(SUMMONER_BY_NAME_URL + encodedName))
                .andRespond(withSuccess(expectBody, MediaType.APPLICATION_JSON_UTF8));

        //when
        SummonerDto resultSummonerDto = summonerRestTemplate.getSummonerDto(summonerName);

        //then
        assertThat(resultSummonerDto.getAccountId()).isEqualTo(expectSummonerDto.getAccountId());
        assertThat(resultSummonerDto.getSummonerId()).isEqualTo(expectSummonerDto.getSummonerId());
        log.info(gson.toJson(resultSummonerDto));
    }

    @Test(expected = BadRequestException.class)
    public void getSummonerDto_잘못된_입력값() {
        //given
        String summonerName = "이상한새기";
        String encodedName = "%EC%9D%B4%EC%83%81%ED%95%9C%EC%83%88%EA%B8%B0";
        String exceptBody =
                "{\n" +
                        "    \"status\": {\n" +
                        "        \"status_code\": 400,\n" +
                        "        \"message\": \"Bad Request\"\n" +
                        "    }\n" +
                        "}";
        JsonObject expectJson = new JsonParser().parse(exceptBody).getAsJsonObject();
        this.mockServer.expect(requestTo(SUMMONER_BY_NAME_URL + encodedName))
                .andRespond(withBadRequest()
                        .body(expectJson.toString())
                        .contentType(MediaType.APPLICATION_JSON_UTF8));

        //when
        //then
        summonerRestTemplate.getSummonerDto(summonerName);
    }

    @Test(expected = ClientException.class)
    public void getSummonerDto_결과값_없음() {
        //given
        String summonerName = "@";
        String exceptBody =
                "{\n" +
                        "    \"status\": {\n" +
                        "        \"status_code\": 404,\n" +
                        "        \"message\": \"Data not found - summoner not found\"\n" +
                        "    }\n" +
                        "}";
        JsonObject expectJson = new JsonParser().parse(exceptBody).getAsJsonObject();
        this.mockServer.expect(requestTo(SUMMONER_BY_NAME_URL + summonerName))
                .andRespond(withStatus(HttpStatus.NOT_FOUND)
                        .body(expectJson.toString())
                        .contentType(MediaType.APPLICATION_JSON_UTF8));

        //when
        //then
        summonerRestTemplate.getSummonerDto(summonerName);
    }

}