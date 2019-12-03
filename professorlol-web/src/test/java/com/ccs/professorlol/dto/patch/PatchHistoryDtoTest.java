package com.ccs.professorlol.dto.patch;

import static com.ccs.professorlol.patch.PatchHistroyMockData.*;
import static com.ccs.professorlol.type.AttributeType.*;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.ccs.professorlol.patch.champion.ChampionPatchHistory;
import com.ccs.professorlol.patch.skill.ChampionAbilityHistory;
import com.ccs.professorlol.type.SkillType;

@DisplayName("Domain에서 DTO로 파싱하기 : PatchHistoryDto")
class PatchHistoryDtoTest {

	@Test
	@DisplayName("ChampionPatchHistory > PatchHistoryDto")
	void name() {

		ChampionPatchHistory championPatchHistory = makeChampionPatchHistory();

		PatchHistoryDto patchHistoryDto = PatchHistoryDto.of(championPatchHistory);

		assertAll(
			() -> assertThat(patchHistoryDto.getChampionName()).isEqualTo(CHAMPION_NAME),
			() -> assertThat(patchHistoryDto.getContext()).isEqualTo(CONTEXT),
			() -> assertThat(patchHistoryDto.getSummary()).isEqualTo(SUMMARY),
			() -> assertThat(patchHistoryDto.getPatchVersion()).isEqualTo(PATCH_VERSION)
		);

		List<AbilityHistoryDto> abilityHistoryDtos = patchHistoryDto.getAbilityHistoryDtos();
		abilityHistoryDtos.forEach(
			x -> {
				assertAll(
					() -> assertThat(x.getImage()).isEqualTo(IMAGE),
					() -> assertThat(x.getTitle()).isEqualTo(TITLE),
					() -> assertThat(x.getSkillType()).isEqualTo(SkillType.Q)
				);

				List<AttributeHistoryDto> attributeHistoryDtos = x.getAttributeHistoryDtos();

				attributeHistoryDtos.forEach(
					y -> {
						assertAll(
							() -> assertThat(y.getAttribute()).isEqualTo(ATTRIBUTE1),
							() -> assertThat(y.getAfterContent()).isEqualTo(REMOVE_CONTENT1),
							() -> assertThat(y.getAttributeType()).isEqualTo(REMOVE)
						);
					}
				);
			}
		);

	}

	private ChampionPatchHistory makeChampionPatchHistory() {
		return ChampionPatchHistory.builder()
			.championName(CHAMPION_NAME)
			.context(CONTEXT)
			.summary(SUMMARY)
			.patchVersion(PATCH_VERSION)
			.championAbilityHistories(makeChampionPatchHistoryList())
			.build();
	}

	private List<ChampionAbilityHistory> makeChampionPatchHistoryList() {
		List<ChampionAbilityHistory> championAbilityHistories = new ArrayList<>();
		championAbilityHistories.add(makeChampionAbilityHistory());
		championAbilityHistories.add(makeChampionAbilityHistory());
		championAbilityHistories.add(makeChampionAbilityHistory());

		return championAbilityHistories;
	}

}