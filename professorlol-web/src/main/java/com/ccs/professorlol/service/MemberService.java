package com.ccs.professorlol.service;

import com.ccs.professorlol.dto.MemberSaveReqDto;
import com.ccs.professorlol.member.domain.Member;
import com.ccs.professorlol.member.domain.MemberRepository;
import com.ccs.professorlol.member.domain.MemberType;
import com.ccs.professorlol.security.store.AccessUserManager;
import com.ccs.professorlol.security.user.AccessUser;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;


@Service
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberService {

    private final MemberRepository memberRepository;
    private final AccessUserManager accessUserManager;


    public Member findByEmail(String email) {
        return memberRepository.findByEmail(email);
    }

    public Member saveUser(MemberSaveReqDto memberSaveReqDto) {
        if (isExist(memberSaveReqDto.getLolId())) {
            throw new IllegalArgumentException("이미 해당 lol 아이디로 가입된 계정이 존재합니다!!!");
        }
        AccessUser accessUser = accessUserManager.loadUserInfo();
        Member user = Member.createBuilder()
                .email(accessUser.getEmail())
                .name(accessUser.getName())
                .lolId(memberSaveReqDto.getLolId())
                .memberType(findMemberTypeByEmail(accessUser.getEmail()))
                .build();
        return memberRepository.save(user);
    }

    private boolean isExist(String lolId) {
        return memberRepository.findByLolId(lolId) != null ? true : false;
    }

    private MemberType findMemberTypeByEmail(String email) {
        String domain = email.substring(email.indexOf('@') + 1);
        return Arrays.asList(MemberType.values()).stream()
                .filter(memberType -> memberType.getDomain().equals(domain))
                .findAny()
                .orElseThrow(IllegalAccessError::new);

    }

}
