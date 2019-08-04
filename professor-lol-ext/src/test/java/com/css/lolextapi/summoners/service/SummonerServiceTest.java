package com.css.lolextapi.summoners.service;

import com.css.lolextapi.summoners.dto.SummonerDto;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SummonerServiceTest {

    @Autowired
    private SummonerService summonerService;

    private Gson gson = new GsonBuilder().setPrettyPrinting()
            .create();

    @Test
    public void getSummonerInfo() {
        //given
        String summonerName = "이상한새기";

        //when
        ResponseEntity<SummonerDto> responseEntity = summonerService.getSummonerInfo(summonerName);

        //then
        assertThat(responseEntity.getStatusCode()).isEqualByComparingTo(HttpStatus.OK);
        System.out.println(gson.toJson(responseEntity));
    }
}