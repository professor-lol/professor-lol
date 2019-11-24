package com.ccs.professorlol.patch;

import static com.ccs.professorlol.patch.skill.QChampionAbilityHistory.*;

import java.util.List;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import com.ccs.professorlol.patch.skill.ChampionAbilityHistory;
import com.querydsl.jpa.impl.JPAQueryFactory;

public class PatchHistoryImpl extends QuerydslRepositorySupport implements PatchHistoryRepositoryCustom {

	public PatchHistoryImpl(JPAQueryFactory jpaQueryFactory) {
		super(ChampionAbilityHistory.class);
		this.queryFactory = jpaQueryFactory;
	}

	private final JPAQueryFactory queryFactory;

	// @Override
	// public List<ChampionAbilityHistory> getMyChampionHistoryByChampionId(Long championId) {
	// 	// return queryFactory.selectFrom(championAbilityHistory)
	// 	// 	.join(championAbilityHistory.championAttributeHistories, championAttributeHistory).fetchJoin()
	// 	// 	.join(championAbilityHistory.championPatchHistory, championPatchHistory).fetchJoin()
	// 	// 	.join(championPatchHistory.champion, champion).fetchJoin()
	// 	// 	// .where(champion.id.eq(championId))
	// 	// 	.fetch();
	// 	return queryFactory.selectFrom(championAbilityHistory).fetch();
	// }

	public List<ChampionAbilityHistory> getAllChampionHistory() {
		return queryFactory.selectFrom(championAbilityHistory).fetch();
	}

}
