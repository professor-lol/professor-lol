package com.css.professorlol.summoner.impl;

import com.css.professorlol.config.exception.RiotException;
import com.css.professorlol.summoner.SummonerRestTemplate;
import com.css.professorlol.summoner.dto.SummonerDto;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Before;
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

import static org.assertj.core.api.Assertions.assertThat;

@Ignore
@SpringBootTest
@RunWith(SpringRunner.class)
public class SummonerRestTemplateImplTest {

    private static final Logger log = LoggerFactory.getLogger(SummonerRestTemplateImplTest.class);
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Autowired
    @Qualifier("summonerRestTemplateBean")
    private RestTemplate summonerRestTemplateBean;

    private SummonerRestTemplate summonerRestTemplate;

    @Before
    public void setUp() throws Exception {
        summonerRestTemplate = new SummonerRestTemplateImpl(this.summonerRestTemplateBean);
    }

    @Test
    public void getSummonerDto_성공() {
        //given
        String summonerName = "이상한새기";

        //when
        SummonerDto summonerDto = summonerRestTemplate.getSummonerDto(summonerName);

        //then
        assertThat(summonerDto).isNotNull();
        log.info(gson.toJson(summonerDto));
    }

    @Test(expected = RiotException.class)
    public void getSummonerDto_빈칸입력() {
        //given
        String summonerName = "";

        //when
        //then
        SummonerDto summonerDto = summonerRestTemplate.getSummonerDto(summonerName);
        log.info(gson.toJson(summonerDto));
    }

    @Test(expected = RiotException.class)
    public void getSummonerDto_NULL_입력() {
        //given
        String summonerName = null;

        //when
        //then
        SummonerDto summonerDto = summonerRestTemplate.getSummonerDto(summonerName);
        log.info(gson.toJson(summonerDto));
    }

    @Test(expected = RiotException.class)
    public void getSummonerDto_없는_소환사_이름() {
        //given
        String summonerName = "@";

        //when
        //then
        summonerRestTemplate.getSummonerDto(summonerName);
    }
}