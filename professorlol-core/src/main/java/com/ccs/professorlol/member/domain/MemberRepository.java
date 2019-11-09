package com.ccs.professorlol.member.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findByEmail(String email);

    Member findMemberBySummonerName(String summonerName);
}
