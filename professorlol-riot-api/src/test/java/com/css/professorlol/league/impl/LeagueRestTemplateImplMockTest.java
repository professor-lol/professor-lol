package com.css.professorlol.league.impl;

import com.css.professorlol.MockResponse;
import com.css.professorlol.config.exception.BadRequestException;
import com.css.professorlol.config.properties.XRiotTokenProperties;
import com.css.professorlol.config.resttemplate.LeagueRestTemplateConfig;
import com.css.professorlol.league.LeagueRestTemplate;
import com.css.professorlol.league.dto.LeagueEntryDto;
import com.css.professorlol.summoner.impl.SummonerRestTemplateImplMockTest;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.MockRestServiceServer;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withBadRequest;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

@RestClientTest(value = {LeagueRestTemplateConfig.class, XRiotTokenProperties.class})
@RunWith(SpringRunner.class)
@ActiveProfiles("major")
public class LeagueRestTemplateImplMockTest {

    private static final Logger log = LoggerFactory.getLogger(SummonerRestTemplateImplMockTest.class);
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    private static final String LOL_LEAGUE_V_4_ENTRIES_BY_SUMMONER = "/lol/league/v4/entries/by-summoner/";

    @Autowired
    private MockRestServiceServer mockServer;

    @Autowired
    private LeagueRestTemplate leagueRestTemplate;

    @Test
    public void getLeagueEntries_정상조회() {
        //given
        final String encodedSummonerId = "CaCXBYf1LRYJ_45q8pxteN3FzJwE5NZavjyLVXXt6UP5";
        final String mockBody = MockResponse.getLeagueMockBody();

        this.mockServer.expect(requestTo(LOL_LEAGUE_V_4_ENTRIES_BY_SUMMONER + encodedSummonerId))
                .andRespond(withSuccess(mockBody, MediaType.APPLICATION_JSON_UTF8));

        //when
        Set<LeagueEntryDto> leagueEntryDtoSet = leagueRestTemplate.getLeagueEntries(encodedSummonerId);

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
        Set<LeagueEntryDto> leagueEntryDtoSet = leagueRestTemplate.getLeagueEntries(encodedSummonerId);

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
        assertThatThrownBy(() -> leagueRestTemplate.getLeagueEntries(encodedSummonerId))
                .isInstanceOf(BadRequestException.class);
    }

    @Test
    public void getLeagueEntries_널값_입력시() {
        //given
        final String encodedSummonerId = null;

        //when
        //then
        assertThatThrownBy(() -> leagueRestTemplate.getLeagueEntries(encodedSummonerId))
                .isInstanceOf(BadRequestException.class)
                .hasMessage("The Summoner ID must be entered.");
    }

    @Test
    public void getLeagueEntries_공백_입력시() {
        //given
        final String encodedSummonerId = "";

        //when
        //then
        assertThatThrownBy(() -> leagueRestTemplate.getLeagueEntries(encodedSummonerId))
                .isInstanceOf(BadRequestException.class)
                .hasMessage("The Summoner ID must be entered.");
    }

}