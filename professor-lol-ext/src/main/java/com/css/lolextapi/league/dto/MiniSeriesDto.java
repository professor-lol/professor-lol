package com.css.lolextapi.league.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MiniSeriesDto {
    private String progress;
    private Integer losses;
    private Integer target;
    private Integer wins;
}