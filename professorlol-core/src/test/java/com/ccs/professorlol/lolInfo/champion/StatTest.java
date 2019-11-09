package com.ccs.professorlol.lolInfo.champion;

import com.ccs.professorlol.lolInfo.LolInfo;
import com.ccs.professorlol.lolInfo.champion.dto.StatSaveDto;
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
public class StatTest {

    @Autowired
    private StatRepository statRepository;

    @After
    public void tearDown() throws Exception {
        statRepository.deleteAll();
    }

    @Test
    public void Stat_정상저장_LolInfo_Champion_같이저장() {
        LolInfo lolInfo = LolInfo.builder()
                .patchNoteVersion("9.1.12")
                .build();

        Champion champion = Champion.builder()
                .riotId("Ahri")
                .key(109)
                .name("아리")
                .build();

        StatSaveDto statSaveDto = StatSaveDto.builder()
                .hp(10D)
                .build();

        Stat stat = statSaveDto.toEntity(lolInfo, champion);

        statRepository.save(stat);

        assertThat(stat.getHp()).isEqualTo(10D);
        assertThat(stat.getLolInfo().getPatchNoteVersion()).isEqualTo("9.1.12");
        assertThat(stat.getChampion().getName()).isEqualTo("아리");
    }
}