package com.css.professorlol.match.impl;

import com.css.professorlol.MockResponse;
import com.css.professorlol.config.exception.BadRequestException;
import com.css.professorlol.config.exception.ClientException;
import com.css.professorlol.config.properties.XRiotTokenProperties;
import com.css.professorlol.config.resttemplate.MatchRestTemplateConfig;
import com.css.professorlol.match.MatchRestTemplate;
import com.css.professorlol.match.domain.Queue;
import com.css.professorlol.match.dto.match.MatchDto;
import com.css.professorlol.match.dto.matchList.MatchQueryParam;
import com.css.professorlol.match.dto.matchList.MatchlistDto;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.MockRestServiceServer;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.*;

@RestClientTest(value = {XRiotTokenProperties.class, MatchRestTemplateConfig.class})
@RunWith(SpringRunner.class)
public class MatchRestTemplateImplMockTest {

    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private static final Logger log = LoggerFactory.getLogger(MatchRestTemplateImplMockTest.class);

    private static final String MATCH_LIST_BY_ACCOUNT_URL = "/lol/match/v4/matchlists/by-account/";
    private static final String DEFAULT_QUEUE = "?queue=" + Queue.SOLO.getValue() + "&queue=" + Queue.FREE.getValue();
    private static final String NO_QUERY_PARAMETER = "&season=&endTime=&beginTime=&endIndex=&beginIndex=";
    private static final String MATCH_URL = "/lol/match/v4/matches/";


    @Autowired
    private MockRestServiceServer mockServer;

    @Autowired
    private MatchRestTemplate matchRestTemplate;

    @Test
    public void getMatchList_정상입력_파라미터_없음() {
        //given
        String encryptedSummonerId = "w94qxPIxhJ2ALZoRItVSwyN6R-CNMXOE1VJwesmrZdAv";
        MatchQueryParam matchQueryParam = MatchQueryParam.testBuilder()
                .build();

        String mockBody = MockResponse.getMatchListMockBody();

        mockServer.expect(requestTo(MATCH_LIST_BY_ACCOUNT_URL + encryptedSummonerId + DEFAULT_QUEUE + NO_QUERY_PARAMETER))
                .andRespond(withSuccess(mockBody, MediaType.APPLICATION_JSON_UTF8));

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
        String badRequestBody = MockResponse.getExceptionResponseBody("Bad Request", HttpStatus.BAD_REQUEST);
        MatchQueryParam matchQueryParam = MatchQueryParam.testBuilder()
                .endTime(0L)
                .build();

        mockServer.expect(requestTo(MATCH_LIST_BY_ACCOUNT_URL + encryptedSummonerId + DEFAULT_QUEUE + "&season=&endTime=0&beginTime=&endIndex=&beginIndex="))
                .andRespond(withBadRequest().body(badRequestBody).contentType(MediaType.APPLICATION_JSON_UTF8));

        //when
        matchRestTemplate.getMatchList(encryptedSummonerId, matchQueryParam);

        //then exception
    }

    @Test(expected = ClientException.class)
    public void getMatchList_잘못된_시작_시간값으로_요청() {
        //given
        String encryptedSummonerId = "w94qxPIxhJ2ALZoRItVSwyN6R-CNMXOE1VJwesmrZdAv";
        String badRequestBody = MockResponse.getExceptionResponseBody("Not found", HttpStatus.NOT_FOUND);
        MatchQueryParam matchQueryParam = MatchQueryParam.testBuilder()
                .beginTime(15617397445077L)
                .build();

        mockServer.expect(requestTo(MATCH_LIST_BY_ACCOUNT_URL + encryptedSummonerId + DEFAULT_QUEUE + "&season=&endTime=&beginTime=15617397445077&endIndex=&beginIndex="))
                .andRespond(withStatus(HttpStatus.NOT_FOUND).body(badRequestBody).contentType(MediaType.APPLICATION_JSON_UTF8));

        //when
        matchRestTemplate.getMatchList(encryptedSummonerId, matchQueryParam);

        //then exception
    }

    @Test
    public void getMatch_정상입력() {
        //given
        Long matchId = 3724003832L;
        String mockBody = MockResponse.getMatchMockBody();

        mockServer.expect(requestTo(MATCH_URL + matchId))
                .andRespond(withSuccess(mockBody, MediaType.APPLICATION_JSON_UTF8));
        //when
        MatchDto match = matchRestTemplate.getMatch(matchId);

        //then
        assertThat(match).isNotNull();
        assertThat(match.getParticipants()).isNotNull();
        assertThat(match.getParticipants()).isNotEmpty();
        log.info(gson.toJson(match));
    }

    @Test(expected = ClientException.class)
    public void getMatch_없는경기() {
        //given
        Long matchId = 3724003831L;
        String mockNotFoundBody = MockResponse.getExceptionResponseBody("Not found!!", HttpStatus.NOT_FOUND);

        mockServer.expect(requestTo(MATCH_URL + matchId))
                .andRespond(withStatus(HttpStatus.NOT_FOUND).body(mockNotFoundBody).contentType(MediaType.APPLICATION_JSON_UTF8));

        //when
        matchRestTemplate.getMatch(matchId);

        //then exception
    }

}