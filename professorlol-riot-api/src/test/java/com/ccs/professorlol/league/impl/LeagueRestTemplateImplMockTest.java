package com.ccs.professorlol.league.impl;

import com.ccs.professorlol.MockResponse;
import com.ccs.professorlol.config.exception.NotCorrectInputException;
import com.ccs.professorlol.config.properties.RiotProperties;
import com.ccs.professorlol.config.resttemplate.RiotRestTemplateBuilder;
import com.ccs.professorlol.league.LeagueRestTemplate;
import com.ccs.professorlol.league.dto.LeagueEntryDto;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.util.ResourceUtils;
import org.springframework.web.client.RestTemplate;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withBadRequest;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

public class LeagueRestTemplateImplMockTest {

    private static final Logger log = LoggerFactory.getLogger(LeagueRestTemplateImplMockTest.class);
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    private static final String LOL_LEAGUE_V_4_ENTRIES_BY_SUMMONER = "https://kr.api.riotgames.com/lol/league/v4/entries/by-summoner/";

    private MockRestServiceServer mockServer;

    private LeagueRestTemplate leagueRestTemplate;

    @Before
    public void setUp() throws Exception {
        RiotProperties riotProperties = new RiotProperties();
        riotProperties.setToken(new RiotProperties.Token());
        riotProperties.getToken().setValue("value");
        RestTemplateBuilder restTemplateBuilder = RiotRestTemplateBuilder.get(new RestTemplateBuilder(), riotProperties);
        RestTemplate restTemplate = restTemplateBuilder.build();
        leagueRestTemplate = new LeagueRestTemplateImpl(restTemplate);
        mockServer = MockRestServiceServer.createServer(restTemplate);
    }

    @Test
    public void test() {
        try {
            JsonParser jsonParser = new JsonParser();
            FileReader fileReader = new FileReader(ResourceUtils.getFile("classpath:mock/LeagueMockBody.json"));
            Set<LeagueEntryDto> leagueEntryDtos = gson.fromJson(jsonParser.parse(fileReader), LeagueEntrySet.class);
            log.info(gson.toJson(leagueEntryDtos));
        } catch (Exception e) {

        }
    }

    @Test
    public void getLeagueEntries_정상조회() throws IOException {
        //given
        final String encodedSummonerId = "CaCXBYf1LRYJ_45q8pxteN3FzJwE5NZavjyLVXXt6UP5";
        final String mockBody = MockResponse.getLeagueMockBody();
        JsonParser jsonParser = new JsonParser();
        FileReader fileReader = new FileReader(ResourceUtils.getFile("classpath:mock/LeagueMockBody.json"));
        Set<LeagueEntryDto> leagueEntryDtos = gson.fromJson(jsonParser.parse(fileReader), LeagueEntrySet.class);

        this.mockServer.expect(requestTo(LOL_LEAGUE_V_4_ENTRIES_BY_SUMMONER + encodedSummonerId))
                .andRespond(withSuccess(mockBody, MediaType.APPLICATION_JSON_UTF8));

        //when
        Set<LeagueEntryDto> leagueEntryDtoSet = leagueRestTemplate.getLeagueEntriesBySummonerId(encodedSummonerId);

        //then
        assertThat(leagueEntryDtoSet).isNotNull();
        assertThat(leagueEntryDtoSet).isNotEmpty();
        log.info(gson.toJson(leagueEntryDtoSet));
    }

    @Test
    public void getLeagueEntries_정상조회_결과없음() {
        //given
        String encodedSummonerId = "ssgqMEzI5DLXfQGYyYVJKZUqMpT-qvjbwJqw_CaRJl6i0A";
        String expectJson = new JsonParser().parse("[]")
                .getAsJsonArray()
                .toString();

        this.mockServer.expect(requestTo(LOL_LEAGUE_V_4_ENTRIES_BY_SUMMONER + encodedSummonerId))
                .andRespond(withSuccess(expectJson, MediaType.APPLICATION_JSON_UTF8));

        //when
        Set<LeagueEntryDto> leagueEntryDtoSet = leagueRestTemplate.getLeagueEntriesBySummonerId(encodedSummonerId);

        //then
        assertThat(leagueEntryDtoSet).isNotNull();
        assertThat(leagueEntryDtoSet).isEmpty();
        log.info(gson.toJson(leagueEntryDtoSet));
    }

    @Test
    public void getSummonerDto_잘못된_입력값() {
        //given
        String encodedSummonerId = "wUIpM_FpV6kGdN15plnbstnSBbh33CFxoHJgdkhbaa4GCga";

        String badRequestBody = MockResponse.getExceptionResponseBody("Bad Request! - Exception decrypting wUIpM_FpV6kGdN15plnbstnSBbh33CFxoHJgdkhbaa4GCga", HttpStatus.BAD_REQUEST);

        this.mockServer.expect(requestTo(LOL_LEAGUE_V_4_ENTRIES_BY_SUMMONER + encodedSummonerId))
                .andRespond(withBadRequest()
                        .body(badRequestBody)
                        .contentType(MediaType.APPLICATION_JSON_UTF8));

        //when
        //then
        assertThatThrownBy(() -> leagueRestTemplate.getLeagueEntriesBySummonerId(encodedSummonerId))
                .isInstanceOf(NotCorrectInputException.class);
    }

    @Test
    public void getLeagueEntries_널값_입력시() {
        //given
        final String encodedSummonerId = null;

        //when
        //then
        assertThatThrownBy(() -> leagueRestTemplate.getLeagueEntriesBySummonerId(encodedSummonerId))
                .isInstanceOf(NotCorrectInputException.class)
                .hasMessage("The Summoner ID must be entered.");
    }

    @Test
    public void getLeagueEntries_공백_입력시() {
        //given
        final String encodedSummonerId = "";

        //when
        //then
        assertThatThrownBy(() -> leagueRestTemplate.getLeagueEntriesBySummonerId(encodedSummonerId))
                .isInstanceOf(NotCorrectInputException.class)
                .hasMessage("The Summoner ID must be entered.");
    }

    private static class LeagueEntrySet extends HashSet<LeagueEntryDto> {
    }

}