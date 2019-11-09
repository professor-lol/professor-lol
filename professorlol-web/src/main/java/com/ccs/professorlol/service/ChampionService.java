package com.ccs.professorlol.service;

import com.ccs.professorlol.dto.ChampionSelectResDto;
import com.ccs.professorlol.dto.ChampionsResDto;
import com.ccs.professorlol.lolInfo.champion.Champion;
import com.ccs.professorlol.lolInfo.champion.ChampionRepository;
import com.ccs.professorlol.member.domain.MemberRepository;
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

    public List<ChampionsResDto> findAll() {
        return championRepository.findAll().stream()
                .map(ChampionsResDto::new)
                .collect(Collectors.toList());
    }

    public void findAllWithMostChampions() {

    }
}
