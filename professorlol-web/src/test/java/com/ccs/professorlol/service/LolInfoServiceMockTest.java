package com.ccs.professorlol.service;

import com.ccs.professorlol.ddragon.DdragonRestTemplate;
import com.ccs.professorlol.ddragon.dto.RealmsDto;
import com.ccs.professorlol.ddragon.dto.champion.DdragonChampionSimplesDto;
import com.ccs.professorlol.ddragon.dto.champion.DdragonChampionStandAloneDto;
import com.ccs.professorlol.ddragon.dto.champion.StatDto;
import com.ccs.professorlol.lolInfo.LolInfo;
import com.ccs.professorlol.lolInfo.LolInfoRepository;
import com.ccs.professorlol.lolInfo.champion.Champion;
import com.ccs.professorlol.lolInfo.champion.ChampionRepository;
import com.ccs.professorlol.lolInfo.champion.StatRepository;
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
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.BDDMockito.given;

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional(propagation = Propagation.NOT_SUPPORTED)
public class LolInfoServiceMockTest {

    @Autowired
    private LolInfoService lolInfoService;

    @Autowired
    private ChampionRepository championRepository;

    @Autowired
    private StatRepository statRepository;

    @MockBean
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
    public void saveDdragonData_정상저장() {
        given(ddragonRestTemplate.getCurrentRealms())
                .willReturn(getCurrentRealms());
        given(ddragonRestTemplate.getChampionSimples("9.22.1"))
                .willReturn(getTestChampionDataDto());
        given(lolInfoRepository.findByPatchNoteVersion("9.22.1"))
                .willReturn(Optional.empty());

        boolean result = lolInfoService.saveDdragonData();
        assertThat(result).isTrue();

        List<Champion> champions = championRepository.findAll();
        assertThat(champions.isEmpty()).isFalse();
    }

    @Test
    public void saveDdragonData_새로운패치_없는경우() {
        given(ddragonRestTemplate.getCurrentRealms())
                .willReturn(getCurrentRealms());
        given(lolInfoRepository.findByPatchNoteVersion("9.22.1"))
                .willReturn(Optional.of(new LolInfo(1L, "9.22.1")));

        boolean result = lolInfoService.saveDdragonData();
        assertThat(result).isFalse();
    }

    private DdragonChampionSimplesDto getTestChampionDataDto() {
        StatDto statDto = StatDto.testBuilder()
                .build();
        DdragonChampionStandAloneDto championDto = DdragonChampionStandAloneDto.testBuilder()
                .name("아리")
                .id("109")
                .key("Ahri")
                .stats(statDto)
                .build();
        return DdragonChampionSimplesDto.testBuilder()
                .champions(Arrays.asList(championDto))
                .build();
    }

    private RealmsDto getCurrentRealms() {
        RealmsDto.LoLDataVersion loLDataVersion = RealmsDto.LoLDataVersion.testBuilder()
                .champion("9.22.1")
                .build();
        return RealmsDto.testBuilder()
                .lolDataVersion(loLDataVersion)
                .build();
    }

}