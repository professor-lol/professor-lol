package com.ccs.professorlol.patch;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ccs.professorlol.patch.champion.PatchHistory;

public interface PatchHistoryDetailRepository
	extends JpaRepository<PatchHistory, Long>, PatchHistoryDetailRepositoryCustom {



}
