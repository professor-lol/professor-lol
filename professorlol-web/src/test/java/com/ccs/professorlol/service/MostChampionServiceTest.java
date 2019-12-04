package com.ccs.professorlol.service;

import com.ccs.professorlol.lolInfo.champion.Champion;
import com.ccs.professorlol.lolInfo.champion.ChampionRepository;
import com.ccs.professorlol.lolInfo.champion.MostChampion;
import com.ccs.professorlol.member.domain.Member;
import com.ccs.professorlol.member.domain.MemberRepository;
import com.ccs.professorlol.member.domain.MemberType;
import com.ccs.professorlol.repository.mostchampion.MostChampionRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

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

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    MostChampionRepository mostChampionRepository;


    @After
    public void tearDown() throws Exception {
        memberRepository.deleteAll();
        championRepository.deleteAll();
        mostChampionRepository.deleteAll();
    }

    @Test
    @Transactional
    public void 멤버로_모스트챔피언_조회_성공_테스트() {
        //given
        Member member = saveUser();
        //when
        List<MostChampion> mostChampions = mostChampionService.findByMember(member);
        //then
        assertThat(mostChampions.get(0).getChampion().getName()).isEqualTo("아리");
        assertThat(mostChampions.get(1).getChampion().getName()).isEqualTo("판테온");
    }

    private Member saveUser() {

        Member member = Member.createBuilder()
                .email("jaeyeon9327@gmail.com")
                .name("서재연")
                .summonerName("a1010100z")
                .memberType(MemberType.GOOGLE)
                .build();


        memberRepository.save(member);

        List<Champion> champions = new ArrayList<>();
        champions.add(Champion.builder()
                .name("아리")
                .build());
        champions.add(Champion.builder()
                .name("판테온")
                .build());
        championRepository.saveAll(champions);

        List<MostChampion> mostChampions = new ArrayList<>();
        mostChampions.add(MostChampion.builder()
                .member(member)
                .champion(champions.get(0))
                .build());
        mostChampions.add(MostChampion.builder()
                .member(member)
                .champion(champions.get(1))
                .build());

        mostChampionRepository.saveAll(mostChampions);

        return member;
    }

}