package com.css.riotapi.summoner.impl;

import com.css.riotapi.summoner.dto.SummonerDto;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SummonerRestTemplateImplTest {

    private static final Logger log = LoggerFactory.getLogger(SummonerRestTemplateImplTest.class);
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Autowired
    private SummonerRestTemplateImpl summonerRestTemplate;

    @Test
    public void getSummonerDto() {
        String summonerName = "이상한새기";
        SummonerDto summonerDto = summonerRestTemplate.getSummonerDto(summonerName);
        assertThat(summonerDto).isNotNull();

        log.info(gson.toJson(summonerDto));
    }
}