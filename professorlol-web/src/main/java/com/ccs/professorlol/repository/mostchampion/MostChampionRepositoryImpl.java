package com.ccs.professorlol.repository.mostchampion;

import com.ccs.professorlol.lolInfo.champion.MostChampion;
import com.ccs.professorlol.lolInfo.champion.QChampion;
import com.ccs.professorlol.member.domain.Member;
import com.ccs.professorlol.member.domain.QMember;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class MostChampionRepositoryImpl implements MostChampionRepositoryCustom{

    private final JPAQueryFactory queryFactory;

    @Override
    public List<MostChampion> findMostChampionByMember(Member member) {
        return queryFactory.select(
                Projections.fields(MostChampion.class,
                        QMember.member.id.as("member_id"),
                        QChampion.champion.id.as("champion_id"))
                )
                .from(QMember.member)
                .join(QChampion.champion).on(QMember.member.id.eq(QChampion.champion.id))
                .fetch();
    }
}
