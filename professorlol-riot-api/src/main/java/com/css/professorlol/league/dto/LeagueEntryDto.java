package com.css.professorlol.league.dto;

import lombok.*;

@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class LeagueEntryDto {

    private String queueType;
    private String summonerName;
    private boolean hotStreak;
    //    private MiniSeriesDto miniSeries;
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

    @Builder(builderMethodName = "stubBuilder")
    private LeagueEntryDto(String queueType, String summonerName, boolean hotStreak, Integer wins, boolean veteran, Integer losses, String rank, String leagueId, boolean inactive, boolean freshBlood, String tier, String summonerId, Integer leaguePoints) {
        this.queueType = queueType;
        this.summonerName = summonerName;
        this.hotStreak = hotStreak;
        this.wins = wins;
        this.veteran = veteran;
        this.losses = losses;
        this.rank = rank;
        this.leagueId = leagueId;
        this.inactive = inactive;
        this.freshBlood = freshBlood;
        this.tier = tier;
        this.summonerId = summonerId;
        this.leaguePoints = leaguePoints;
    }
}
