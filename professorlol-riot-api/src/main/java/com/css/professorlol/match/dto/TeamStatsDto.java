package com.css.professorlol.match.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TeamStatsDto {

    private Integer teamId;
    private String win;
}
