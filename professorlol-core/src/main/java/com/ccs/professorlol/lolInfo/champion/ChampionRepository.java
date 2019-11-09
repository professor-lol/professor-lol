package com.ccs.professorlol.lolInfo.champion;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ChampionRepository extends JpaRepository<Champion, Long> {
    Optional<Champion> findByName(String name);
}
