package com.css.professorlol.match.dto.match;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PlayerDto {

    String summonerName;
    String currentAccountId;
    String summonerId;
    String accountId;
    //    String currentPlatformId;
    //    String matchHistoryUri;
//    String platformId;
    //    Integer profileIcon;
}

