package com.css.professorlol.match.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MatchReferenceDto {

    private String lane;
    private Long gameId;
    private Integer champion;
    private String platformId;
    private Integer season;
    private Integer queue;
    private String role;
    private Long timestamp;

}