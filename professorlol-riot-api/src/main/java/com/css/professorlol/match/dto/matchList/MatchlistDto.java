package com.css.professorlol.match.dto.matchList;

import lombok.AccessLevel;
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

}