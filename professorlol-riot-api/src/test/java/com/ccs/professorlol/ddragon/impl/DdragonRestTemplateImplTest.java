package com.ccs.professorlol.ddragon.impl;

import com.ccs.professorlol.config.resttemplate.DdragonRestTemplateConfing;
import com.ccs.professorlol.ddragon.DdragonRestTemplate;
import com.ccs.professorlol.ddragon.dto.RealmsDto;
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

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
@ActiveProfiles("major")
public class DdragonRestTemplateImplTest {

    private static final Logger log = LoggerFactory.getLogger(SummonerRestTemplate.class);

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
        RealmsDto realmsDto = this.ddragonRestTemplate.getCurrentRealms("kr");
        //then
        assertThat(realmsDto.getN().getChampion()).isEqualTo("9.19.1");
    }

    @Test
    public void 챔피언_리스트_가져오기() {
        //given
        //when
        //then
    }
}