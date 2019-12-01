package com.ccs.professorlol.dto.patch;

import com.ccs.professorlol.type.AttributeType;
import com.ccs.professorlol.type.SkillType;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class ChampionPatchDetailDto {

	private String image;
	private SkillType skillType;
	private String title;
	private String afterContent;
	private String attribute;
	private AttributeType attributeType;
	private String beforeContent;
	private String patchVersion;
	private String championName;
	private String context;
	private String summary;
	private String key;
	private String name;

}
