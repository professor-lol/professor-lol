package com.ccs.professorlol.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.ccs.professorlol.dto.patch.PatchHistoryDto;
import com.ccs.professorlol.patch.PatchHistoryDetailRepository;
import com.ccs.professorlol.patch.skill.ChampionAbilityHistory;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PatchHistoryDetailService {
	private final PatchHistoryDetailRepository patchHistoryDetailRepository;

	public List<PatchHistoryDto> getChampionPatchHistoryDetail(Long championId) {

		List<ChampionAbilityHistory> myChampionHistoryByChampionId = patchHistoryDetailRepository.getMyChampionHistoryByChampionId(
			championId);

		return myChampionHistoryByChampionId.stream()
			.map(ChampionAbilityHistory::getChampionPatchHistory)
			.distinct()
			.map(PatchHistoryDto::of)
			.collect(Collectors.toList());

	}

}
