package com.ccs.professorlol.ddragon.dto;

import lombok.Getter;

import java.util.List;

@Getter
public class ChampionDto {
    private StatDto stats;
    private String partype;
    private List<String> tags;
    private ImageDto image;
    private InfoDto info;
    private String blurb;
    private String title;
    private String name;
    private String key;
    private String id;
    private String version;
}
