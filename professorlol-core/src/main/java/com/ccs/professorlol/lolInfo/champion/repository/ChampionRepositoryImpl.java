package com.ccs.professorlol.lolInfo.champion.repository;

import com.ccs.professorlol.lolInfo.champion.Champion;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;
import java.util.Optional;

import static com.ccs.professorlol.lolInfo.QLolInfo.lolInfo;
import static com.ccs.professorlol.lolInfo.champion.QChampion.champion;
import static com.ccs.professorlol.lolInfo.champion.QStat.stat;

public class ChampionRepositoryImpl extends QuerydslRepositorySupport implements ChampionRepositoryCustom {

    public ChampionRepositoryImpl() {
        super(Champion.class);
    }

    @Override
    public List<Champion> findAllFetch() {
        return super.from(champion)
                .innerJoin(champion.stats, stat).fetchJoin()
                .innerJoin(stat.lolInfo, lolInfo).fetchJoin()
                .fetch();
    }

    @Override
    public Optional<Champion> findByNameFetch(String name) {
        return Optional.ofNullable(super.from(champion)
                .innerJoin(champion.stats, stat).fetchJoin()
                .innerJoin(stat.lolInfo, lolInfo)
                .where(champion.name.eq(name))
                .fetchOne());
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
