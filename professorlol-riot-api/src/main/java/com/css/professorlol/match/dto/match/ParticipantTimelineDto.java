package com.css.professorlol.match.dto.match;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Map;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ParticipantTimelineDto {
    String lane;
    Integer participantId;
    Map<String, Double> csDiffPerMinDeltas;
    Map<String, Double> goldPerMinDeltas;
    Map<String, Double> xpDiffPerMinDeltas;
    Map<String, Double> creepsPerMinDeltas;
    Map<String, Double> xpPerMinDeltas;
    String role;
    Map<String, Double> damageTakenDiffPerMinDeltas;
    Map<String, Double> damageTakenPerMinDeltas;
}
