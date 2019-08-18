package com.css.professorlol.config.exception;

import com.css.professorlol.config.properties.XRiotTokenProperties;
import com.css.professorlol.summoner.SummonerRestTemplate;
import com.css.professorlol.summoner.impl.SummonerRestTemplateImpl;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@Ignore
@SpringBootTest
@RunWith(SpringRunner.class)
public class RiotExceptionHandlerTest {

    private static final Logger log = LoggerFactory.getLogger(RiotExceptionHandlerTest.class);
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Autowired
    private XRiotTokenProperties xRiotTokenProperties;

    @Qualifier("summonerRestTemplateBean")
    @Autowired
    private RestTemplate summonerRestTemplate;

    @Test
    public void handleError_토큰_key_틀릴경우() {
        //given
        String summonerName = "이상한새기";
        xRiotTokenProperties.setKey("wrong");
        SummonerRestTemplate summonerRestTemplate = new SummonerRestTemplateImpl(this.summonerRestTemplate);

        //when (401 UNAUTHORIZED)
        summonerRestTemplate.getSummonerDto(summonerName);

        //then
    }

    @Test
    public void handleError_토큰_value_틀릴경우() {
        //given
        String summonerName = "이상한새기";
        xRiotTokenProperties.setValue("wrong");
        SummonerRestTemplate summonerRestTemplate = new SummonerRestTemplateImpl(this.summonerRestTemplate);

        //when (403 FORBIDDEN)
        summonerRestTemplate.getSummonerDto(summonerName);

        //then
    }

}