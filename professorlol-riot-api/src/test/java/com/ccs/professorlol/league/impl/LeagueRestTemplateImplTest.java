package com.ccs.professorlol.league.impl;

import com.ccs.professorlol.config.exception.NotCorrectInputException;
import com.ccs.professorlol.config.resttemplate.LeagueRestTemplateConfig;
import com.ccs.professorlol.league.LeagueRestTemplate;
import com.ccs.professorlol.league.dto.LeagueEntryDto;
import com.ccs.professorlol.summoner.impl.SummonerRestTemplateImplMockTest;
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

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@Ignore
@SpringBootTest
@RunWith(SpringRunner.class)
@ActiveProfiles("major")
public class LeagueRestTemplateImplTest {

    private static final Logger log = LoggerFactory.getLogger(SummonerRestTemplateImplMockTest.class);
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Autowired
    private LeagueRestTemplateConfig.MajorLeagueConfig majorLeagueConfig;

    private LeagueRestTemplate leagueRestTemplate;

    @Before
    public void setUp() throws Exception {
        leagueRestTemplate = majorLeagueConfig.leagueRestTemplate();
    }

    @Test
    public void getLeagueEntries_정상호출() {
        //given
        String encodedSummonerId = "wUIpM_FpV6kGdN15plnbstnSBbh33CFxoHJgdkhbaa4GCg";

        //when
        Set<LeagueEntryDto> leagueEntries = leagueRestTemplate.getLeagueEntriesBySummonerId(encodedSummonerId);

        //then
        assertThat(leagueEntries).isNotNull();
        assertThat(leagueEntries).isNotEmpty();
        log.info(gson.toJson(leagueEntries));
    }

    @Test
    public void getLeagueEntries_정상호출_결과없음() {
        //given
        String encodedSummonerId = "ssgqMEzI5DLXfQGYyYVJKZUqMpT-qvjbwJqw_CaRJl6i0A";

        //when
        Set<LeagueEntryDto> leagueEntryDtoSet = leagueRestTemplate.getLeagueEntriesBySummonerId(encodedSummonerId);

        //then
        assertThat(leagueEntryDtoSet).isNotNull();
        assertThat(leagueEntryDtoSet).isEmpty();
        log.info(gson.toJson(leagueEntryDtoSet));
    }

    @Test
    public void getLeagueEntries_올바르지_않은_입력시() {
        String encodedSummonerId = "w";

        assertThatThrownBy(() -> leagueRestTemplate.getLeagueEntriesBySummonerId(encodedSummonerId))
                .isInstanceOf(NotCorrectInputException.class);
    }
}