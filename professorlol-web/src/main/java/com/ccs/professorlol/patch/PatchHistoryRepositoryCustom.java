package com.ccs.professorlol.patch;

import java.util.List;

import com.ccs.professorlol.patch.skill.ChampionAbilityHistory;

public interface PatchHistoryRepositoryCustom {

	// List<ChampionAbilityHistory> getMyChampionHistoryByChampionId(final Long championId);

	List<ChampionAbilityHistory> getAllChampionHistory();
}
