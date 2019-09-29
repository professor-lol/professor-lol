package com.ccs.professorlol.summoner.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SummonerDto {

    @JsonAlias("id")
    private String summonerId;
    private String accountId;
    //        private Integer profileIconId;
    //        private String name;
    //        private Long summonerLevel;
    //        private Long revisionDate;
    //        private String puuid;


    @Builder(builderMethodName = "stubBuilder")
    private SummonerDto(String summonerId, String accountId) {
        this.summonerId = summonerId;
        this.accountId = accountId;
    }
}