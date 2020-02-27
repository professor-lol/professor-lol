package com.ccs.professorlol.match.impl;

import com.ccs.professorlol.config.exception.NotCorrectInputException;
import com.ccs.professorlol.config.exception.RiotClientException;
import com.ccs.professorlol.config.resttemplate.MatchRestTemplateConfig;
import com.ccs.professorlol.match.MatchRestTemplate;
import com.ccs.professorlol.match.dto.match.MatchDto;
import com.ccs.professorlol.match.dto.matchList.MatchQueryParam;
import com.ccs.professorlol.match.dto.matchList.MatchlistDto;
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
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@Ignore
@SpringBootTest
@RunWith(SpringRunner.class)
@ActiveProfiles("major")
public class MatchRestTemplateImplTest {

    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private static final Logger log = LoggerFactory.getLogger(MatchRestTemplateImplTest.class);

    @Autowired
    private MatchRestTemplateConfig.MajorMatchConfig majorMatchConfig;

    private MatchRestTemplate matchRestTemplate;

    @Before
    public void setUp() throws Exception {
        matchRestTemplate = majorMatchConfig.matchRestTemplate();
    }

    @Test
    public void getMatchList_정상입력() {
        //given
        String encryptedSummonerId = "w94qxPIxhJ2ALZoRItVSwyN6R-CNMXOE1VJwesmrZdAv";
        MatchQueryParam matchQueryParam = MatchQueryParam.builder()
                .build();

        //when
        MatchlistDto matchlistDto = matchRestTemplate.getMatchList(encryptedSummonerId, matchQueryParam);

        //then
        assertThat(matchlistDto).isNotNull();
        assertThat(matchlistDto.getMatches()).isNotNull();
        assertThat(matchlistDto.getMatches()).isNotEmpty();
        log.info(gson.toJson(matchlistDto));
    }

    @Test
    public void getMatchList_잘못된_종료_시간값으로_요청() {
        String encryptedSummonerId = "w94qxPIxhJ2ALZoRItVSwyN6R-CNMXOE1VJwesmrZdAv";

        MatchQueryParam matchQueryParam = MatchQueryParam.builder()
                .endTime(0L)
                .build();

        assertThatThrownBy(() -> matchRestTemplate.getMatchList(encryptedSummonerId, matchQueryParam))
                .isInstanceOf(NotCorrectInputException.class);

    }

    @Test
    public void getMatchList_잘못된_시작_시간값으로_요청() {
        String encryptedSummonerId = "w94qxPIxhJ2ALZoRItVSwyN6R-CNMXOE1VJwesmrZdAv";
        MatchQueryParam matchQueryParam = MatchQueryParam.builder()
                .beginTime(15617397445077L)
                .build();

        assertThatThrownBy(() -> matchRestTemplate.getMatchList(encryptedSummonerId, matchQueryParam))
                .isInstanceOf(RiotClientException.class);
    }

    @Test
    public void getMatch_정상입력() {
        //given
        Long matchId = 3724003832L;

        //when
        MatchDto match = matchRestTemplate.getMatchByMatchId(matchId);

        //then
        assertThat(match).isNotNull();
        assertThat(match.getParticipants()).isNotNull();
        assertThat(match.getParticipants()).isNotEmpty();
    }

    @Test
    public void getMatch_없는경기() {
        //given
        Long matchId = 3724003831L;

        //then exception
        assertThatThrownBy(() -> matchRestTemplate.getMatchByMatchId(matchId))
                .isInstanceOf(RiotClientException.class);
    }

}