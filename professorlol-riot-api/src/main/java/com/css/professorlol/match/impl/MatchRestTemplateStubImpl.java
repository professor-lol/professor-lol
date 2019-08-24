package com.css.professorlol.match.impl;

import com.css.professorlol.match.MatchRestTemplate;
import com.css.professorlol.match.domain.Queue;
import com.css.professorlol.match.dto.match.MatchDto;
import com.css.professorlol.match.dto.matchList.MatchQueryParam;
import com.css.professorlol.match.dto.matchList.MatchReferenceDto;
import com.css.professorlol.match.dto.matchList.MatchlistDto;
import lombok.extern.slf4j.Slf4j;

import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Slf4j
public class MatchRestTemplateStubImpl implements MatchRestTemplate {

    public MatchRestTemplateStubImpl() {
        log.info("Stub MatchRestTemplate created.");
    }

    @Override
    public MatchlistDto getMatchList(@NotBlank final String encryptedAccountId, MatchQueryParam queryParam) {
        List<MatchReferenceDto> matchReferenceDtoList = IntStream.range(0, 100)
                .mapToObj(index -> MatchReferenceDto.stubBuilder()
                        .champion(index)
                        .gameId(3724003832L)
                        .lane("MID")
                        .platformId("KR")
                        .timestamp(1561739744506L)
                        .queue(Queue.SOLO.getValue())
                        .role("SOLO")
                        .season(13)
                        .build())
                .collect(Collectors.toList());
        return MatchlistDto.stubBuilder()
                .endIndex(100)
                .startIndex(0)
                .totalGames(100)
                .matches(matchReferenceDtoList)
                .build();
    }

    //TODO : 스텁만들기
    @Override
    public MatchDto getMatch(Long matchId) {

        return null;
    }
}