package com.ccs.professorlol.service;

import com.ccs.professorlol.dto.MemberSaveReqDto;
import com.ccs.professorlol.lolInfo.champion.Champion;
import com.ccs.professorlol.lolInfo.champion.ChampionRepository;
import com.ccs.professorlol.lolInfo.champion.MostChampion;
import com.ccs.professorlol.member.domain.Member;
import com.ccs.professorlol.repository.mostchampion.MostChampionRepository;
import com.ccs.professorlol.dto.MostChampionAddReqDto;
import com.ccs.professorlol.lolInfo.champion.Champion;
import com.ccs.professorlol.lolInfo.champion.ChampionRepository;
import com.ccs.professorlol.member.domain.MemberRepository;
import com.ccs.professorlol.security.store.AccessUserManager;
import com.ccs.professorlol.security.user.AccessUser;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class MostChampionService {

    private final AccessUserManager accessUserManager;
    private final MostChampionRepository mostChampionRepository;
    private final ChampionRepository championRepository;
    private final MemberRepository memberRepository;
    private final ChampionRepository championRepository;

    public List<MostChampion> findByMember(Member member) {
        return mostChampionRepository.findAllByMember(member);
    }

    public List<MostChampion> addMostChampion(MostChampionAddReqDto mostChampionAddReqDto) {

        AccessUser accessUser = accessUserManager.loadUserInfo();
        Member member = memberRepository.findByEmail(accessUser.getEmail());
        List<Champion> champions = championRepository.findAllByNameIn(mostChampionAddReqDto.getChampionNames());

        champions.stream().forEach(champion -> System.out.println(champion.getName()));

        List<MostChampion> mostChampions = champions.stream()
                .map(champion -> MostChampion.builder()
                        .champion(champion)
                        .member(member)
                        .build())
                .collect(Collectors.toList());

        return mostChampionRepository.saveAll(mostChampions);
    }

    public void saveMostChampion(MemberSaveReqDto memberSaveReqDto, Member member) {
        List<Champion> champions = memberSaveReqDto.getMostChampionDtos().stream()
                .map(mostChampionDto -> championRepository.findById(mostChampionDto.getId()).orElseThrow(IllegalAccessError::new))
                .collect(Collectors.toList());

        List<MostChampion> mostChampions = champions.stream()
                .map(champion -> MostChampion.builder()
                        .member(member)
                        .champion(champion)
                        .build())
                .collect(Collectors.toList());

        mostChampionRepository.saveAll(mostChampions);
    }
}
