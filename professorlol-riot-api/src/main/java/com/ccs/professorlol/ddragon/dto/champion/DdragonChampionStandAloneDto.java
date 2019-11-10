package com.ccs.professorlol.ddragon.dto.champion;

import lombok.AccessLevel;
import lombok.Builder;
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

    @Builder(builderMethodName = "testBuilder")
    private DdragonChampionStandAloneDto(StatDto stats, String partype, List<String> tags, ImageDto image, InfoDto info, String blurb, String title, String name, String key, String id, String version) {
        this.stats = stats;
        this.partype = partype;
        this.tags = tags;
        this.image = image;
        this.info = info;
        this.blurb = blurb;
        this.title = title;
        this.name = name;
        this.key = key;
        this.id = id;
        this.version = version;
    }
}
