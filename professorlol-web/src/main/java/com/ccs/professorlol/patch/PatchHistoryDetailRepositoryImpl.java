package com.ccs.professorlol.patch;

import com.ccs.professorlol.patch.skill.ChampionAbilityHistory;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;

import static com.ccs.professorlol.lolInfo.champion.QChampion.champion;
import static com.ccs.professorlol.patch.champion.QChampionPatchHistory.championPatchHistory;
import static com.ccs.professorlol.patch.skill.QChampionAbilityHistory.championAbilityHistory;
import static com.ccs.professorlol.patch.skill.QChampionAttributeHistory.championAttributeHistory;


public class PatchHistoryDetailRepositoryImpl extends QuerydslRepositorySupport
	implements PatchHistoryDetailRepositoryCustom {

	public PatchHistoryDetailRepositoryImpl() {
		super(ChampionAbilityHistory.class);
	}

	@Override
	public List<ChampionAbilityHistory> getMyChampionHistoryByChampionId(Long championId) {
		return super.from(championAbilityHistory)
			.leftJoin(championAbilityHistory.championAttributeHistories, championAttributeHistory).fetchJoin()
			.leftJoin(championAbilityHistory.championPatchHistory, championPatchHistory).fetchJoin()
			.leftJoin(championPatchHistory.champion, champion).fetchJoin()
			.distinct()
			.fetch();
	}

}
