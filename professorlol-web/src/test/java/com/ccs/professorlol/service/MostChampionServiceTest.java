package com.ccs.professorlol.service;

import com.ccs.professorlol.dto.MemberSaveReqDto;
import com.ccs.professorlol.dto.MostChampionDto;
import com.ccs.professorlol.lolInfo.champion.Champion;
import com.ccs.professorlol.lolInfo.champion.ChampionRepository;
import com.ccs.professorlol.lolInfo.champion.MostChampion;
import com.ccs.professorlol.member.domain.Member;
import com.ccs.professorlol.member.domain.MemberRepository;
import com.ccs.professorlol.member.domain.MemberType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
@ActiveProfiles("test")
public class MostChampionServiceTest {

    @Autowired
    MemberService memberService;
    @Autowired
    ChampionRepository championRepository;

    @Autowired
    MostChampionService mostChampionService;

    @Test
    public void 멤버로_모스트챔피언_조회_성공_테스트() {
        //given
        Member member = saveUser();
        //when
        List<MostChampion> mostChampions = mostChampionService.findByMember(member);
        //then
        assertThat(mostChampions.get(0).getChampion().getName()).isEqualTo("아리");
        assertThat(mostChampions.get(1).getChampion().getName()).isEqualTo("판테온");
    }

    private Member saveUser(){
        List<MostChampionDto> mostChampionDtos = settingMostChampionSaveDtos();

        MemberSaveReqDto memberSaveReqDto = MemberSaveReqDto.createBuilder()
                .summonerName("a1010100z")
                .mostChampionDtos(mostChampionDtos)
                .build();

        return memberService.saveMember(memberSaveReqDto);
    }

    private List<MostChampionDto> settingMostChampionSaveDtos() {
        List<Champion> champions = new ArrayList<>();
        champions.add(Champion.builder()
                .name("아리")
                .build());
        champions.add(Champion.builder()
                .name("판테온")
                .build());
        List<Champion> champions1 = championRepository.saveAll(champions);

        List<MostChampionDto> mostChampionDtos = new ArrayList<>();
        mostChampionDtos.add(MostChampionDto.builder()
                .id(champions1.get(0).getId())
                .name(champions1.get(0).getName()).build());
        mostChampionDtos.add(MostChampionDto.builder()
                .id(champions1.get(1).getId())
                .name(champions1.get(1).getName()).build());
        return mostChampionDtos;
    }
}