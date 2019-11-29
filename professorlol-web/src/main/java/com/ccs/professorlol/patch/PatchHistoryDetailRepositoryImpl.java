package com.ccs.professorlol.patch;

import static com.ccs.professorlol.lolInfo.champion.QChampion.*;
import static com.ccs.professorlol.patch.champion.QChampionPatchHistory.*;
import static com.ccs.professorlol.patch.skill.QChampionAbilityHistory.*;
import static com.ccs.professorlol.patch.skill.QChampionAttributeHistory.*;

import java.util.List;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import com.ccs.professorlol.patch.skill.ChampionAbilityHistory;

public class PatchHistoryDetailRepositoryImpl extends QuerydslRepositorySupport
	implements PatchHistoryDetailRepositoryCustom {

	public PatchHistoryDetailRepositoryImpl() {
		super(ChampionAbilityHistory.class);
	}

	@Override
	public List<ChampionAbilityHistory> getMyChampionHistoryByChampionId(Long championId) {
		return super.from(championAbilityHistory)
			.join(championAbilityHistory.championAttributeHistories, championAttributeHistory).fetchJoin()
			.join(championAbilityHistory.championPatchHistory, championPatchHistory).fetchJoin()
			.join(championPatchHistory.champion, champion).fetchJoin()
			.fetch();
	}

}
