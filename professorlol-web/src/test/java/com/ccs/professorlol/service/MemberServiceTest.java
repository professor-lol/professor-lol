package com.ccs.professorlol.service;

import com.ccs.professorlol.dto.MemberSaveReqDto;
import com.ccs.professorlol.dto.MostChampionDto;
import com.ccs.professorlol.lolInfo.champion.Champion;
import com.ccs.professorlol.lolInfo.champion.ChampionRepository;
import com.ccs.professorlol.member.domain.Member;
import com.ccs.professorlol.member.domain.MemberRepository;
import com.ccs.professorlol.member.domain.MemberType;
import com.ccs.professorlol.repository.mostchampion.MostChampionRepository;
import com.ccs.professorlol.security.store.AccessUserManager;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@ActiveProfiles("test")
@SpringBootTest
@RunWith(SpringRunner.class)
public class MemberServiceTest {

    @Autowired
    MostChampionRepository mostChampionRepository;
    @Autowired
    MemberRepository memberRepository;
    @Autowired
    MemberService memberService;
    @Autowired
    AccessUserManager accessUserManager;
    @Autowired
    ChampionRepository championRepository;

    @After
    public void cleanUp() {
        mostChampionRepository.deleteAll();
        championRepository.deleteAll();
        memberRepository.deleteAll();
    }

    @Test
    public void 유저_저장_성공() {

        //given
        List<MostChampionDto> mostChampionDtos = settingMostChampionSaveDtos();

        MemberSaveReqDto memberSaveReqDto = MemberSaveReqDto.createBuilder()
                .summonerName("a1010100z")
                .mostChampionDtos(mostChampionDtos)
                .build();

        //when
        memberService.saveMember(memberSaveReqDto);

        //then
        Member member = memberService.findByEmail("aaa@gmail.com");
        assertThat(member.getSummonerName()).isEqualTo("a1010100z");
        assertThat(member.getEmail()).isEqualTo("aaa@gmail.com");
        assertThat(member.getName()).isEqualTo("테스트");
        assertThat(member.getMemberType()).isEqualTo(MemberType.GOOGLE);

      //  assertThat(member.getMostChampions().get(0).getChampion().getName()).isEqualTo("아리");
        assertThat(mostChampionRepository.findAllByMember(member).size()).isEqualTo(2);
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