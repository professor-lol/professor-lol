package com.css.riotapi.match.impl;

import com.css.riotapi.match.MatchRestTemplate;
import com.css.riotapi.match.dto.MatchQueryParam;
import com.css.riotapi.match.dto.MatchReferenceDto;
import com.css.riotapi.match.dto.MatchlistDto;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.MultiValueMap;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MatchRestTemplateImplTest {

    private static final Logger log = LoggerFactory.getLogger(MatchRestTemplateImplTest.class);
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Autowired
    private MatchRestTemplate matchRestTemplate;

    @Test
    public void getMatchlist_성공_쿼리파라미터_없이() {
        //given
        String encryptedAccountId = "w94qxPIxhJ2ALZoRItVSwyN6R-CNMXOE1VJwesmrZdAv";
        MatchQueryParam matchQueryParam = MatchQueryParam.testBuilder()
                .build();

        log.info(gson.toJson(matchQueryParam));

        //when
        MatchlistDto matchlist = matchRestTemplate.getMatchlist(encryptedAccountId, matchQueryParam);

        //then
        log.info(gson.toJson(matchlist));
        assertThat(matchlist).isNotNull();
        assertThat(matchlist.getMatches()).isNotNull();
        assertThat(matchlist.getMatches()).isNotEmpty();
    }

    @Test
    public void getMatchlist_성공_시작인덱스_100() {
        //given
        String encryptedAccountId = "w94qxPIxhJ2ALZoRItVSwyN6R-CNMXOE1VJwesmrZdAv";
        MatchQueryParam matchQueryParam = MatchQueryParam.testBuilder()
                .beginIndex(100)
                .build();

        log.info(gson.toJson(matchQueryParam));

        MultiValueMap param = matchQueryParam.getQueryParam();

        //when
        MatchlistDto matchlist = matchRestTemplate.getMatchlist(encryptedAccountId, matchQueryParam);

        //then
        log.info(gson.toJson(matchlist));
        assertThat(matchlist.getStartIndex()).isEqualTo(100);
        assertThat(matchlist.getEndIndex()).isEqualTo(200);
    }

    @Test
    public void getMatchlist_성공_특정_시즌만() {
        //given
        String encryptedAccountId = "w94qxPIxhJ2ALZoRItVSwyN6R-CNMXOE1VJwesmrZdAv";
        Integer season13 = 13;
        MatchQueryParam matchQueryParam = MatchQueryParam.testBuilder()
                .season(season13)
                .build();

        log.info(gson.toJson(matchQueryParam));

        MultiValueMap param = matchQueryParam.getQueryParam();

        //when
        MatchlistDto matchlist = matchRestTemplate.getMatchlist(encryptedAccountId, matchQueryParam);

        //then
        log.info(gson.toJson(matchlist));
        int originalSize = matchlist.getMatches().size();
        int filteredSize = (int) matchlist.getMatches().stream()
                .map(MatchReferenceDto::getSeason)
                .filter(season -> season.equals(13))
                .count();
        assertThat(originalSize).isEqualTo(filteredSize);
    }

    @Test
    public void getMatchlist_성공_특정_큐만() {
        //given
        String encryptedAccountId = "w94qxPIxhJ2ALZoRItVSwyN6R-CNMXOE1VJwesmrZdAv";
        Integer soloQueue = 420;
        MatchQueryParam matchQueryParam = MatchQueryParam.testBuilder()
                .queue(soloQueue)
                .build();

        log.info(gson.toJson(matchQueryParam));

        MultiValueMap param = matchQueryParam.getQueryParam();

        //when
        MatchlistDto matchlist = matchRestTemplate.getMatchlist(encryptedAccountId, matchQueryParam);

        //then
        log.info(gson.toJson(matchlist));
        int originalSize = matchlist.getMatches().size();
        int filteredSize = (int) matchlist.getMatches().stream()
                .map(MatchReferenceDto::getQueue)
                .filter(queue -> queue.equals(420))
                .count();
        assertThat(originalSize).isEqualTo(filteredSize);
    }
}