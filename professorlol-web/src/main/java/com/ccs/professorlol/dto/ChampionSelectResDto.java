package com.ccs.professorlol.dto;

import com.ccs.professorlol.lolInfo.champion.Champion;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChampionSelectResDto {
    private List<ChampionSimpleDto> mostChampions;
    private List<ChampionSimpleDto> notMostChampions;

    @Builder
    public ChampionSelectResDto(List<Champion> mostChampions, List<Champion> notMostChampions) {
        this.mostChampions = mostChampions.stream()
                .map(ChampionSimpleDto::new)
                .collect(Collectors.toList());

        this.notMostChampions = notMostChampions.stream()
                .map(ChampionSimpleDto::new)
                .collect(Collectors.toList());
    }
}
