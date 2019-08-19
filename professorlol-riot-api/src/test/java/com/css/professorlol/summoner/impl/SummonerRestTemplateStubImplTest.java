package com.css.professorlol.summoner.impl;

import com.css.professorlol.config.exception.BadRequestException;
import com.css.professorlol.config.resttemplate.SummonerRestTemplateConfig;
import com.css.professorlol.summoner.SummonerRestTemplate;
import com.css.professorlol.summoner.dto.SummonerDto;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.ExpectedCount;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withStatus;

@SpringBootTest
@RunWith(SpringRunner.class)
@ActiveProfiles("stub")
public class SummonerRestTemplateStubImplTest {

    private static final Logger log = LoggerFactory.getLogger(SummonerRestTemplateStubImplTest.class);
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    private static final String RIOT_HOST_URL = "https://kr.api.riotgames.com";
    private static final String SUMMONER_BY_NAME_URL = "/lol/summoner/v4/summoners/by-name/";

    @Autowired
    private SummonerRestTemplateConfig.SummonerRestTemplateStubConfiguration summonerRestTemplateStubConfiguration;

    @Autowired
    private RestTemplate restTemplate;

    private MockRestServiceServer mockRestServiceServer;

    private SummonerRestTemplate summonerRestTemplate;

    @Before
    public void setUp() throws Exception {
        mockRestServiceServer = MockRestServiceServer.createServer(restTemplate);
        summonerRestTemplate = summonerRestTemplateStubConfiguration.summonerRestTemplate();
    }

    @Test
    public void getSummonerDto_정상입력() {
        //given
        String summonerName = "이상한새기";

        //when
        SummonerDto summonerDto = this.summonerRestTemplate.getSummonerDto(summonerName);

        //then
        assertThat(summonerDto).isNotNull();
        log.info(gson.toJson(summonerDto));
    }

    @Test(expected = BadRequestException.class)
    public void getSummonerDto_입력값이_잘못된_경우() throws URISyntaxException {
        //given
        String summonerName = "이상한새기";

        mockRestServiceServer.expect(ExpectedCount.once(),
                requestTo(new URI(RIOT_HOST_URL + SUMMONER_BY_NAME_URL + summonerName)))
                .andExpect(method(HttpMethod.GET))
                .andRespond(withStatus(HttpStatus.BAD_REQUEST)
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .body("{\n" +
                                "    \"status\": {\n" +
                                "        \"status_code\": 400,\n" +
                                "        \"message\": \"Bad Request\"\n" +
                                "    }\n" +
                                "}"));

        //when
        mockRestServiceServer.verify();
        summonerRestTemplate.getSummonerDto(summonerName);

        //then
    }
}