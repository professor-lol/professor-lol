package com.ccs.professorlol.lolInfo.champion.repository;

import com.ccs.professorlol.lolInfo.champion.Champion;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;

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
}
