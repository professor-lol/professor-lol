package com.ccs.professorlol.dto.patch;

import com.ccs.professorlol.patch.skill.ChampionAttributeHistory;
import com.ccs.professorlol.type.AttributeType;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class AttributeHistoryDto {
	private AttributeType attributeType;
	private String attribute;
	private String beforeContent;
	private String afterContent;

	private AttributeHistoryDto(ChampionAttributeHistory championAttributeHistory) {
		this.attributeType = championAttributeHistory.getAttributeType();
		this.attribute = championAttributeHistory.getAttribute();
		this.beforeContent = championAttributeHistory.getBeforeContent();
		this.afterContent = championAttributeHistory.getAfterContent();
	}

	static AttributeHistoryDto of(ChampionAttributeHistory championAttributeHistory) {
		return new AttributeHistoryDto(championAttributeHistory);
	}
}
