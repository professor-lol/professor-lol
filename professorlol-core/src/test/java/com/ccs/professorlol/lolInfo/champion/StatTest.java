package com.ccs.professorlol.lolInfo.champion;

import com.ccs.professorlol.lolInfo.LolInfo;
import com.ccs.professorlol.lolInfo.LolInfoRepository;
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

    @Autowired
    private ChampionRepository championRepository;

    @Autowired
    private LolInfoRepository lolInfoRepository;

    @After
    public void tearDown() throws Exception {
        statRepository.deleteAll();
        championRepository.deleteAll();
        lolInfoRepository.deleteAll();
    }

    @Test
    public void Stat_챔피언_저장할때_같이저장() {
        LolInfo lolInfo = LolInfo.builder()
                .patchNoteVersion("9.1.12")
                .build();
        lolInfo = lolInfoRepository.save(lolInfo);

        Champion champion = Champion.builder()
                .riotId("Ahri")
                .key("109")
                .name("아리")
                .build();

        Stat stat = Stat.builder()
                .hp(10)
                .lolInfo(lolInfo)
                .build();

        champion.addStat(stat);

        championRepository.save(champion);

        assertThat(champion.getStats().get(0).getHp()).isEqualTo(10);
        assertThat(champion.getStats().get(0).getLolInfo().getPatchNoteVersion()).isEqualTo("9.1.12");
        assertThat(champion.getName()).isEqualTo("아리");
    }
}