package com.ccs.professorlol.patch;

import com.ccs.professorlol.patch.skill.ChampionAbilityHistory;
import com.ccs.professorlol.patch.skill.ChampionAbilityHistoryRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatchHistoryDetailRepository extends ChampionAbilityHistoryRepository, PatchHistoryRepositoryCustom {
    @Query("select ca from ChampionAbilityHistory ca join fetch ca.championPatchHistory as cp where cp.champion_id = #{championId}")
    List<ChampionAbilityHistory> getMyChampionHistory(@Param("championId") Long id);

}
