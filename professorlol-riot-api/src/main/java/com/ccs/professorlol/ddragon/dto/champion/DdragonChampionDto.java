package com.ccs.professorlol.ddragon.dto.champion;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;

import java.util.List;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class DdragonChampionDto {
    private PassiveDto passive;
    private String version;
    //@JsonProperty("spells")
    private List<SpellDto> spells;
    private StatDto stats;
    private InfoDto info;
    private String partype;
    private List<String> tags;
    private List<String> enemytips;
    private List<String> allytips;
    private String blurb;
    private String lore;
    private ImageDto image;
    private String title;
    private String name;
    private String key;
    private String id;
}
