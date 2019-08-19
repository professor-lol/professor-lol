package com.css.professorlol.summoner.impl;

import com.css.professorlol.config.exception.BadRequestException;
import com.css.professorlol.config.exception.ClientException;
import com.css.professorlol.config.resttemplate.SummonerRestTemplateConfig;
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
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@Ignore
@SpringBootTest
@RunWith(SpringRunner.class)
@ActiveProfiles("dev")
public class SummonerRestTemplateImplTest {

    private static final Logger log = LoggerFactory.getLogger(SummonerRestTemplate.class);
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Autowired
    private SummonerRestTemplateConfig.SummonerRestTemplateConfiguration summonerRestTemplateConfiguration;

    private SummonerRestTemplate summonerRestTemplate;

    @Before
    public void setUp() throws Exception {
        this.summonerRestTemplate = summonerRestTemplateConfiguration.summonerRestTemplate();
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

    @Test(expected = ClientException.class)
    public void getSummonerDto_결과없음() {
        //given
        String summonerName = "@";

        //when
        //then (404 NOT FOUND)
        SummonerDto summonerDto = this.summonerRestTemplate.getSummonerDto(summonerName);

    }

    @Test(expected = BadRequestException.class)
    public void getSummonerDto_올바르지_않은_값_입력() {
        //given
        String summonerName = "";

        //when
        //then (400 BAD REQUEST)
        SummonerDto summonerDto = this.summonerRestTemplate.getSummonerDto(summonerName);
    }


}