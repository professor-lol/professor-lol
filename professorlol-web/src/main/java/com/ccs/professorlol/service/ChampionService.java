package com.ccs.professorlol.service;

import com.ccs.professorlol.dto.ChampionSimpleDto;
import com.ccs.professorlol.lolInfo.champion.ChampionRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class ChampionService {
    private final ChampionRepository championRepository;

    public List<ChampionSimpleDto> findAllChampionSimples() {
        return championRepository.findAll().stream()
                .map(ChampionSimpleDto::new)
                .collect(Collectors.toList());
    }
}
