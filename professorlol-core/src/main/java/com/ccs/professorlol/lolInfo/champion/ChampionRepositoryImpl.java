package com.ccs.professorlol.lolInfo.champion;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static com.ccs.professorlol.lolInfo.champion.QChampion.champion;

@RequiredArgsConstructor
public class ChampionRepositoryImpl implements ChampionRepositoryCustom {
    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public List<Champion> findAllByNameIn(List<String> championNames) {
        return jpaQueryFactory.selectFrom(champion)
                .where(champion.name.in(championNames))
                .fetch();
    }

    @Override
    public List<Champion> findAllByIdIn(List<Long> championIds) {
        return jpaQueryFactory.selectFrom(champion)
                .where(champion.id.in(championIds))
                .fetch();
    }
}
