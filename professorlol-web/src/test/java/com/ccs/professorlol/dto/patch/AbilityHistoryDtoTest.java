package com.ccs.professorlol.dto.patch;

import static com.ccs.professorlol.patch.PatchHistroyMockData.*;
import static com.ccs.professorlol.type.AttributeType.*;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.ccs.professorlol.patch.skill.ChampionAbilityHistory;
import com.ccs.professorlol.type.SkillType;

@DisplayName("Domain에서 DTO로 파싱하기 : AttributeHistoryDto")
class AbilityHistoryDtoTest {

	@Test
	@DisplayName("ChampionAbilityHistory > AbilityHistoryDto")
	void name() {
		ChampionAbilityHistory championAttributeHistory = makeChampionAbilityHistory();

		AbilityHistoryDto abilityHistoryDto = AbilityHistoryDto.of(championAttributeHistory);

		abilityHistoryDto.getAttributeHistoryDtos().forEach(
			x -> {
				assertAll(
					() -> assertThat(x.getAttributeType()).isEqualTo(REMOVE),
					() -> assertThat(x.getAfterContent()).isEqualTo(REMOVE_CONTENT1),
					() -> assertThat(x.getAttribute()).isEqualTo(ATTRIBUTE1)
				);

			}
		);

		assertAll(
			() -> assertThat(abilityHistoryDto.getImage()).isEqualTo(IMAGE),
			() -> assertThat(abilityHistoryDto.getTitle()).isEqualTo(TITLE),
			() -> assertThat(abilityHistoryDto.getSkillType()).isEqualTo(SkillType.Q)
		);
	}

}