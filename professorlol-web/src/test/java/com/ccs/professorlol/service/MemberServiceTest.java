package com.ccs.professorlol.service;

import com.ccs.professorlol.dto.MemberResponseDto;
import com.ccs.professorlol.dto.MemberSaveReqDto;
import com.ccs.professorlol.lolInfo.champion.Champion;
import com.ccs.professorlol.lolInfo.champion.ChampionRepository;
import com.ccs.professorlol.lolInfo.champion.MostChampion;
import com.ccs.professorlol.lolInfo.champion.MostChampionRepository;
import com.ccs.professorlol.member.domain.Member;
import com.ccs.professorlol.member.domain.MemberRepository;
import com.ccs.professorlol.member.domain.MemberType;
import com.ccs.professorlol.security.store.AccessUserManager;
import com.ccs.professorlol.security.user.AccessUser;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

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
        memberRepository.deleteAll();
    }

    @Test
    public void 유저_저장_성공() {
        //given
        MemberSaveReqDto memberSaveReqDto = MemberSaveReqDto.createBuilder()
                .summonerName("a1010100z")
                .build();
        //when
        memberService.saveUser(memberSaveReqDto);

        //then
        Member member = memberService.findByEmail("aaa@gmail.com");
        assertThat(member.getSummonerName()).isEqualTo("a1010100z");
        assertThat(member.getEmail()).isEqualTo("aaa@gmail.com");
        assertThat(member.getName()).isEqualTo("테스트");
        assertThat(member.getMemberType()).isEqualTo(MemberType.GOOGLE);
    }

    @Test
    public void 롤아이디_중복_가입_실패() {
        MemberSaveReqDto memberSaveReqDto = MemberSaveReqDto.createBuilder()
                .summonerName("already")
                .build();

        memberService.saveUser(memberSaveReqDto);
        //when
        //then
        assertThatThrownBy(() -> memberService.saveUser(memberSaveReqDto))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void 로그인한_유저_정보_조회() {
        //given
        AccessUser accessUser = accessUserManager.loadUserInfo();
        Champion champion = Champion.builder()
                .name("아리")
                .key("1")
                .riotId("roitId")
                .build();

        Member member = Member.createBuilder()
                .name(accessUser.getName())
                .email(accessUser.getEmail())
                .summonerName("서머너1")
                .memberType(MemberType.GOOGLE)
                .build();


        MostChampion mostChampion = MostChampion.builder()
                .member(member)
                .champion(champion)
                .build();

        mostChampionRepository.save(mostChampion);


        //when
        MemberResponseDto memberResponseDto = memberService.findMemberWithRiotInfoByAccessUser();

        //then
        assertThat(memberResponseDto.getEmail()).isEqualTo("aaa@gmail.com");
        assertThat(memberResponseDto.getMostChampions().get(0)).isEqualTo("아리");
        assertThat(memberResponseDto.getName()).isEqualTo("테스트");
        assertThat(memberResponseDto.getSummonerName()).isEqualTo("서머너1");
    }
}