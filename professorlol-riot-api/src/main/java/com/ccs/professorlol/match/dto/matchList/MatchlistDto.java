package com.ccs.professorlol.match.dto.matchList;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MatchlistDto {

    private List<MatchReferenceDto> matches;
    private Integer totalGames;
    private Integer startIndex;
    private Integer endIndex;

    @Builder(builderMethodName = "stubBuilder")
    private MatchlistDto(List<MatchReferenceDto> matches, Integer totalGames, Integer startIndex, Integer endIndex) {
        this.matches = matches;
        this.totalGames = totalGames;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }
}