package com.ccs.professorlol.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChampionSelectResDto {
    private List<ChampionsResDto> mostChampions;
    private List<ChampionsResDto> notMostChampions;

    @Builder
    public ChampionSelectResDto(List<ChampionsResDto> mostChampions, List<ChampionsResDto> notMostChampions) {
        this.mostChampions = mostChampions;
        this.notMostChampions = notMostChampions;
    }
}
