package com.css.lolextapi.match.service;

import com.css.lolextapi.match.dto.MatchlistDto;
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
public class MatchServiceTest {

    @Autowired
    private MatchService matchService;


    private Gson gson = new GsonBuilder().setPrettyPrinting()
            .create();

    @Test
    public void getMatchlistInfo() {
        //given
        String encryptedAccountId = "w94qxPIxhJ2ALZoRItVSwyN6R-CNMXOE1VJwesmrZdAv";

        //when
        ResponseEntity<MatchlistDto> responseEntity = matchService.getMatchlistInfo(encryptedAccountId);

        //then
        assertThat(responseEntity.getStatusCode()).isEqualByComparingTo(HttpStatus.OK);
        System.out.println(gson.toJson(responseEntity));
    }
}