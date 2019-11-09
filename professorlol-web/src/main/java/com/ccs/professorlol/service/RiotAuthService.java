package com.ccs.professorlol.service;

import com.ccs.professorlol.config.exception.RiotClientException;
import com.ccs.professorlol.summoner.SummonerRestTemplate;
import com.ccs.professorlol.summoner.dto.SummonerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RiotAuthService {

    private final SummonerRestTemplate summonerRestTemplate;

    public SummonerDto isExistSummoner(final String summonerName) {
        try {
            return summonerRestTemplate.getSummonerDtoBySummonerName(summonerName);
        } catch (RiotClientException rce) {
            throw new IllegalArgumentException("존재하지 않는 소환사 명입니다!");
        }
    }

}
