package com.ccs.professorlol.match.dto.match;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TeamStatsDto {

    private boolean firstDragon;
    private boolean firstInhibitor;
    private List<TeamBansDto> bans;
    private Integer baronKills;
    private boolean firstRiftHerald;
    private boolean firstBaron;
    private Integer riftHeraldKills;
    private boolean firstBlood;
    private Integer teamId;
    private boolean firstTower;
    private Integer vilemawKills;
    private Integer inhibitorKills;
    private Integer towerKills;
    private Integer dominionVictoryScore;
    private String win;
    private Integer dragonKills;

}
