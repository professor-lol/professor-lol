package com.ccs.professorlol.lolInfo.champion;

import java.util.List;

public interface ChampionRepositoryCustom {
    List<Champion> findAllByNameIn(List<String> championNames);

    List<Champion> findAllByIdIn(List<Long> championIds);
}
