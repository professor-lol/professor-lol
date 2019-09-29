package com.ccs.professorlol.summoner.impl;

import com.ccs.professorlol.summoner.SummonerRestTemplate;
import com.ccs.professorlol.summoner.dto.SummonerDto;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SummonerRestTemplateStubImpl implements SummonerRestTemplate {

    public SummonerRestTemplateStubImpl() {
        log.debug("Stub SummonerRestTemplate created.");
    }

    @Override
    public SummonerDto getSummonerDtoBySummonerName(String summonerName) {
        return SummonerDto.stubBuilder()
                .summonerId("zN1v1n2XlkIY9cYKj9XydSSKItQNRtDLVdJHEWIkVhN5fQ")
                .accountId("w94qxPIxhJ2ALZoRItVSwyN6R-CNMXOE1VJwesmrZdAv")
                .build();
    }

    @Override
    public SummonerDto getSummonerDtoBySummonerId(String summonerId) {
        return SummonerDto.stubBuilder()
                .summonerId("zN1v1n2XlkIY9cYKj9XydSSKItQNRtDLVdJHEWIkVhN5fQ")
                .accountId("w94qxPIxhJ2ALZoRItVSwyN6R-CNMXOE1VJwesmrZdAv")
                .build();
    }
}
