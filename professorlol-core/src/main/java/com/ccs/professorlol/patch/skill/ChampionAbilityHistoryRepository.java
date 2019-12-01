package com.ccs.professorlol.patch.skill;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ChampionAbilityHistoryRepository extends JpaRepository<ChampionAbilityHistory, Long> {


}
