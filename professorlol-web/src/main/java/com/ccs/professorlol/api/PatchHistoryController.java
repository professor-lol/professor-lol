package com.ccs.professorlol.api;

import com.ccs.professorlol.service.ChampionPatchHistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1/patch-histories")
@RequiredArgsConstructor
public class PatchHistoryController {

    private final ChampionPatchHistoryService patchHistoryService;

    @GetMapping("/{version}")
    public ResponseEntity<Void> save(@PathVariable Long version) {
        patchHistoryService.createPatchHistory(version);
        return ResponseEntity.ok().build();
    }
}
