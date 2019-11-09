package com.ccs.professorlol.ddragon.dto.champion;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SpellDto {
    private String resource;
    private ImageDto image;
    private String costType;
    private String costBurn;
    private int maxrank; //Spell 최대 레벨
    private String tooltip; //Spell 자세한 설명
    private String description; //Spell 설명
    private String name; //Spell 이름
    private String id; //Spell Id
}
