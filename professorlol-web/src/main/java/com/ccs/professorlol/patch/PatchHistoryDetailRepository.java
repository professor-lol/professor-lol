package com.ccs.professorlol.patch;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ccs.professorlol.patch.champion.PatchHistory;

public interface PatchHistoryDetailRepository extends JpaRepository<PatchHistory, Long>, PatchHistoryRepositoryCustom {
	// @Query("select ca from ChampionAbilityHistory ca join fetch ca.championPatchHistory as cp where cp.champion_id = #{championId}")
	// List<ChampionAbilityHistory> getMyChampionHistory(@Param("championId") Long id);

}
