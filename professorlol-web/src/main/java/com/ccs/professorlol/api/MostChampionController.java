package com.ccs.professorlol.api;

import com.ccs.professorlol.dto.MostChampionAddReqDto;
import com.ccs.professorlol.service.MostChampionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/most-champion")
public class MostChampionController {
    private final MostChampionService mostChampionService;

    @PostMapping()
    public ResponseEntity<Void> add(@RequestBody MostChampionAddReqDto mostChampionAddReqDto) {
        mostChampionService.addMostChampions(mostChampionAddReqDto);
        return ResponseEntity.ok().build();
    }
}
