package com.ccs.professorlol.service;

import com.ccs.professorlol.dto.MemberSaveReqDto;
import com.ccs.professorlol.lolInfo.champion.Champion;
import com.ccs.professorlol.lolInfo.champion.ChampionRepository;
import com.ccs.professorlol.lolInfo.champion.MostChampion;
import com.ccs.professorlol.member.domain.Member;
import com.ccs.professorlol.repository.mostchampion.MostChampionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class MostChampionService {

    private final MostChampionRepository mostChampionRepository;
    private final ChampionRepository championRepository;

    public List<MostChampion> findByMember(Member member){
        return mostChampionRepository.findAllByMember(member);
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
