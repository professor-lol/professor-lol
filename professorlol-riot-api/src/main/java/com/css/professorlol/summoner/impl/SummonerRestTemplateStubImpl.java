package com.css.professorlol.summoner.impl;

import com.css.professorlol.summoner.SummonerRestTemplate;
import com.css.professorlol.summoner.dto.SummonerDto;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SummonerRestTemplateStubImpl implements SummonerRestTemplate {

    public SummonerRestTemplateStubImpl() {
        log.debug("Stub SummonerRestTemplate created.");
    }

    @Override
    public SummonerDto getSummonerDto(String summonerName) {
        return SummonerDto.stubBuilder()
                .summonerId("zN1v1n2XlkIY9cYKj9XydSSKItQNRtDLVdJHEWIkVhN5fQ")
                .accountId("w94qxPIxhJ2ALZoRItVSwyN6R-CNMXOE1VJwesmrZdAv")
                .build();
    }

}
