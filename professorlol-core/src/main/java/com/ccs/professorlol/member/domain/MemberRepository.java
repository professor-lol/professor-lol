package com.ccs.professorlol.member.domain;

import com.ccs.professorlol.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findByEmail(String email);
    Member findMemberBySummonerName(String summonerName);
}
