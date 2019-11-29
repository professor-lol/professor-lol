package com.ccs.professorlol.patch;

import java.util.List;

import com.ccs.professorlol.patch.skill.ChampionAbilityHistory;

public interface PatchHistoryDetailRepositoryCustom {

	List<ChampionAbilityHistory> getMyChampionHistoryByChampionId(final Long championId);
}
