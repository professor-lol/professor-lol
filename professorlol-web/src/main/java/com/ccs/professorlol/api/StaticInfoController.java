package com.ccs.professorlol.api;

import com.ccs.professorlol.dto.lolinfo.LolInfoResDto;
import com.ccs.professorlol.dto.lolinfo.LolInfoSaveDto;
import com.ccs.professorlol.dto.lolinfo.LolInfoUpdateDto;
import com.ccs.professorlol.dto.lolinfo.champion.ChampionResDto;
import com.ccs.professorlol.dto.lolinfo.champion.ChampionSaveDto;
import com.ccs.professorlol.dto.lolinfo.champion.ChampionUpdateDto;
import com.ccs.professorlol.dto.lolinfo.stat.StatResDto;
import com.ccs.professorlol.dto.lolinfo.stat.StatSaveDto;
import com.ccs.professorlol.dto.lolinfo.stat.StatUpdateDto;
import com.ccs.professorlol.service.StaticInfoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Slf4j
@RequestMapping("api/v1/static")
@RequiredArgsConstructor
public class StaticInfoController {

    private final StaticInfoService staticInfoService;

    @PostMapping("/version")
    public ResponseEntity<LolInfoResDto> saveLolInfo(@RequestBody @Valid LolInfoSaveDto lolInfoSaveDto) {
        return new ResponseEntity<>(staticInfoService.saveLolInfo(lolInfoSaveDto), HttpStatus.CREATED);
    }

    @PutMapping("/version")
    public ResponseEntity<LolInfoResDto> updateLolInfo(@RequestBody @Valid LolInfoUpdateDto lolInfoUpdateDto) {
        return new ResponseEntity<>(staticInfoService.updateLolInfo(lolInfoUpdateDto), HttpStatus.OK);
    }

    @PostMapping("/stat")
    public ResponseEntity<StatResDto> saveStat(@RequestBody @Valid StatSaveDto statSaveDto) {
        return new ResponseEntity<>(staticInfoService.saveStat(statSaveDto), HttpStatus.CREATED);
    }

    @PutMapping("/stat")
    public ResponseEntity<StatResDto> updateStat(@RequestBody @Valid StatUpdateDto statUpdateDto) {
        return new ResponseEntity<>(staticInfoService.updateStat(statUpdateDto), HttpStatus.OK);
    }

    @PostMapping("/champion")
    public ResponseEntity<ChampionResDto> saveChampion(@RequestBody @Valid ChampionSaveDto championSaveDto) {
        return new ResponseEntity<>(staticInfoService.saveChampion(championSaveDto), HttpStatus.CREATED);
    }

    @PutMapping("/champion")
    public ResponseEntity<ChampionResDto> updateChampion(@RequestBody @Valid ChampionUpdateDto championUpdateDto) {
        return new ResponseEntity<>(staticInfoService.updateChampion(championUpdateDto), HttpStatus.OK);
    }
}
