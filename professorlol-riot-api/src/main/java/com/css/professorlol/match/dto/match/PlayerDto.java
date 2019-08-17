package com.css.professorlol.match.dto.match;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PlayerDto {

    String currentPlatformId;
    String summonerName;
    String matchHistoryUri;
    String platformId;
    String currentAccountId;
    Integer profileIcon;
    String summonerId;
    String accountId;
}
