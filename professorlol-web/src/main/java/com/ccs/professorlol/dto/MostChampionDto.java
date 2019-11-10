package com.ccs.professorlol.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MostChampionDto {
    private Long id; //champion_id
    private String name;

    @Builder
    public MostChampionDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
