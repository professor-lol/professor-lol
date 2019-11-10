package com.ccs.professorlol.api;

import com.ccs.professorlol.dto.MemberSaveReqDto;
import com.ccs.professorlol.dto.MostChampionDto;
import com.ccs.professorlol.lolInfo.champion.Champion;
import com.ccs.professorlol.lolInfo.champion.ChampionRepository;
import com.ccs.professorlol.member.domain.MemberRepository;
import com.ccs.professorlol.repository.mostchampion.MostChampionRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@ActiveProfiles("test")
@SpringBootTest
@RunWith(SpringRunner.class)
public class MemberControllerTest {

    private final static String API_URL = "/api/v1/user/";
    @Autowired
    MemberRepository memberRepository;
    @Autowired
    ChampionRepository championRepository;
    @Autowired
    MostChampionRepository mostChampionRepository;

    @Autowired
    private WebApplicationContext webApplicationContext;
    private MockMvc mockMvc;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @After
    public void cleanUp() {
        memberRepository.deleteAll();
    }

    @Test
    public void 정상_회원가입() throws Exception {
        MemberSaveReqDto memberSaveReqDto = MemberSaveReqDto.createBuilder()
                .summonerName("a1010100z")
                .mostChampionDtos(settingMostChampionSaveDtos())
                .build();
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
        ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
        String requestJson = ow.writeValueAsString(memberSaveReqDto);

        //given
        mockMvc.perform(post(API_URL)
                .contentType(MediaType.APPLICATION_JSON)
                .content(requestJson)
                .characterEncoding("UTF-8"))
                .andDo(print())
                .andExpect(status().isCreated())
                .andReturn();

        assertThat(mostChampionRepository.findAll().size() == 2);
    }

    private List<MostChampionDto> settingMostChampionSaveDtos() {
        List<Champion> champions = new ArrayList<>();
        champions.add(Champion.builder()
                .name("아리")
                .build());
        champions.add(Champion.builder()
                .name("판테온")
                .build());
        List<Champion> champions1 = championRepository.saveAll(champions);

        List<MostChampionDto> mostChampionDtos = new ArrayList<>();
        mostChampionDtos.add(MostChampionDto.builder()
                .id(champions1.get(0).getId())
                .name(champions1.get(0).getName()).build());
        mostChampionDtos.add(MostChampionDto.builder()
                .id(champions1.get(1).getId())
                .name(champions1.get(1).getName()).build());
        return mostChampionDtos;
    }
}