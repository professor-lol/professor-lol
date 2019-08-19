package com.css.professorlol.summoner.dto;

import lombok.*;

@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SummonerDto {

    private String id;
    private String accountId;
    //        private Integer profileIconId;
    //        private String name;
    //        private Long summonerLevel;
    //        private Long revisionDate;
    //        private String puuid;


    @Builder(builderMethodName = "stubBuilder")
    private SummonerDto(String id, String accountId) {
        this.id = id;
        this.accountId = accountId;
    }
}