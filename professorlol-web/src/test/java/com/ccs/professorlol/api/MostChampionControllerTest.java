package com.ccs.professorlol.api;

import com.ccs.professorlol.dto.MostChampionAddReqDto;
import com.ccs.professorlol.lolInfo.champion.Champion;
import com.ccs.professorlol.lolInfo.champion.ChampionRepository;
import com.ccs.professorlol.lolInfo.champion.MostChampion;
import com.ccs.professorlol.member.domain.Member;
import com.ccs.professorlol.member.domain.MemberRepository;
import com.ccs.professorlol.member.domain.MemberType;
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
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@ActiveProfiles("test")
@SpringBootTest
@RunWith(SpringRunner.class)
public class MostChampionControllerTest {

    public static final String EMAIL = "aaa@gmail.com";
    private static final String MOST_CHAMPION_API_URL = "/api/v1/most-champion";
    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private ChampionRepository championRepository;

    @Autowired
    private MostChampionRepository mostChampionRepository;

    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext)
                .addFilters(new CharacterEncodingFilter("UTF-8", true))
                .build();
        Member member = Member.createBuilder()
                .email(EMAIL)
                .memberType(MemberType.GOOGLE)
                .name("테스트")
                .summonerName("testSummoner")
                .build();
        memberRepository.save(member);
        championRepository.saveAll(generateMockChampions());
    }

    @After
    public void tearDown() throws Exception {
        memberRepository.deleteAll();
        championRepository.deleteAll();
    }

    @Test
    public void 모스트_챔피언_추가_성공() throws Exception {
        //given
        MostChampionAddReqDto mostChampionAddReqDto = MostChampionAddReqDto.createBuilder()
                .championIds(Arrays.asList(2L, 3L))
                .build();
        //when
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
        ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
        String requestJson = ow.writeValueAsString(mostChampionAddReqDto);
        //then

        final MvcResult mockMvcResult = mockMvc.perform(post(MOST_CHAMPION_API_URL)
                .content(requestJson)
                .contentType(MediaType.APPLICATION_JSON)
                .characterEncoding("UTF-8"))
                .andExpect(status().isOk())
                .andReturn();

        Member member = memberRepository.findByEmail(EMAIL);
        List<MostChampion> mostChampions = member.getMostChampions();

        assertThat(member.getEmail()).isEqualTo(EMAIL);
        assertThat(mostChampions.size()).isEqualTo(2);
        assertThat(mostChampions.get(0).getChampion().getName()).isEqualTo("아리");
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