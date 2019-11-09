package com.ccs.professorlol.ddragon.impl;

import com.ccs.professorlol.config.resttemplate.DdragonRestTemplateConfing;
import com.ccs.professorlol.ddragon.DdragonRestTemplate;
import com.ccs.professorlol.ddragon.dto.RealmsDto;
import com.ccs.professorlol.ddragon.dto.champion.DdragonChampionDto;
import com.ccs.professorlol.ddragon.dto.champion.DdragonChampionFullsDto;
import com.ccs.professorlol.ddragon.dto.champion.DdragonChampionSimplesDto;
import com.ccs.professorlol.ddragon.dto.champion.DdragonChampionStandAloneDto;
import com.ccs.professorlol.ddragon.dto.item.ItemDataDto;
import com.ccs.professorlol.ddragon.dto.item.ItemDto;
import com.ccs.professorlol.summoner.SummonerRestTemplate;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

//TODO : 항상 최신 버전 찌르고 가져오는거 추가해야함

@SpringBootTest
@RunWith(SpringRunner.class)
@ActiveProfiles("major")
public class DdragonRestTemplateImplTest {

    private static final Logger log = LoggerFactory.getLogger(SummonerRestTemplate.class);

    private static final String VERSION = "9.22.1";

    @Autowired
    private DdragonRestTemplateConfing.MajorDdragonConfig majorDdragonConfig;

    private DdragonRestTemplate ddragonRestTemplate;

    @Before
    public void setUp() throws Exception {
        this.ddragonRestTemplate = majorDdragonConfig.DdragonRestTemplate();
    }

    @Test
    public void ddragon_버전_정보_가져오기() {
        //given
        //when
        RealmsDto realmsDto = this.ddragonRestTemplate.getCurrentRealms();
        //then
        assertThat(realmsDto.getLolDataVersion().getChampion()).isEqualTo(VERSION);
    }

    @Test
    public void 챔피언_리스트_가져오기() {
        //given
        DdragonChampionSimplesDto ddragonChampionSimplesDto = this.ddragonRestTemplate.getChampionSimples(VERSION);
        List<DdragonChampionStandAloneDto> champions = ddragonChampionSimplesDto.getChampions();
        //when
        //then
        assertThat(champions.get(0).getId()).isEqualTo("Aatrox");
    }

    @Test
    public void 챔피언_스펠_포함_리스트_가져오기() {
        DdragonChampionFullsDto ddragonChampionFullsDto = this.ddragonRestTemplate.getChampionFulls(VERSION);
        List<DdragonChampionDto> championFulls = ddragonChampionFullsDto.getChampionFullDtos();

        assertThat(championFulls.size()).isEqualTo(146);

        assertThat(championFulls.get(0).getName()).isEqualTo("아트록스");
        assertThat(championFulls.get(0).getPartype()).isEqualTo("피의 샘");
        assertThat(championFulls.get(0).getInfo().getDifficulty()).isEqualTo(4);
        assertThat(championFulls.get(0).getSpells().get(0).getName()).isEqualTo("다르킨의 검");
    }

    @Test
    public void 아이템_리스트_가져오기() {
        //given
        ItemDataDto itemDataDto = this.ddragonRestTemplate.getItems(VERSION);
        List<ItemDto> itemDtos = itemDataDto.getItems();
        //when
        //then
        assertThat(itemDtos.get(0).getName()).isEqualTo("속도의 장화");
        assertThat(itemDtos.get(0).getStats().getFlatMovementSpeedMod()).isEqualTo(25);
    }
}