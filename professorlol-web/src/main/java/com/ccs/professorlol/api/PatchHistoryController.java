package com.ccs.professorlol.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ccs.professorlol.dto.patch.PatchHistoryDto;
import com.ccs.professorlol.service.ChampionPatchHistoryService;
import com.ccs.professorlol.service.PatchHistoryDetailService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/v1/patch-histories")
@RequiredArgsConstructor
public class PatchHistoryController {

	private final ChampionPatchHistoryService patchHistoryService;
	private final PatchHistoryDetailService patchHistoryDetailService;

	@GetMapping("/{version}")
	public ResponseEntity<Void> save(@PathVariable Long version) {
		patchHistoryService.createPatchHistory(version);
		return ResponseEntity.ok().build();
	}

	@GetMapping("/{champion/{ChampionId}}")
	public ResponseEntity<List<PatchHistoryDto>> getChampionPatchHistoryDetail(@PathVariable Long championId) {
		List<PatchHistoryDto> detail = patchHistoryDetailService.getChampionPatchHistoryDetail(
			championId);
		return new ResponseEntity<>(detail, HttpStatus.OK);
	}

}
