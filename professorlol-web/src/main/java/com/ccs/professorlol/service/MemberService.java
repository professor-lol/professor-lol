package com.ccs.professorlol.service;

import com.ccs.professorlol.config.exception.RiotClientException;
import com.ccs.professorlol.dto.MemberResponseDto;
import com.ccs.professorlol.dto.MemberSaveReqDto;
import com.ccs.professorlol.lolInfo.champion.Champion;
import com.ccs.professorlol.lolInfo.champion.MostChampion;
import com.ccs.professorlol.member.domain.Member;
import com.ccs.professorlol.member.domain.MemberRepository;
import com.ccs.professorlol.member.domain.MemberType;
import com.ccs.professorlol.security.store.AccessUserManager;
import com.ccs.professorlol.security.user.AccessUser;
import com.ccs.professorlol.summoner.SummonerRestTemplate;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberService {

    private final MemberRepository memberRepository;
    private final AccessUserManager accessUserManager;
    private final SummonerRestTemplate summonerRestTemplate;


    public Member findByEmail(final String email) {
        return memberRepository.findByEmail(email);
    }

    public Member saveUser(MemberSaveReqDto memberSaveReqDto) {
        if (isExist(memberSaveReqDto.getSummonerName())) {
            throw new IllegalArgumentException("이미 해당 lol 아이디로 가입된 계정이 존재합니다!!!");
        }
        isExistSummoner(memberSaveReqDto.getSummonerName());

        AccessUser accessUser = accessUserManager.loadUserInfo();
        Member user = Member.createBuilder()
                .email(accessUser.getEmail())
                .name(accessUser.getName())
                .summonerName(memberSaveReqDto.getSummonerName())
                .memberType(findMemberTypeByEmail(accessUser.getEmail()))
                .build();
        return memberRepository.save(user);
    }

    public MemberResponseDto findMemberWithRiotInfoByAccessUser() {
        AccessUser accessUser = accessUserManager.loadUserInfo();
        Member member = memberRepository.findByEmail(accessUser.getEmail());
        MemberResponseDto memberResponseDto = MemberResponseDto.createBuilder()
                .email(member.getEmail())
                .name(member.getName())
                .summonerName(member.getSummonerName())
                .mostChampions(member.getMostChampion().stream()
                        .map(MostChampion::getChampion)
                        .map(Champion::getName)
                        .collect(Collectors.toList()))
                .build();
        return memberResponseDto;
    }


    private boolean isExist(String summonerName) {
        return memberRepository.findMemberBySummonerName(summonerName) != null ? true : false;
    }

    private MemberType findMemberTypeByEmail(final String email) {
        String domain = email.substring(email.indexOf('@') + 1);
        return Arrays.asList(MemberType.values()).stream()
                .filter(memberType -> memberType.getDomain().equals(domain))
                .findAny()
                .orElseThrow(IllegalAccessError::new);

    }


    private void isExistSummoner(final String summonerName) {
        try {
            summonerRestTemplate.getSummonerDtoBySummonerName(summonerName);
        } catch (RiotClientException re) {
            throw new IllegalArgumentException("존재하지 않는 소환사입니다");
        }
    }

}

