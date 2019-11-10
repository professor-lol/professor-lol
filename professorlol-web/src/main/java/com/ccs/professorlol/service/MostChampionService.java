package com.ccs.professorlol.service;

import com.ccs.professorlol.lolInfo.champion.MostChampion;
import com.ccs.professorlol.member.domain.Member;
import com.ccs.professorlol.repository.mostchampion.MostChampionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MostChampionService {

    private final MostChampionRepository mostChampionRepository;

    public List<MostChampion> findByMember(Member member){
        return mostChampionRepository.findAllByMember(member);
    }
}
