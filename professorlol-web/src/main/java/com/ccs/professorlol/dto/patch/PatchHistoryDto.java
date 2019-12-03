package com.ccs.professorlol.dto.patch;

import java.util.List;
import java.util.stream.Collectors;

import com.ccs.professorlol.patch.champion.ChampionPatchHistory;
import com.ccs.professorlol.patch.skill.ChampionAbilityHistory;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PatchHistoryDto {
	private String championName;
	private String summary;
	private String context;
	private List<AbilityHistoryDto> abilityHistoryDtos;
	private String patchVersion;

	PatchHistoryDto(ChampionPatchHistory championPatchHistory) {
		this.championName = championPatchHistory.getChampionName();
		this.summary = championPatchHistory.getSummary();
		this.context = championPatchHistory.getContext();
		this.abilityHistoryDtos = makeAbilityHistoryDtos(championPatchHistory.getChampionAbilityHistories());
		this.patchVersion = championPatchHistory.getPatchVersion();
	}

	public static PatchHistoryDto of(ChampionPatchHistory championPatchHistory) {
		return new PatchHistoryDto(championPatchHistory);
	}

	private List<AbilityHistoryDto> makeAbilityHistoryDtos(List<ChampionAbilityHistory> championAbilityHistories) {
		return championAbilityHistories.stream()
			.map(AbilityHistoryDto::of)
			.collect(Collectors.toList());
	}
}
