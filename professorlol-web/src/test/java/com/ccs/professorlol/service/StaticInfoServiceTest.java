package com.ccs.professorlol.service;

import com.ccs.professorlol.dto.lolinfo.LolInfoResDto;
import com.ccs.professorlol.dto.lolinfo.LolInfoSaveDto;
import com.ccs.professorlol.dto.lolinfo.LolInfoUpdateDto;
import com.ccs.professorlol.dto.lolinfo.champion.ChampionResDto;
import com.ccs.professorlol.dto.lolinfo.champion.ChampionSaveDto;
import com.ccs.professorlol.dto.lolinfo.champion.ChampionUpdateDto;
import com.ccs.professorlol.dto.lolinfo.stat.StatResDto;
import com.ccs.professorlol.dto.lolinfo.stat.StatSaveDto;
import com.ccs.professorlol.dto.lolinfo.stat.StatUpdateDto;
import com.ccs.professorlol.lolInfo.LolInfo;
import com.ccs.professorlol.lolInfo.LolInfoRepository;
import com.ccs.professorlol.lolInfo.champion.Champion;
import com.ccs.professorlol.lolInfo.champion.Stat;
import com.ccs.professorlol.lolInfo.champion.StatRepository;
import com.ccs.professorlol.lolInfo.champion.repository.ChampionRepository;
import com.ccs.professorlol.lolInfo.exception.AlreadySavedException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

@ActiveProfiles("test")
@ExtendWith(SpringExtension.class)
@SpringBootTest
class StaticInfoServiceTest {

    @Autowired
    private StaticInfoService staticInfoService;

    @Autowired
    private LolInfoRepository lolInfoRepository;

    @Autowired
    private ChampionRepository championRepository;

    @Autowired
    private StatRepository statRepository;

    @AfterEach
    void tearDown() throws Exception {
        statRepository.deleteAll();
        lolInfoRepository.deleteAll();
        championRepository.deleteAll();
    }

    @DisplayName("LoL 패치노트 버전 저장")
    @Test
    void saveLolInfo_1() {
        String version = "9.22.1";

        LolInfoSaveDto lolInfoSaveDto = LolInfoSaveDto.builder()
                .patchNoteVersion(version)
                .build();

        LolInfoResDto lolInfoResDto = staticInfoService.saveLolInfo(lolInfoSaveDto);

        assertThat(lolInfoResDto.getPatchNoteVersion()).isEqualTo(version);
    }

    @DisplayName("Lol 패치노트 중복된 버전 저장 시도시")
    @Test
    void saveLolInfo_2() {
        String version = "9.22.1";

        LolInfoSaveDto lolInfoSaveDto = LolInfoSaveDto.builder()
                .patchNoteVersion(version)
                .build();

        staticInfoService.saveLolInfo(lolInfoSaveDto);

        assertThatThrownBy(() -> staticInfoService.saveLolInfo(lolInfoSaveDto))
                .isInstanceOf(AlreadySavedException.class);
    }

    @DisplayName("Lol 패치노트 버전 수정하기")
    @Test
    void updateLolInfo() {
        //given
        LolInfoSaveDto saveDto = LolInfoSaveDto.builder()
                .patchNoteVersion("9.22.1")
                .build();
        LolInfo lolInfo = lolInfoRepository.saveAndFlush(saveDto.toEntity());

        LolInfoUpdateDto updateDto = LolInfoUpdateDto.builder()
                .savedPatchVersion(lolInfo.getPatchNoteVersion())
                .changePatchVersion("바뀐버전")
                .build();

        //when
        LolInfoResDto lolInfoResDto = staticInfoService.updateLolInfo(updateDto);

        //then
        assertThat(lolInfoResDto.getPatchNoteVersion()).isEqualTo("바뀐버전");
    }

    @DisplayName("챔피언 정상저장")
    @Test
    void saveChampion_1() {
        ChampionSaveDto championSaveDto = ChampionSaveDto.builder()
                .name("아리")
                .key("Ahri")
                .riotId("109")
                .build();

        ChampionResDto championResDto = staticInfoService.saveChampion(championSaveDto);

        assertThat(championResDto.getKey()).isEqualTo(championSaveDto.getKey());
        assertThat(championResDto.getName()).isEqualTo(championSaveDto.getName());
        assertThat(championResDto.getRiotId()).isEqualTo(championSaveDto.getRiotId());
    }

    @DisplayName("중복된 챔피언 저장 시도시")
    @Test
    void saveChampion_2() {
        ChampionSaveDto championSaveDto = ChampionSaveDto.builder()
                .name("아리")
                .key("Ahri")
                .riotId("109")
                .build();

        staticInfoService.saveChampion(championSaveDto);

        assertThatThrownBy(() -> staticInfoService.saveChampion(championSaveDto))
                .isInstanceOf(AlreadySavedException.class);
    }

    @DisplayName("챔피언 정보업데이트")
    @Test
    void updateChampion_1() {
        ChampionSaveDto championSaveDto = ChampionSaveDto.builder()
                .name("바뀌기전 이름")
                .key("Ahri")
                .riotId("109")
                .build();

        Champion saveAhri = championRepository.saveAndFlush(championSaveDto.toEntity());

        ChampionUpdateDto championUpdateDto = ChampionUpdateDto.builder()
                .id(saveAhri.getId())
                .name("바꾼이름")
                .build();

        ChampionResDto championResDto = staticInfoService.updateChampion(championUpdateDto);

        assertThat(championResDto.getName()).isEqualTo("바꾼이름");
    }

    @DisplayName("Stat 정상저장")
    @Test
    void saveStat_1() {
        //given
        ChampionSaveDto championSaveDto = ChampionSaveDto.builder()
                .name("아리")
                .key("Ahri")
                .riotId("109")
                .build();
        Champion champion = championRepository.saveAndFlush(championSaveDto.toEntity());
        Long championId = champion.getId();

        LolInfoSaveDto lolInfoSaveDto = LolInfoSaveDto.builder()
                .patchNoteVersion("9.22.1")
                .build();
        LolInfo lolInfo = lolInfoRepository.saveAndFlush(lolInfoSaveDto.toEntity());
        Long lolInfoId = lolInfo.getId();

        StatSaveDto statSaveDto = StatSaveDto.builder()
                .championId(championId)
                .lolInfoId(lolInfoId)
                .hp(100)
                .build();

        //when
        StatResDto statResDto = staticInfoService.saveStat(statSaveDto);

        //then
        assertThat(statResDto.getHp()).isEqualTo(100);

        List<Stat> allStats = statRepository.findAll();
        assertThat(allStats.isEmpty()).isFalse();
        assertThat(allStats.get(0).getHp()).isEqualTo(100);
    }

    @DisplayName("기존 스탯 업데이트 하기")
    @Test
    void updateStat() {
        //given
        LolInfo lolInfo = lolInfoRepository.saveAndFlush(LolInfoSaveDto.makeLolInfo("1"));
        StatSaveDto statSaveDto = StatSaveDto.builder()
                .hp(10)
                .build();
        Stat savedStat = statRepository.saveAndFlush(statSaveDto.toEntity(lolInfo));

        //when
        StatUpdateDto statUpdateDto = StatUpdateDto.builder()
                .id(savedStat.getId())
                .lolInfoVersion(lolInfo.getPatchNoteVersion())
                .hp(100)
                .build();
        StatResDto statResDto = staticInfoService.updateStat(statUpdateDto);

        //then
        assertThat(statResDto.getHp()).isEqualTo(100);
    }
}