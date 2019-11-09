package com.ccs.professorlol.summoner;

import com.ccs.professorlol.summoner.dto.SummonerDto;

public interface SummonerRestTemplate {
    SummonerDto getSummonerDtoBySummonerName(String summonerName);

    SummonerDto getSummonerDtoBySummonerId(String summonerId);
}
