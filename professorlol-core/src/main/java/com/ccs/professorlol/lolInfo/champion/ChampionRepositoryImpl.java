package com.ccs.professorlol.lolInfo.champion;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;

import static com.ccs.professorlol.lolInfo.champion.QChampion.champion;

public class ChampionRepositoryImpl extends QuerydslRepositorySupport implements ChampionRepositoryCustom {

    public ChampionRepositoryImpl() {
        super(Champion.class);
    }

    @Override
    public List<Champion> findAllByNameIn(List<String> championNames) {
        return super.from(champion)
                .where(champion.name.in(championNames))
                .fetch();
    }

    @Override
    public List<Champion> findAllByIdIn(List<Long> championIds) {
        return super.from(champion)
                .where(champion.id.in(championIds))
                .fetch();
    }
}
