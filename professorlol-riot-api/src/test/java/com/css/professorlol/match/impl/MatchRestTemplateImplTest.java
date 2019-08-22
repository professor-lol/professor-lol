package com.css.professorlol.match.impl;

import com.css.professorlol.config.exception.BadRequestException;
import com.css.professorlol.config.exception.ClientException;
import com.css.professorlol.config.resttemplate.MatchRestTemplateConfig;
import com.css.professorlol.match.MatchRestTemplate;
import com.css.professorlol.match.dto.match.MatchDto;
import com.css.professorlol.match.dto.matchList.MatchQueryParam;
import com.css.professorlol.match.dto.matchList.MatchlistDto;
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
public class MatchRestTemplateImplTest {

    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private static final Logger log = LoggerFactory.getLogger(MatchRestTemplateImplTest.class);

    @Autowired
    private MatchRestTemplateConfig.MatchRestTemplateConfiguration matchRestTemplateConfiguration;

    private MatchRestTemplate matchRestTemplate;

    @Before
    public void setUp() throws Exception {
        matchRestTemplate = matchRestTemplateConfiguration.matchRestTemplate();
    }

    @Test
    public void getMatchList_정상입력() {
        //given
        String encryptedSummonerId = "w94qxPIxhJ2ALZoRItVSwyN6R-CNMXOE1VJwesmrZdAv";
        MatchQueryParam matchQueryParam = MatchQueryParam.testBuilder()
                .build();

        //when
        MatchlistDto matchlistDto = matchRestTemplate.getMatchList(encryptedSummonerId, matchQueryParam);

        //then
        assertThat(matchlistDto).isNotNull();
        assertThat(matchlistDto.getMatches()).isNotNull();
        assertThat(matchlistDto.getMatches()).isNotEmpty();
        log.info(gson.toJson(matchlistDto));
    }

    @Test(expected = BadRequestException.class)
    public void getMatchList_잘못된_종료_시간값으로_요청() {
        //given
        String encryptedSummonerId = "w94qxPIxhJ2ALZoRItVSwyN6R-CNMXOE1VJwesmrZdAv";

        MatchQueryParam matchQueryParam = MatchQueryParam.testBuilder()
                .endTime(0L)
                .build();

        //when
        matchRestTemplate.getMatchList(encryptedSummonerId, matchQueryParam);

        //then exception
    }

    @Test(expected = ClientException.class)
    public void getMatchList_잘못된_시작_시간값으로_요청() {
        //given
        String encryptedSummonerId = "w94qxPIxhJ2ALZoRItVSwyN6R-CNMXOE1VJwesmrZdAv";
        MatchQueryParam matchQueryParam = MatchQueryParam.testBuilder()
                .beginTime(15617397445077L)
                .build();

        //when
        matchRestTemplate.getMatchList(encryptedSummonerId, matchQueryParam);

        //then exception
    }

    @Test
    public void getMatch_정상입력() {
        //given
        Long matchId = 3724003832L;

        //when
        MatchDto match = matchRestTemplate.getMatch(matchId);

        //then
        assertThat(match).isNotNull();
        assertThat(match.getParticipants()).isNotNull();
        assertThat(match.getParticipants()).isNotEmpty();
    }

    @Test(expected = ClientException.class)
    public void getMatch_없는경기() {
        //given
        Long matchId = 3724003831L;

        //when
        matchRestTemplate.getMatch(matchId);

        //then exception
    }

}