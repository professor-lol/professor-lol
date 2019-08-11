package com.css.professorlol.summoner.impl;

import com.css.professorlol.summoner.dto.SummonerDto;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SummonerRestTemplateImplTest {

    private static final Logger log = LoggerFactory.getLogger(SummonerRestTemplateImplTest.class);
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Autowired
    private SummonerRestTemplateImpl summonerRestTemplate;

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

    @Test(expected = HttpClientErrorException.BadRequest.class)
    public void getSummonerDto_빈칸입력() {
        //given
        String summonerName = "";

        //when
        //then
        SummonerDto summonerDto = summonerRestTemplate.getSummonerDto(summonerName);
        log.info(gson.toJson(summonerDto));
    }

    @Test(expected = HttpClientErrorException.BadRequest.class)
    public void getSummonerDto_NULL_입력() {
        //given
        String summonerName = null;

        //when
        //then
        SummonerDto summonerDto = summonerRestTemplate.getSummonerDto(summonerName);
        log.info(gson.toJson(summonerDto));
    }


    //TODO : ExceptionAdvice 설정
    @Test(expected = HttpClientErrorException.NotFound.class)
    public void getSummonerDto_없는_소환사_이름() {
        //given
        String summonerName = "@";

        //when
        //then
        summonerRestTemplate.getSummonerDto(summonerName);
    }

    //TODO: Timeout Exception Test Code
}