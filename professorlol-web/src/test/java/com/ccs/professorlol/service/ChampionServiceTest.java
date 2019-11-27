package com.ccs.professorlol.service;

import com.ccs.professorlol.dto.ChampionSimpleDto;
import com.ccs.professorlol.lolInfo.champion.Champion;
import com.ccs.professorlol.lolInfo.champion.repository.ChampionRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@ActiveProfiles("test")
@SpringBootTest
@RunWith(SpringRunner.class)
public class ChampionServiceTest {
    @MockBean(name = "championRepository")
    private ChampionRepository championRepository;

    @Autowired
    private ChampionService championService;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void 챔피언_전체_리스트_조회_성공() {
        //given
        given(championRepository.findAll())
                .willReturn(generateMockChampions());
        //when
        List<ChampionSimpleDto> championSimpleDtos = championService.findAllChampionSimples();
        //then
        assertThat(championSimpleDtos.size()).isEqualTo(3);
        assertThat(championSimpleDtos.get(1).getRiotId()).isEqualTo("Ahri");
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