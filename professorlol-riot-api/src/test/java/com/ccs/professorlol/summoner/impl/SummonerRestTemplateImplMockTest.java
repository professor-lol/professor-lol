package com.ccs.professorlol.summoner.impl;

import com.ccs.professorlol.MockResponse;
import com.ccs.professorlol.config.exception.NotCorrectInputException;
import com.ccs.professorlol.config.exception.RiotClientException;
import com.ccs.professorlol.config.properties.RiotProperties;
import com.ccs.professorlol.config.resttemplate.RiotRestTemplateBuilder;
import com.ccs.professorlol.summoner.SummonerRestTemplate;
import com.ccs.professorlol.summoner.dto.SummonerDto;
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
import static org.springframework.test.web.client.response.MockRestResponseCreators.withStatus;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

public class SummonerRestTemplateImplMockTest {

    private static final Logger log = LoggerFactory.getLogger(SummonerRestTemplateImplMockTest.class);
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    private static final String SUMMONER_BY_NAME_URL = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/";
    private static final String SUMMONER_BY_ID_URL = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/";

    private MockRestServiceServer mockServer;

    private SummonerRestTemplate summonerRestTemplate;

    @Before
    public void setUp() throws Exception {
        RiotProperties riotProperties = new RiotProperties();
        riotProperties.setToken(new RiotProperties.Token());
        riotProperties.getToken().setValue("value");
        RestTemplateBuilder restTemplateBuilder = RiotRestTemplateBuilder.get(new RestTemplateBuilder(), riotProperties);
        RestTemplate restTemplate = restTemplateBuilder.build();
        mockServer = MockRestServiceServer.createServer(restTemplate);
        summonerRestTemplate = new SummonerRestTemplateImpl(restTemplate);
    }


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
        SummonerDto resultSummonerDto = summonerRestTemplate.getSummonerDtoBySummonerName(summonerName);

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
        assertThatThrownBy(() -> summonerRestTemplate.getSummonerDtoBySummonerName(summonerName))
                .isInstanceOf(NotCorrectInputException.class);
    }

    @Test
    public void getSummonerDto_결과값_없음() {
        //given
        String summonerName = "@";
        String exceptBody = MockResponse.getExceptionResponseBody("Data not found - summoner not found", HttpStatus.NOT_FOUND);

        this.mockServer.expect(requestTo(SUMMONER_BY_NAME_URL + summonerName))
                .andRespond(withStatus(HttpStatus.NOT_FOUND)
                        .body(exceptBody)
                        .contentType(MediaType.APPLICATION_JSON_UTF8));

        //when
        //then
        assertThatThrownBy(() -> summonerRestTemplate.getSummonerDtoBySummonerName(summonerName))
                .isInstanceOf(RiotClientException.class);
    }

    @Test
    public void getSummonerDto_널_입력() {
        //given
        String summonerName = null;

        this.mockServer.expect(requestTo(SUMMONER_BY_NAME_URL + summonerName))
                .andRespond(withSuccess("expectBody", MediaType.APPLICATION_JSON_UTF8));

        //when
        //then
        assertThatThrownBy(() -> summonerRestTemplate.getSummonerDtoBySummonerName(summonerName))
                .isInstanceOf(NotCorrectInputException.class)
                .hasMessage("The Summoner Identifier must be entered.");
    }

    @Test
    public void getSummonerDto_공백_입력() {
        //given
        String summonerName = "";

        this.mockServer.expect(requestTo(SUMMONER_BY_NAME_URL + summonerName))
                .andRespond(withSuccess("expectBody", MediaType.APPLICATION_JSON_UTF8));

        //when
        //then
        assertThatThrownBy(() -> summonerRestTemplate.getSummonerDtoBySummonerName(summonerName))
                .isInstanceOf(NotCorrectInputException.class)
                .hasMessage("The Summoner Identifier must be entered.");
    }

    @Test
    public void getSummonerDtoBySummonerId_정상입력() {
        //given
        String summonerId = "zN1v1n2XlkIY9cYKj9XydSSKItQNRtDLVdJHEWIkVhN5fQ";

        SummonerDto expectSummonerDto = SummonerDto.stubBuilder()
                .accountId("ZCKKNXiQCxnU6iZItHeoPu8skeTkf2LMZjd8_SxXIBqY")
                .summonerId("zN1v1n2XlkIY9cYKj9XydSSKItQNRtDLVdJHEWIkVhN5fQ")
                .build();

        this.mockServer.expect(requestTo(SUMMONER_BY_ID_URL + summonerId))
                .andRespond(withSuccess(gson.toJson(expectSummonerDto), MediaType.APPLICATION_JSON_UTF8));

        //when
        SummonerDto summonerDto = this.summonerRestTemplate.getSummonerDtoBySummonerId(summonerId);

        //then
        assertThat(summonerDto.getSummonerId()).isEqualTo(summonerId);
        log.info(gson.toJson(summonerDto));
    }

    @Test
    public void getSummonerDtoBySummonerId_올바르지_않은_값_입력_NOT_NULL() {
        //given
        String summonerId = "zN1v1n2XlkIY9cYKj9XydSSKItQNRtDLVdJHEWIkVhN5fQasdf";

        String exceptBody = MockResponse.getExceptionResponseBody("Bad Request - Exception decrypting zN1v1n2XlkIY9cYKj9XydSSKItQNRtDLVdJHEWIkVhN5fQasdf", HttpStatus.BAD_REQUEST);

        this.mockServer.expect(requestTo(SUMMONER_BY_ID_URL + summonerId))
                .andRespond(withBadRequest().body(exceptBody).contentType(MediaType.APPLICATION_JSON_UTF8));

        //when
        //then (400)
        assertThatThrownBy(() -> this.summonerRestTemplate.getSummonerDtoBySummonerId(summonerId))
                .isInstanceOf(NotCorrectInputException.class);
    }

    @Test
    public void getSummonerDtoBySummonerId_올바르지_않은_값_입력_NULL() {
        //given
        this.mockServer.expect(requestTo(SUMMONER_BY_ID_URL + null))
                .andRespond(withBadRequest().body("The Summoner Identifier must be entered.").contentType(MediaType.APPLICATION_JSON_UTF8));
        //when
        //then (400 BAD REQUEST)
        assertThatThrownBy(() -> this.summonerRestTemplate.getSummonerDtoBySummonerId(null))
                .isInstanceOf(NotCorrectInputException.class);
    }
}