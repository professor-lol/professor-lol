package com.ccs.professorlol.api;

import com.ccs.professorlol.dto.ChampionSimpleDto;
import com.ccs.professorlol.lolInfo.champion.Champion;
import com.ccs.professorlol.lolInfo.champion.repository.ChampionRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ActiveProfiles("test")
@SpringBootTest
@RunWith(SpringRunner.class)
public class ChampionControllerTest {

    private static final String CHAMPION_API_URL = "/api/v1/champion";

    @Autowired
    private ChampionRepository championRepository;

    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext)
                .addFilters(new CharacterEncodingFilter("UTF-8", true))
                .build();
    }

    @After
    public void tearDown() throws Exception {
        championRepository.deleteAll();
    }

    @Test
    public void 챔피언_전체_리스트_조회() throws Exception {
        //given
        championRepository.saveAll(generateMockChampions());
        List<ChampionSimpleDto> championSimpleDtos = championRepository.findAll().stream()
                .map(ChampionSimpleDto::new)
                .collect(Collectors.toList());
        //when
        //then
        final MvcResult mvcResult = mockMvc.perform(get(CHAMPION_API_URL + "/list"))
                .andExpect(status().isOk())
                .andDo(print())
                .andReturn();

        ObjectMapper mapper = new ObjectMapper();
        List<ChampionSimpleDto> response = mapper.readValue(mvcResult.getResponse().getContentAsString(),
                new TypeReference<List<ChampionSimpleDto>>() {
                });
        assertThat(championSimpleDtos.get(0).getName()).isEqualTo(response.get(0).getName());
        assertThat(championSimpleDtos.get(1).getName()).isEqualTo(response.get(1).getName());

    }

    public List<Champion> generateMockChampions() {
        Champion aatrox = Champion.builder()
                .key("1")
                .name("아트록스")
                .riotId("Aatrox")
                .build();
        Champion ahri = Champion.builder()
                .key("2")
                .name("아리")
                .riotId("Ahri")
                .build();
        Champion akali = Champion.builder()
                .key("3")
                .name("아칼리")
                .riotId("Akali")
                .build();
        return Arrays.asList(aatrox, ahri, akali);
    }
}