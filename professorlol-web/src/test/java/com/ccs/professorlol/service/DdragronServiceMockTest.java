package com.ccs.professorlol.service;

import com.ccs.professorlol.ddragon.DdragonRestTemplate;
import com.ccs.professorlol.ddragon.dto.RealmsDto;
import com.ccs.professorlol.ddragon.dto.champion.DdragonChampionSimplesDto;
import com.ccs.professorlol.ddragon.dto.champion.DdragonChampionStandAloneDto;
import com.ccs.professorlol.ddragon.dto.champion.StatDto;
import com.ccs.professorlol.lolInfo.LolInfo;
import com.ccs.professorlol.lolInfo.LolInfoRepository;
import com.ccs.professorlol.lolInfo.champion.Champion;
import com.ccs.professorlol.lolInfo.champion.StatRepository;
import com.ccs.professorlol.lolInfo.champion.repository.ChampionRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.mockito.BDDMockito.given;

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional(propagation = Propagation.NOT_SUPPORTED)
public class DdragronServiceMockTest {

    @Autowired
    private DdragronService ddragronService;

    @Autowired
    private ChampionRepository championRepository;

    @Autowired
    private StatRepository statRepository;

    @Autowired
    private LolInfoRepository lolInfoRepository;

    @MockBean
    private DdragonRestTemplate ddragonRestTemplate;

    @After
    public void tearDown() throws Exception {
        statRepository.deleteAll();
        lolInfoRepository.deleteAll();
        championRepository.deleteAll();
    }

    @Test
    public void saveDdragonData_최초정상저장() {
        given(ddragonRestTemplate.getCurrentRealms())
                .willReturn(aRealms("9.22.1"));
        given(ddragonRestTemplate.getChampionSimples("9.22.1"))
                .willReturn(aChampionDataDto());

        ddragronService.saveDdragonData();

        List<Champion> champions = championRepository.findAll();
        assertThat(champions.isEmpty()).isFalse();
    }

    @Test
    public void saveDdragonData_스탯만_추가저장() {
        //given
        given(ddragonRestTemplate.getCurrentRealms())
                .willReturn(aRealms("9.22.1"));
        given(ddragonRestTemplate.getChampionSimples("9.22.1"))
                .willReturn(aChampionDataDto());

        ddragronService.saveDdragonData();

        List<Champion> champions = championRepository.findAllFetch();
        Champion ahri = champions.get(0);

        assertThat(ahri.getStats().size()).isEqualTo(1);

        //when
        given(ddragonRestTemplate.getCurrentRealms())
                .willReturn(aRealms("9.22.2"));
        given(ddragonRestTemplate.getChampionSimples("9.22.2"))
                .willReturn(aChampionDataDto());

        ddragronService.saveDdragonData();

        //then
        champions = championRepository.findAllFetch();
        ahri = champions.get(0);

        assertThat(ahri.getStats().size()).isEqualTo(2);
    }

    @Test
    public void saveDdragonData_새로운패치_없는경우() {
        given(ddragonRestTemplate.getCurrentRealms())
                .willReturn(aRealms("9.22.1"));
        lolInfoRepository.saveAndFlush(new LolInfo(1L, "9.22.1"));

        assertThatThrownBy(() -> ddragronService.saveDdragonData())
                .isInstanceOf(IllegalArgumentException.class);
    }

    private DdragonChampionSimplesDto aChampionDataDto() {
        StatDto statDto = StatDto.testBuilder()
                .hp(10)
                .build();
        DdragonChampionStandAloneDto championDto1 = DdragonChampionStandAloneDto.testBuilder()
                .name("아리")
                .id("109")
                .key("Ahri")
                .stats(statDto)
                .build();
        DdragonChampionStandAloneDto championDto2 = DdragonChampionStandAloneDto.testBuilder()
                .name("베이가")
                .id("110")
                .key("Veiga")
                .stats(statDto)
                .build();
        return DdragonChampionSimplesDto.testBuilder()
                .champions(Arrays.asList(championDto1, championDto2))
                .build();
    }

    private RealmsDto aRealms(String version) {
        RealmsDto.LoLDataVersion loLDataVersion = RealmsDto.LoLDataVersion.testBuilder()
                .champion(version)
                .build();
        return RealmsDto.testBuilder()
                .lolDataVersion(loLDataVersion)
                .build();
    }

}