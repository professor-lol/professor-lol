package com.ccs.professorlol.dto.patch;

import static com.ccs.professorlol.patch.PatchHistroyMockData.*;
import static com.ccs.professorlol.type.AttributeType.*;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.ccs.professorlol.patch.skill.ChampionAttributeHistory;

@DisplayName("Domain에서 DTO로 파싱하기 : AttributeHistoryDto")
class AttributeHistoryDtoTest {

	@Test
	@DisplayName("ChampionAttributeHistory > AttributeHistoryDto")
	void name() {
		ChampionAttributeHistory championAttributeHistory = makeChampionAttribute();

		AttributeHistoryDto attributeHistoryDto = AttributeHistoryDto.of(championAttributeHistory);

		assertAll(
			() -> assertThat(attributeHistoryDto.getAttribute()).isEqualTo(ATTRIBUTE1),
			() -> assertThat(attributeHistoryDto.getAfterContent()).isEqualTo(REMOVE_CONTENT1),
			() -> assertThat(attributeHistoryDto.getAttributeType()).isEqualTo(REMOVE)
		);
	}

}