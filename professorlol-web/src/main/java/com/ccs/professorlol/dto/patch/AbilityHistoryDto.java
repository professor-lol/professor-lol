package com.ccs.professorlol.dto.patch;

import java.util.List;
import java.util.stream.Collectors;

import com.ccs.professorlol.patch.skill.ChampionAbilityHistory;
import com.ccs.professorlol.patch.skill.ChampionAttributeHistory;
import com.ccs.professorlol.type.SkillType;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class AbilityHistoryDto {
	private String title;
	private String image;
	private SkillType skillType;
	private List<AttributeHistoryDto> attributeHistoryDtos;

	private AbilityHistoryDto(ChampionAbilityHistory championAbilityHistory) {
		this.title = championAbilityHistory.getTitle();
		this.image = championAbilityHistory.getImage();
		this.skillType = championAbilityHistory.getSkillType();
		this.attributeHistoryDtos = makeAttributeHistories(championAbilityHistory.getChampionAttributeHistories());
	}

	static AbilityHistoryDto of(ChampionAbilityHistory championAbilityHistory) {
		return new AbilityHistoryDto(championAbilityHistory);
	}

	private List<AttributeHistoryDto> makeAttributeHistories(List<ChampionAttributeHistory> attributeHistories) {
		return attributeHistories.stream()
			.map(AttributeHistoryDto::of)
			.collect(Collectors.toList());
	}
}
