package com.css.professorlol.match.impl;

import com.css.professorlol.config.resttemplate.MatchRestTemplateConfig;
import com.css.professorlol.match.MatchRestTemplate;
import com.css.professorlol.match.dto.match.MatchDto;
import com.css.professorlol.match.dto.matchList.MatchQueryParam;
import com.css.professorlol.match.dto.matchList.MatchlistDto;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
@ActiveProfiles("stub")
public class MatchRestTemplateStubImplTest {

    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private static final Logger log = LoggerFactory.getLogger(MatchRestTemplateStubImplTest.class);

    @Autowired
    private MatchRestTemplateConfig.MatchRestTemplateStubConfiguration matchRestTemplateStubConfiguration;

    private MatchRestTemplate matchRestTemplate;

    @Before
    public void setUp() throws Exception {
        matchRestTemplate = matchRestTemplateStubConfiguration.matchRestTemplate();
    }

    @Test
    public void getMatchList() {
        //given
        String encryptedAccountId = "";
        MatchQueryParam matchQueryParam = MatchQueryParam.testBuilder().build();

        //when
        MatchlistDto matchList = matchRestTemplate.getMatchList(encryptedAccountId, matchQueryParam);

        //then
        assertThat(matchList).isNotNull();
        assertThat(matchList.getMatches()).isNotNull();
        assertThat(matchList.getMatches()).isNotEmpty();
        log.info(gson.toJson(matchList));
    }

    @Test
    public void getMatch() {
        //given
        Long matchId = 3724003832L;

        //when
        MatchDto match = matchRestTemplate.getMatch(matchId);

        //then
        assertThat(match).isNotNull();
        assertThat(match.getParticipants()).isNotNull();
        assertThat(match.getParticipants()).isNotEmpty();
        assertThat(match.getParticipantIdentities()).isNotNull();
        assertThat(match.getParticipantIdentities()).isNotEmpty();
        log.info(gson.toJson(match));
    }
}