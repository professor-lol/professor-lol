package com.css.professorlol.match.dto.matchList;

import lombok.*;

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

    @Builder(builderMethodName = "stubBuilder")
    private MatchReferenceDto(String lane, Long gameId, Integer champion, String platformId, Integer season, Integer queue, String role, Long timestamp) {
        this.lane = lane;
        this.gameId = gameId;
        this.champion = champion;
        this.platformId = platformId;
        this.season = season;
        this.queue = queue;
        this.role = role;
        this.timestamp = timestamp;
    }
}