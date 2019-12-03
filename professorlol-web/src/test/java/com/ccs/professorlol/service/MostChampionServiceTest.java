package com.ccs.professorlol.service;

import com.ccs.professorlol.dto.MostChampionAddReqDto;
import com.ccs.professorlol.lolInfo.champion.Champion;
import com.ccs.professorlol.lolInfo.champion.MostChampion;
import com.ccs.professorlol.lolInfo.champion.repository.ChampionRepository;
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
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
@ActiveProfiles("test")
public class MostChampionServiceTest {
    private static final String EMAIL = "aaa@gmail.com";

    @Autowired
    private MemberRepository memberRepository;
    @Autowired
    private MostChampionRepository mostChampionRepository;
    @Autowired
    private ChampionRepository championRepository;
    @Autowired
    private MostChampionService mostChampionService;

    @After
    public void tearDown() throws Exception {
        memberRepository.deleteAll();
        championRepository.deleteAll();
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

    @Test
    public void 챔피언_ID_리스트로_모스트_챔피언_추가_성공() {
        Member member = Member.createBuilder()
                .name("테스트")
                .summonerName("킹북골")
                .email(EMAIL)
                .memberType(MemberType.GOOGLE)
                .build();
        memberRepository.save(member);
        List<Champion> champions = championRepository.saveAll(generateMockChampions());
        List<Long> championIds = Arrays.asList(champions.get(0).getId(), champions.get(1).getId());

        MostChampionAddReqDto mostChampionAddReqDto = MostChampionAddReqDto.createBuilder()
                .championIds(championIds)
                .build();

        //when
        List<MostChampion> mostChampions = mostChampionService.addMostChampions(mostChampionAddReqDto);
        Member savedMember = memberRepository.findByEmailWithMostChampion(EMAIL);
        //then
        assertThat(savedMember.getMostChampions().size()).isEqualTo(2);
        assertThat(mostChampions.get(0).getMember().getEmail()).isEqualTo(EMAIL);
        assertThat(mostChampions.size()).isEqualTo(2);
        assertThat(mostChampions.get(0).getChampion().getName()).isEqualTo(champions.get(0).getName());

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

    private List<Champion> generateMockChampions() {
        Champion aatrox = Champion.builder()
                .key("1")
                .name("아트록스")
                .riotId("Aatrox")
                .build();
        Champion ahri = Champion.builder()
                .key("2")
                .name("아리")
                .riotId("Ahri")
                .build();
        Champion akali = Champion.builder()
                .key("3")
                .name("아칼리")
                .riotId("Akali")
                .build();

        Champion pantheon = Champion.builder()
                .key("4")
                .name("판테온")
                .riotId("Pantheon")
                .build();
        return Arrays.asList(ahri, pantheon, akali, aatrox);
    }
}