package com.css.lolextapi.league.service;

import com.css.lolextapi.league.dto.LeagueEntryDto;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
public class LeagueServiceTest {

    @Autowired
    private LeagueService leagueService;

    private Gson gson = new GsonBuilder().setPrettyPrinting()
            .create();

    @Test
    public void getLeagueEntryInfo() {
        //given
        String encryptedSummonerId = "zN1v1n2XlkIY9cYKj9XydSSKItQNRtDLVdJHEWIkVhN5fQ";

        //when
        ResponseEntity<List<LeagueEntryDto>> responseEntity = leagueService.getLeagueEntryInfo(encryptedSummonerId);

        //then
        assertThat(responseEntity.getStatusCode()).isEqualByComparingTo(HttpStatus.OK);
        System.out.println(gson.toJson(responseEntity));
    }
}