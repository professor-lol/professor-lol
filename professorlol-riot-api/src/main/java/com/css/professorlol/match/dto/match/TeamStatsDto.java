package com.css.professorlol.match.dto.match;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TeamStatsDto {

    boolean firstDragon;
    boolean firstInhibitor;
    List<TeamBansDto> bans;
    Integer baronKills;
    boolean firstRiftHerald;
    boolean firstBaron;
    Integer riftHeraldKills;
    boolean firstBlood;
    Integer teamId;
    boolean firstTower;
    Integer vilemawKills;
    Integer inhibitorKills;
    Integer towerKills;
    Integer dominionVictoryScore;
    String win;
    Integer dragonKills;

}
