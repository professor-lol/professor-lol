package com.css.lolextapi.league.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class LeagueEntryDto {

    private String queueType;
    private String summonerName;
    private boolean hotStreak;
    private MiniSeriesDto miniSeries;
    private Integer wins;
    private boolean veteran;
    private Integer losses;
    private String rank;
    private String leagueId;
    private boolean inactive;
    private boolean freshBlood;
    private String tier;
    private String summonerId;
    private Integer leaguePoints;
}
