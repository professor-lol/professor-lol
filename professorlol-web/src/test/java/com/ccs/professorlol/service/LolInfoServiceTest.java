package com.ccs.professorlol.service;

import com.ccs.professorlol.dto.lolinfo.ChampionResDto;
import com.ccs.professorlol.dto.lolinfo.ChampionSaveDto;
import com.ccs.professorlol.dto.lolinfo.LolInfoResDto;
import com.ccs.professorlol.dto.lolinfo.LolInfoSaveDto;
import com.ccs.professorlol.dto.lolinfo.StatResDto;
import com.ccs.professorlol.dto.lolinfo.StatSaveDto;
import com.ccs.professorlol.lolInfo.LolInfo;
import com.ccs.professorlol.lolInfo.LolInfoRepository;
import com.ccs.professorlol.lolInfo.champion.Champion;
import com.ccs.professorlol.lolInfo.champion.Stat;
import com.ccs.professorlol.lolInfo.champion.StatRepository;
import com.ccs.professorlol.lolInfo.champion.repository.ChampionRepository;
import com.ccs.professorlol.lolInfo.exception.AlreadyExistException;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest
public class LolInfoServiceTest {

    @Autowired
    private LolInfoService lolInfoService;

    @Autowired
    private LolInfoRepository lolInfoRepository;

    @Autowired
    private ChampionRepository championRepository;

    @Autowired
    private StatRepository statRepository;

    @After
    public void tearDown() throws Exception {
        statRepository.deleteAll();
        lolInfoRepository.deleteAll();
        championRepository.deleteAll();
    }

    @Test
    public void saveLolInfo_정상저장() {
        String version = "9.22.1";

        LolInfoSaveDto lolInfoSaveDto = LolInfoSaveDto.builder()
                .patchNoteVersion(version)
                .build();

        LolInfoResDto lolInfoResDto = lolInfoService.saveLolInfo(lolInfoSaveDto);

        assertThat(lolInfoResDto.getPatchNoteVersion()).isEqualTo(version);
    }

    @Test
    public void saveLolInfo_중복된_버전_저장_시도시() {
        String version = "9.22.1";

        LolInfoSaveDto lolInfoSaveDto = LolInfoSaveDto.builder()
                .patchNoteVersion(version)
                .build();

        lolInfoService.saveLolInfo(lolInfoSaveDto);
        lolInfoRepository.flush();

        assertThatThrownBy(() -> lolInfoService.saveLolInfo(lolInfoSaveDto))
                .isInstanceOf(AlreadyExistException.class);
    }

    @Test
    public void saveChampion_정상저장() {
        ChampionSaveDto championSaveDto = ChampionSaveDto.builder()
                .name("아리")
                .key("Ahri")
                .riotId("109")
                .build();

        ChampionResDto championResDto = lolInfoService.saveChampion(championSaveDto);

        assertThat(championResDto.getKey()).isEqualTo(championSaveDto.getKey());
        assertThat(championResDto.getName()).isEqualTo(championSaveDto.getName());
        assertThat(championResDto.getRiotId()).isEqualTo(championSaveDto.getRiotId());
    }

    @Test
    public void saveChampion_중복된_챔피언_저장_시도시() {
        ChampionSaveDto championSaveDto = ChampionSaveDto.builder()
                .name("아리")
                .key("Ahri")
                .riotId("109")
                .build();

        lolInfoService.saveChampion(championSaveDto);
        championRepository.flush();

        assertThatThrownBy(() -> lolInfoService.saveChampion(championSaveDto))
                .isInstanceOf(AlreadyExistException.class);
    }

    @Test
    public void saveStat_정상저장() {
        ChampionSaveDto championSaveDto = ChampionSaveDto.builder()
                .name("아리")
                .key("Ahri")
                .riotId("109")
                .build();
        Champion champion = championRepository.save(championSaveDto.toEntity());
        Long championId = champion.getId();
        championRepository.flush();

        LolInfoSaveDto lolInfoSaveDto = LolInfoSaveDto.builder()
                .patchNoteVersion("9.22.1")
                .build();
        LolInfo lolInfo = lolInfoRepository.save(lolInfoSaveDto.toEntity());
        Long lolInfoId = lolInfo.getId();
        lolInfoRepository.flush();

        StatSaveDto statSaveDto = StatSaveDto.builder()
                .hp(100)
                .build();
        StatResDto statResDto = lolInfoService.saveStat(statSaveDto, championId, lolInfoId);

        assertThat(statResDto.getHp()).isEqualTo(100);

        List<Stat> allStats = statRepository.findAll();
        assertThat(allStats.isEmpty()).isFalse();
        assertThat(allStats.get(0).getHp()).isEqualTo(100);
    }
}