package com.ccs.professorlol.lolInfo.champion.repository;

import com.ccs.professorlol.lolInfo.champion.Champion;

import java.util.List;

public interface ChampionRepositoryCustom {
    List<Champion> findAll();
}
