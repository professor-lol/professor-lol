package com.ccs.professorlol.repository.mostchampion;

import com.ccs.professorlol.lolInfo.champion.MostChampion;
import com.ccs.professorlol.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MostChampionRepository extends JpaRepository<MostChampion, Long>, MostChampionRepositoryCustom {
    List<MostChampion> findAllByMember(Member member);
}
