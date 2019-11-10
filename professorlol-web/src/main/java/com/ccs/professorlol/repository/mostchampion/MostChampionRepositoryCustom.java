package com.ccs.professorlol.repository.mostchampion;

import com.ccs.professorlol.lolInfo.champion.MostChampion;
import com.ccs.professorlol.member.domain.Member;

import java.util.List;

public interface MostChampionRepositoryCustom {
    List<MostChampion> findMostChampionByMember(Member member);
}
