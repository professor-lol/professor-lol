package com.ccs.professorlol.match.dto.match;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ParticipantDto {

    private ParticipantStatsDto stats;
    private Integer participantId;
    private Integer teamId;
    private Integer championId;
//    ParticipantTimelineDto timeline;
//    Integer spell2Id;
//    String highestAchievedSeasonTier;
//    Integer spell1Id;
    //    List<MasteryDto> masteries;  // 레거시에서만 존재하는 필드
    //    List<RuneDto> runes;  // 레거시에서만 존재하는 필드

}
