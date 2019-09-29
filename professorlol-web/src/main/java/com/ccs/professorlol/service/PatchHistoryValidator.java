package com.ccs.professorlol.service;

import com.ccs.professorlol.crawler.PatchResponseDto;
import com.ccs.professorlol.lolInfo.domain.LolInfo;
import com.ccs.professorlol.patch.PatchHistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PatchHistoryValidator<T> {
    private final PatchHistoryRepository patchHistoryRepository;


    public void validate(List<LolInfo> lolInfos, PatchResponseDto<T> responseDto) {
        List patch = responseDto.getPatch();
        if (lolInfos.size() != patch.size()) {
            throw new RuntimeException();
        }
        ;

        if (!patchHistoryRepository.existsByPatchVersion(responseDto.getPatchVersion())) {
            throw new RuntimeException();
        }
        ;
    }
}
