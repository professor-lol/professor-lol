package com.ccs.professorlol.lolInfo.champion;

import com.ccs.professorlol.lolInfo.domain.LolInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ChampionRepository extends JpaRepository<Champion, Long> {
    Optional<Champion> findByName(String name);

    List<Champion> findAllByNameIn(List<String> championNames);
}
