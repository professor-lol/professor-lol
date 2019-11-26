package com.ccs.professorlol.service;

import com.ccs.professorlol.lolInfo.LolInfoRepository;
import com.ccs.professorlol.lolInfo.champion.Champion;
import com.ccs.professorlol.lolInfo.champion.ChampionRepository;
import com.ccs.professorlol.lolInfo.champion.StatRepository;
import org.junit.After;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
@Ignore
public class DdragronServiceTest {

    @Autowired
    private DdragronService ddragronService;

    @Autowired
    private ChampionRepository championRepository;

    @Autowired
    private LolInfoRepository lolInfoRepository;

    @Autowired
    private StatRepository statRepository;

    @After
    public void tearDown() throws Exception {
        statRepository.deleteAll();
        lolInfoRepository.deleteAll();
        championRepository.deleteAll();
    }

    @Test
    public void saveDdragonData() {
        ddragronService.saveDdragonData();

        List<Champion> champions = championRepository.findAll();
        assertThat(champions.isEmpty()).isFalse();
    }
}