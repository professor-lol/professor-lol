package com.css.professorlol.match.dto.match;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class MatchDto {

    Integer seasonId;
    Integer queueId;
    Long gameId;
    List<ParticipantIdentityDto> participantIdentities;
    List<ParticipantDto> participants;
//    String gameVersion;
//    String platformId;
//    String gameMode;
//    Integer mapId;
//    String gameType;
//    List<TeamStatsDto> teams;
//    Long gameDuration;
//    Long gameCreation;

}
