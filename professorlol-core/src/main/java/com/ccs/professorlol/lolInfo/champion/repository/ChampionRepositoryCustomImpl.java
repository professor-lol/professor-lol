package com.ccs.professorlol.lolInfo.champion.repository;

import com.ccs.professorlol.lolInfo.champion.Champion;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static com.ccs.professorlol.lolInfo.champion.QChampion.champion;

@RequiredArgsConstructor
public class ChampionRepositoryCustomImpl implements ChampionRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    @Override
    public List<Champion> findAll() {
        return queryFactory.selectFrom(champion)
                .fetch();
    }

}
