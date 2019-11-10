package com.ccs.professorlol.api;

import com.ccs.professorlol.dto.ChampionSimpleDto;
import com.ccs.professorlol.service.ChampionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/champion")
@RequiredArgsConstructor
public class ChampionContoller {
    private final ChampionService championService;

    @GetMapping("/list")
    public ResponseEntity<List<ChampionSimpleDto>> findAllChampionForSimples() {
        List<ChampionSimpleDto> championSimpleDtos = championService.findAllChampionSimples();
        return new ResponseEntity<>(championSimpleDtos, HttpStatus.OK);
    }
}
