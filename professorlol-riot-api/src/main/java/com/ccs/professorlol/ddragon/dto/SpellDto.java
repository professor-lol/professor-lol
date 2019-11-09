package com.ccs.professorlol.ddragon.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class SpellDto {
    private String resource;
    private ImageDto image;
    private String costType;
    private String costBurn;
    private int maxrank;
    private String tooltip;
    private String description;
    private String name;
    private String id;
}
