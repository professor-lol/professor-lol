package com.ccs.professorlol.lolInfo.champion.repository;

import com.ccs.professorlol.lolInfo.champion.Champion;

import java.util.List;
import java.util.Optional;

public interface ChampionRepositoryCustom {
    List<Champion> findAllFetch();

    Optional<Champion> findByNameFetch(String name);

    List<Champion> findAllByNameIn(List<String> championNames);

    List<Champion> findAllByIdIn(List<Long> championIds);

    Optional<Champion> findByIdFetch(Long key);
}
