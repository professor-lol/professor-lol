package com.css.professorlol.summoner;

import com.css.professorlol.summoner.dto.SummonerDto;

public interface SummonerRestTemplate {
    SummonerDto getSummonerDto(String summonerName);
}
