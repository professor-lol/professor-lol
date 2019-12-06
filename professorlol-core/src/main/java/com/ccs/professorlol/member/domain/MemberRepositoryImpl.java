package com.ccs.professorlol.member.domain;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import static com.ccs.professorlol.lolInfo.champion.QMostChampion.mostChampion;
import static com.ccs.professorlol.member.domain.QMember.member;

public class MemberRepositoryImpl extends QuerydslRepositorySupport implements MemberRepositoryCustom {
    public MemberRepositoryImpl() {
        super(Member.class);
    }

    @Override
    public Member findByEmailWithMostChampion(String email) {
        return super.from(member)
                .leftJoin(member.mostChampions, mostChampion)
                .fetchJoin()
                .where(member.email.eq(email))
                .fetchOne();
    }
}
