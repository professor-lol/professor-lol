package com.css.professorlol.match.impl;

import com.css.professorlol.MockResponse;
import com.css.professorlol.config.exception.NotCorrectInputException;
import com.css.professorlol.config.exception.RiotClientException;
import com.css.professorlol.config.properties.RiotProperties;
import com.css.professorlol.config.restTemplate.RiotRestTemplateBuilder;
import com.css.professorlol.match.MatchRestTemplate;
import com.css.professorlol.match.dto.match.MatchDto;
import com.css.professorlol.match.dto.matchList.MatchQueryParam;
import com.css.professorlol.match.dto.matchList.MatchlistDto;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.*;

public class MatchRestTemplateImplMockTest {

    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private static final Logger log = LoggerFactory.getLogger(MatchRestTemplateImplMockTest.class);

    private static final String MATCH_LIST_URI = "/lol/match/v4/matchlists/by-account/{encryptedAccountId}?queue={soloQueue}&season={season}&endTime={endTime}&beginTime={beginTime}&endIndex={endIndex}&beginIndex={beginIndex}";
    private static final String MATCH_URI = "/lol/match/v4/matches/{matchId}";

    private MockRestServiceServer mockServer;

    private MatchRestTemplate matchRestTemplate;

    private static String getMatchListUri(MatchQueryParam matchQueryParam, String encryptedAccountId) {
        Map<String, Object> params = matchQueryParam.getQueryParam();
        params.put("encryptedAccountId", encryptedAccountId);

        return UriComponentsBuilder.newInstance()
                .scheme("https")
                .host("kr.api.riotgames.com")
                .path(MATCH_LIST_URI)
                .buildAndExpand(params)
                .toUriString();
    }

    private static String getMatchUri(Long matchId) {
        return UriComponentsBuilder.newInstance()
                .scheme("https")
                .host("kr.api.riotgames.com")
                .path(MATCH_URI)
                .buildAndExpand(matchId)
                .toUriString();
    }

    @Before
    public void setUp() throws Exception {
        RiotProperties riotProperties = new RiotProperties();
        riotProperties.setToken(new RiotProperties.Token());
        riotProperties.getToken().setValue("value");
        RestTemplateBuilder restTemplateBuilder = RiotRestTemplateBuilder.get(new RestTemplateBuilder(), riotProperties);
        RestTemplate restTemplate = restTemplateBuilder.build();
        mockServer = MockRestServiceServer.createServer(restTemplate);
        matchRestTemplate = new MatchRestTemplateImpl(restTemplate);
    }

    @Test
    public void getMatchList_정상입력_파라미터_없음() {
        //given
        String encryptedAccountId = "w94qxPIxhJ2ALZoRItVSwyN6R-CNMXOE1VJwesmrZdAv";
        MatchQueryParam matchQueryParam = MatchQueryParam.builder()
                .build();

        String mockBody = MockResponse.getMatchListMockBody();

        String uri = getMatchListUri(matchQueryParam, encryptedAccountId);

        mockServer.expect(requestTo(uri))
                .andRespond(withSuccess(mockBody, MediaType.APPLICATION_JSON_UTF8));

        //when
        MatchlistDto matchlistDto = matchRestTemplate.getMatchList(encryptedAccountId, matchQueryParam);

        //then
        assertThat(matchlistDto).isNotNull();
        assertThat(matchlistDto.getMatches()).isNotNull();
        assertThat(matchlistDto.getMatches()).isNotEmpty();
        log.info(gson.toJson(matchlistDto));
    }

    @Test
    public void getMatchList_잘못된_종료_시간값으로_요청() {
        //given
        String encryptedAccountId = "w94qxPIxhJ2ALZoRItVSwyN6R-CNMXOE1VJwesmrZdAv";
        String badRequestBody = MockResponse.getExceptionResponseBody("Bad Request", HttpStatus.BAD_REQUEST);
        MatchQueryParam matchQueryParam = MatchQueryParam.builder()
                .endTime(0L)
                .build();

        String uri = getMatchListUri(matchQueryParam, encryptedAccountId);


        mockServer.expect(requestTo(uri))
                .andRespond(withBadRequest().body(badRequestBody).contentType(MediaType.APPLICATION_JSON_UTF8));

        //when
        //then exception
        assertThatThrownBy(() -> matchRestTemplate.getMatchList(encryptedAccountId, matchQueryParam))
                .isInstanceOf(NotCorrectInputException.class);
    }

