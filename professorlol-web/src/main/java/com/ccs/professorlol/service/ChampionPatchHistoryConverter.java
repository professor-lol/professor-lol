package com.ccs.professorlol.service;

import com.ccs.professorlol.PatchResponseDto;
import com.ccs.professorlol.dto.champion.ChampionDto;
import com.ccs.professorlol.lolInfo.champion.Champion;
import com.ccs.professorlol.patch.champion.ChampionPatchHistory;
import com.ccs.professorlol.patch.champion.PatchHistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class ChampionPatchHistoryConverter {
    private final PatchHistoryRepository patchHistoryRepository;

    public void convert(List<Champion> champions, PatchResponseDto<ChampionDto> responseDto) {
        validate(champions, responseDto);
        Map<String, Champion> convertMap = convertMap(champions);
        final String version = responseDto.getPatchVersion();

        List<ChampionPatchHistory> championPatchHistories = responseDto.getPatch().stream()
                .map(champion -> convert(version, champion, convertMap.get(champion.getName())))
                .collect(Collectors.toList());

        patchHistoryRepository.saveAll(championPatchHistories);
    }

    private ChampionPatchHistory convert(String version, ChampionDto championDto, Champion champion) {
        return ChampionPatchHistory.builder()
                .champion(champion)
                .summary(championDto.getSummary())
                .context(championDto.getContext())
                .patchVersion(version)
                .championName(championDto.getName())
                .championAbilityHistories(AbilityConverter.convert(championDto.getAbilities()))
                .build();
    }

    private Map<String,Champion> convertMap(List<Champion> champions) {
        Map<String, Champion> resultMap = new HashMap<>();
        for (Champion champion : champions) {
            resultMap.putIfAbsent(champion.getName(), champion);
        }
        return resultMap;
    }

    private void validate(List<Champion> lolInfos, PatchResponseDto<ChampionDto> responseDto) {
        List patch = responseDto.getPatch();
        if (lolInfos.size() != patch.size()) {
            throw new RuntimeException();
        }
    }
}
