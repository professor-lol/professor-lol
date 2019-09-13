package com.css.professorlol.third;

import com.css.professorlol.summoner.dto.SummonerDto;

public interface ThirdPartyRestTemplate {

    String getThirdPartyCodeBySummonerId(String encryptedSummonerId);
}
