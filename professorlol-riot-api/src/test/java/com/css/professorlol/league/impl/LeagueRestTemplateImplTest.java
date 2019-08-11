package com.css.professorlol.league.impl;

import com.css.professorlol.league.LeagueRestTemplate;
import com.css.professorlol.league.dto.LeagueEntryDto;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
public class LeagueRestTemplateImplTest {

    private static final Logger log = LoggerFactory.getLogger(LeagueRestTemplateImpl.class);
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Autowired
    private LeagueRestTemplate leagueRestTemplate;

    @Test
    public void getLeagueEntries_성공시() {
        //given
        String encryptedSummonerId = "zN1v1n2XlkIY9cYKj9XydSSKItQNRtDLVdJHEWIkVhN5fQ";

        //when
        Set<LeagueEntryDto> leagueEntries = leagueRestTemplate.getLeagueEntries(encryptedSummonerId);

        //then
        assertThat(leagueEntries).isNotNull();
        assertThat(leagueEntries).isNotEmpty();
        log.info(gson.toJson(leagueEntries));
    }
}