    @Test
    public void getMatchList_잘못된_시작_시간값으로_요청() {
        //given
        String encryptedAccountId = "w94qxPIxhJ2ALZoRItVSwyN6R-CNMXOE1VJwesmrZdAv";
        String badRequestBody = MockResponse.getExceptionResponseBody("Not found", HttpStatus.NOT_FOUND);
        MatchQueryParam matchQueryParam = MatchQueryParam.builder()
                .beginTime(15617397445077L)
                .build();

        String uri = getMatchListUri(matchQueryParam, encryptedAccountId);

        mockServer.expect(requestTo(uri))
                .andRespond(withStatus(HttpStatus.NOT_FOUND).body(badRequestBody).contentType(MediaType.APPLICATION_JSON_UTF8));

        //when
        //then exception
        assertThatThrownBy(() -> matchRestTemplate.getMatchList(encryptedAccountId, matchQueryParam))
                .isInstanceOf(RiotClientException.class);

    }

    @Test
    public void getMatch_정상입력() {
        //given
        Long matchId = 3724003832L;
        String mockBody = MockResponse.getMatchMockBody();

        String uri = getMatchUri(matchId);

        mockServer.expect(requestTo(uri))
                .andRespond(withSuccess(mockBody, MediaType.APPLICATION_JSON_UTF8));
        //when
        MatchDto match = matchRestTemplate.getMatchByMatchId(matchId);

        //then
        assertThat(match).isNotNull();
        assertThat(match.getParticipants()).isNotNull();
        assertThat(match.getParticipants()).isNotEmpty();
        log.info(gson.toJson(match));
    }

    @Test
    public void getMatch_없는경기() {
        //given
        Long matchId = 3724003831L;
        String mockNotFoundBody = MockResponse.getExceptionResponseBody("Not found!!", HttpStatus.NOT_FOUND);

        String uri = getMatchUri(matchId);

        mockServer.expect(requestTo(uri))
                .andRespond(withStatus(HttpStatus.NOT_FOUND).body(mockNotFoundBody).contentType(MediaType.APPLICATION_JSON_UTF8));

        //when
        //then exception
        assertThatThrownBy(() -> matchRestTemplate.getMatchByMatchId(matchId))
                .isInstanceOf(RiotClientException.class);

    }

    @Test
    public void getMatchList_널값_입력시() {
        //given
        String encryptedAccountId = null;
        MatchQueryParam matchQueryParam = MatchQueryParam.builder()
                .build();

        String uri = getMatchListUri(matchQueryParam, encryptedAccountId);

        mockServer.expect(requestTo(uri))
                .andRespond(withSuccess("mockBody", MediaType.APPLICATION_JSON_UTF8));

        //when
        //then
        assertThatThrownBy(() -> matchRestTemplate.getMatchList(encryptedAccountId, matchQueryParam))
                .isInstanceOf(NotCorrectInputException.class)
                .hasMessage("The Account ID must be entered.");
    }

    @Test
    public void getMatchList_공백_입력시() {
        //given
        String encryptedAccountId = "";
        MatchQueryParam matchQueryParam = MatchQueryParam.builder()
                .build();

        String uri = getMatchListUri(matchQueryParam, encryptedAccountId);

        mockServer.expect(requestTo(uri))
                .andRespond(withSuccess("mockBody", MediaType.APPLICATION_JSON_UTF8));

        //when
        //then
        assertThatThrownBy(() -> matchRestTemplate.getMatchList(encryptedAccountId, matchQueryParam))
                .isInstanceOf(NotCorrectInputException.class)
                .hasMessage("The Account ID must be entered.");
    }

    @Test
    public void getMatch_0_보다_작은값_입력시() {
        //given
        Long matchId = -1L;

        String uri = getMatchUri(matchId);

        mockServer.expect(requestTo(uri))
                .andRespond(withSuccess("mockBody", MediaType.APPLICATION_JSON_UTF8));

        //when
        //then
        assertThatThrownBy(() -> matchRestTemplate.getMatchByMatchId(matchId))
                .isInstanceOf(NotCorrectInputException.class)
                .hasMessage("The Match ID can not be less than 0.");

    }
}