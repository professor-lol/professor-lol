package com.ccs.professorlol.ddragon.dto.champion;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class DdragonChampionStandAloneDto {
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
