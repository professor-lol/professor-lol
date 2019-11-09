package com.ccs.professorlol.service;


import com.ccs.professorlol.lolInfo.LolInfoRepository;
import com.ccs.professorlol.PatchNoteCrawler;
import com.ccs.professorlol.patch.champion.PatchHistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatchHistoryService {


    private final PatchNoteCrawler patchNoteCrawler;
    private final PatchHistoryRepository patchHistoryRepository;
    private final LolInfoRepository lolInfoRepository;


//    public void createPatchHistory(Long patchNoteId) {
//        PatchResponseDto<Champion> patchResponseDto = patchNoteCrawler.findChampionPatchById(patchNoteId);
//        List<LolInfo> lolInfoGroup = findAll(patchResponseDto.getPatch());
//
//    }

//    private List<LolInfo> findAll(List<Champion> championDtos) {
//        List<String> championNames = championDtos.stream()
//                .map(Champion::getName)
//                .collect(Collectors.toList());
//
//        return lolInfoRepository.findAllByChampionNamesIn(championNames);
//    }

}
