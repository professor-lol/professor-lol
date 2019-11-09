package com.ccs.professorlol.service;

import com.ccs.professorlol.dto.ChampionSelectResDto;
import com.ccs.professorlol.dto.ChampionSimpleDto;
import com.ccs.professorlol.lolInfo.champion.Champion;
import com.ccs.professorlol.lolInfo.champion.ChampionRepository;
import com.ccs.professorlol.lolInfo.champion.MostChampion;
import com.ccs.professorlol.member.domain.Member;
import com.ccs.professorlol.member.domain.MemberRepository;
import com.ccs.professorlol.security.store.AccessUserManager;
import com.ccs.professorlol.security.user.AccessUser;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class ChampionService {
    private final MemberRepository memberRepository;
    private final ChampionRepository championRepository;
    private final AccessUserManager accessUserManager;

    public List<ChampionSimpleDto> findAll() {
        return championRepository.findAll().stream()
                .map(ChampionSimpleDto::new)
                .collect(Collectors.toList());
    }

    public ChampionSelectResDto findAllWithMostChampions() {

        AccessUser accessUser = accessUserManager.loadUserInfo();
        Member loginMember = memberRepository.findByEmail(accessUser.getEmail());

        List<Champion> mostChampions = loginMember.getMostChampion().stream()
                .map(MostChampion::getChampion)
                .collect(Collectors.toList());

        List<Champion> notMostChampions = championRepository.findAll().stream()
                .filter(champion -> !mostChampions.contains(champion))
                .collect(Collectors.toList());

        return ChampionSelectResDto.builder()
                .mostChampions(mostChampions)
                .notMostChampions(notMostChampions)
                .build();
    }
}
