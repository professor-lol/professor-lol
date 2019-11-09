package com.ccs.professorlol.lolInfo.champion;

import com.ccs.professorlol.lolInfo.champion.dto.ChampionSaveDto;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@DataJpaTest
@Transactional(propagation = Propagation.NOT_SUPPORTED)
public class ChampionTest {

    @Autowired
    private ChampionRepository championRepository;

    @After
    public void tearDown() throws Exception {
        championRepository.deleteAll();
    }

    @Test
    public void Champion_정상저장() {
        ChampionSaveDto championSaveDto = ChampionSaveDto.builder()
                .name("아리")
                .id("Ahri")
                .key(109)
                .build();
        Champion champion = championSaveDto.toEntity();

        championRepository.save(champion);
        Champion maybeAhri = championRepository.findAll().get(0);
        assertThat(maybeAhri.getName()).isEqualTo("아리");
    }
}