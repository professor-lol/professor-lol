package com.css.professorlol.ddragon.impl;

import com.css.professorlol.MockResponse;
import com.css.professorlol.config.properties.RiotProperties;
import com.css.professorlol.config.resttemplate.RiotRestTemplateBuilder;
import com.css.professorlol.ddragon.DdragonRestTemplate;
import com.css.professorlol.ddragon.dto.ChampionsDto;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

public class DdragonRestTemplateImplMockTest {

    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    private static final String CHAMPIONS = "/cdn/{version}/data/{language}/champion.json";

    private MockRestServiceServer mockServer;

    private DdragonRestTemplate ddragonRestTemplate;

    private static String getChampionsURI(String version, String language) {
        return UriComponentsBuilder.newInstance()
                .scheme("https")
                .host("ddragon.leagueoflegends.com")
                .path(CHAMPIONS)
                .buildAndExpand(version, language)
                .toUriString();
    }

    @Before
    public void setUp() throws Exception {
        RiotProperties riotProperties = new RiotProperties();
        riotProperties.setToken(new RiotProperties.Token());
        riotProperties.getToken().setValue("value");
        RestTemplateBuilder restTemplateBuilder = RiotRestTemplateBuilder.getDdragon(new RestTemplateBuilder(), riotProperties);
        RestTemplate restTemplate = restTemplateBuilder.build();
        mockServer = MockRestServiceServer.createServer(restTemplate);
        ddragonRestTemplate = new DdragonRestTemplateImpl(restTemplate);
    }

    @Test
    public void getChampions_챔피언_리스트_가져오기() {
        //given
        String version = "9.19.1";
        String language = "ko_KR";
        String uri = getChampionsURI(version, language);

        String mockBody = MockResponse.getChampionsDtoMockBody();

        this.mockServer.expect(requestTo(uri))
                .andRespond(withSuccess(mockBody, MediaType.APPLICATION_JSON_UTF8));
        //when
        ChampionsDto championsDto = ddragonRestTemplate.getChampions(version, language);

        //then
        System.out.println(gson.toJson(championsDto));
    }
}