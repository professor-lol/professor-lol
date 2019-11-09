package com.ccs.professorlol.service;

import com.ccs.professorlol.dto.MemberSaveReqDto;
import com.ccs.professorlol.member.domain.Member;
import com.ccs.professorlol.member.domain.MemberRepository;
import com.ccs.professorlol.member.domain.MemberType;
import com.ccs.professorlol.security.store.AccessUserManager;
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
    MemberRepository memberRepository;
    @Autowired
    MemberService memberService;
    @Autowired
    AccessUserManager accessUserManager;

    @After
    public void cleanUp() {
        memberRepository.deleteAll();
    }

    @Test
    public void 유저_저장_성공() {
        //given
        MemberSaveReqDto memberSaveReqDto = MemberSaveReqDto.createBuilder()
                .lolId("a1010100z")
                .build();
        //when
        memberService.saveUser(memberSaveReqDto);

        //then
        Member member = memberService.findByEmail("aaa@gmail.com");
        assertThat(member.getLolId()).isEqualTo("a1010100z");
        assertThat(member.getEmail()).isEqualTo("aaa@gmail.com");
        assertThat(member.getName()).isEqualTo("테스트");
        assertThat(member.getMemberType()).isEqualTo(MemberType.GOOGLE);
    }

    @Test
    public void 롤아이디_중복_가입_실패() {
        MemberSaveReqDto memberSaveReqDto = MemberSaveReqDto.createBuilder()
                .lolId("already")
                .build();

        memberService.saveUser(memberSaveReqDto);
        //when
        //then
        assertThatThrownBy(() -> memberService.saveUser(memberSaveReqDto))
                .isInstanceOf(IllegalArgumentException.class);
    }

}