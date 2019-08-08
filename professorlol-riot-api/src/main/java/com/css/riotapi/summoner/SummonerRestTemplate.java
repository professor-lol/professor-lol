package com.css.riotapi.summoner;

import com.css.riotapi.summoner.dto.SummonerDto;

public interface SummonerRestTemplate {
    SummonerDto getSummonerDto(String summonerName);
}
