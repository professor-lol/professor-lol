package com.css.lolextapi.summoners.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SummonerDto {

    private Integer profileIconId;
    private String name;
    private String puuid;
    private Long summonerLevel;
    private Long revisionDate;
    private String id;
    private String accountId;

}