package com.ccs.professorlol.ddragon.impl;

import com.ccs.professorlol.MockResponse;
import com.ccs.professorlol.config.properties.RiotProperties;
import com.ccs.professorlol.config.resttemplate.DdragonRestTemplateBuilder;
import com.ccs.professorlol.ddragon.DdragonRestTemplate;
import com.ccs.professorlol.ddragon.dto.RealmsDto;
import com.ccs.professorlol.ddragon.dto.champion.DdragonChampionFullsDto;
import com.ccs.professorlol.ddragon.dto.champion.DdragonChampionSimplesDto;
import com.ccs.professorlol.ddragon.dto.item.ItemDataDto;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

public class DdragonRestTemplateImplMockTest {

    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    private static final String REALMS = "/realms/kr.json";

    private static final String CHAMPIONS = "/cdn/{version}/data/ko_KR/champion.json";

    private static final String CHAMPION_FULLS = "/cdn/{version}/data/ko_KR/championFull.json";

    private static final String ITEMS = "/cdn/{version}/data/ko_KR/item.json";

    private MockRestServiceServer mockServer;

    private DdragonRestTemplate ddragonRestTemplate;

    @Before
    public void setUp() throws Exception {
        RiotProperties riotProperties = new RiotProperties();
        riotProperties.setToken(new RiotProperties.Token());
        riotProperties.getToken().setValue("value");
        RestTemplateBuilder restTemplateBuilder = DdragonRestTemplateBuilder.getDdragon(new RestTemplateBuilder(), riotProperties);
        RestTemplate restTemplate = restTemplateBuilder.build();
        mockServer = MockRestServiceServer.createServer(restTemplate);
        ddragonRestTemplate = new DdragonRestTemplateImpl(restTemplate);
    }

    private static String getRealmsURI() {
        return UriComponentsBuilder.newInstance()
                .scheme("https")
                .host("ddragon.leagueoflegends.com")
                .path(REALMS)
                .toUriString();
    }

    @Test
    public void getChampions_챔피언_리스트_가져오기() {
        //given
        String version = "9.18.1";
        String uri = getChampionsURI(version);

        String mockBody = MockResponse.getChampionsDtoMockBody();

        this.mockServer.expect(requestTo(uri))
                .andRespond(withSuccess(mockBody, MediaType.APPLICATION_JSON_UTF8));
        //when
        DdragonChampionSimplesDto champions = ddragonRestTemplate.getChampionSimples(version);

        //then
        assertThat(champions.getVersion()).isEqualTo(version);
        assertThat(champions.getChampions().get(0).getId()).isEqualTo("Aatrox");
        System.out.println(gson.toJson(champions));
    }

    @Test
    public void getChampionFulls_스탯_스펠_있는_챔피언_리스트_가져오기() {
        //given
        String version = "9.21.1";
        String uri = getChampionFullsURI(version);

        String mockBody = MockResponse.getChampionFullsDtoMockBody();

        this.mockServer.expect(requestTo(uri))
                .andRespond(withSuccess(mockBody, MediaType.APPLICATION_JSON_UTF8));
        //when
        DdragonChampionFullsDto championFulls = ddragonRestTemplate.getChampionFulls(version);
        //then
        assertThat(championFulls.getChampionFullDtos().get(0).getVersion()).isEqualTo("9.13.1");
        assertThat(championFulls.getChampionFullDtos().get(0).getSpells().get(0).getName()).isEqualTo("다르킨의 검");
        assertThat(championFulls.getChampionFullDtos().size()).isEqualTo(14);
    }

    private String getChampionFullsURI(String version) {
        return UriComponentsBuilder.newInstance()
                .scheme("https")
                .host("ddragon.leagueoflegends.com")
                .path(CHAMPION_FULLS)
                .buildAndExpand(version)
                .toUriString();
    }

    private static String getChampionsURI(String version) {
        return UriComponentsBuilder.newInstance()
                .scheme("https")
                .host("ddragon.leagueoflegends.com")
                .path(CHAMPIONS)
                .buildAndExpand(version)
                .toUriString();
    }

    private static String getItemsURI(String version) {
        return UriComponentsBuilder.newInstance()
                .scheme("https")
                .host("ddragon.leagueoflegends.com")
                .path(ITEMS)
                .buildAndExpand(version)
                .toUriString();
    }

    @Test
    public void getCurrentRealms_ddragon_버전_정보_가져오기() {
        //given
        String uri = getRealmsURI();

        String mockBody = MockResponse.getRealmsDtoMockBody();

        this.mockServer.expect(requestTo(uri))
                .andRespond(withSuccess(mockBody, MediaType.APPLICATION_JSON_UTF8));
        //when
        RealmsDto realmsDto = ddragonRestTemplate.getCurrentRealms();
        //then
        assertThat(realmsDto.getL()).isEqualTo("ko_KR");
        assertThat(realmsDto.getLolDataVersion().getChampion()).isEqualTo("9.19.1");
    }

    @Test
    public void getItems_아이템_리스트_가져오기() {
        //given
        String version = "9.19.1";
        String uri = getItemsURI(version);

        String mockBody = MockResponse.getItemsDtoMockBody();

        this.mockServer.expect(requestTo(uri))
                .andRespond(withSuccess(mockBody, MediaType.APPLICATION_JSON_UTF8));
        //when
        ItemDataDto items = ddragonRestTemplate.getItems(version);
        //then
        assertThat(items.getVersion()).isEqualTo(version);
        assertThat(items.getItems().get(0).getName()).isEqualTo("속도의 장화");
        assertThat(items.getItems().get(0).getStats().getFlatMovementSpeedMod()).isEqualTo(25);
    }
}