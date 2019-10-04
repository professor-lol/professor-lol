package com.ccs.professorlol.patch.skill;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ChampionAbilityHistoryRepository<T extends ChampionAbilityHistory> extends JpaRepository<T, Long> {
}
