package com.ccs.professorlol.lolInfo.champion;

import com.ccs.professorlol.lolInfo.LolInfo;
import com.ccs.professorlol.lolInfo.LolInfoRepository;
import com.ccs.professorlol.lolInfo.champion.repository.ChampionRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@ActiveProfiles("test")
@ExtendWith(SpringExtension.class)
@DataJpaTest
@Transactional(propagation = Propagation.NOT_SUPPORTED)
public class ChampionTest {

    @Autowired
    private ChampionRepository championRepository;

    @Autowired
    private LolInfoRepository lolInfoRepository;

    @AfterEach
    public void tearDown() throws Exception {
        championRepository.deleteAll();
    }

    @DisplayName("챔피언 저장하기")
    @Test
    public void Champion_1() {
        Champion champion = Champion.builder()
                .name("아리")
                .riotId("Ahri")
                .key("109")
                .build();

        championRepository.save(champion);
        Champion maybeAhri = championRepository.findAll().get(0);
        assertThat(maybeAhri.getName()).isEqualTo("아리");
    }

    @DisplayName("가장 최근에 생성된 스탯 가져오기")
    @Test
    public void getLatestStat_1() {
        //given
        LolInfo lolInfo = LolInfo.builder()
                .patchNoteVersion("1")
                .build();
        LolInfo savedLolInfo = lolInfoRepository.saveAndFlush(lolInfo);

        Champion champion = Champion.builder()
                .name("아리")
                .riotId("Ahri")
                .key("109")
                .build();

        Stat firstStat = Stat.builder()
                .hp(1)
                .lolInfo(savedLolInfo)
                .build();

        champion.addStat(firstStat);

        championRepository.saveAndFlush(champion);

        //when
        LolInfo latestLolInfo = LolInfo.builder()
                .patchNoteVersion("2")
                .build();
        LolInfo savedLatestLolInfo = lolInfoRepository.saveAndFlush(latestLolInfo);

        Champion ahri = championRepository.findByNameFetch("아리").orElseThrow(RuntimeException::new);

        Stat latestStat = Stat.builder()
                .hp(2)
                .lolInfo(savedLatestLolInfo)
                .build();
        ahri.addStat(latestStat);

        championRepository.saveAndFlush(ahri);

        //then
        Champion latestAhri = championRepository.findByNameFetch("아리").orElseThrow(RuntimeException::new);

        Integer expect = latestAhri.getLatestStat()
                .getHp();
        assertThat(expect).isEqualTo(2);
    }
}