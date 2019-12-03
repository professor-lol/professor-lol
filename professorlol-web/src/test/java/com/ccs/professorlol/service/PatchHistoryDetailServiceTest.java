package com.ccs.professorlol.service;

import static com.ccs.professorlol.patch.PatchHistroyMockData.*;
import static org.assertj.core.api.Assertions.*;

import java.util.List;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import com.ccs.professorlol.dto.patch.AbilityHistoryDto;
import com.ccs.professorlol.dto.patch.AttributeHistoryDto;
import com.ccs.professorlol.dto.patch.PatchHistoryDto;
import com.ccs.professorlol.lolInfo.champion.Champion;
import com.ccs.professorlol.lolInfo.champion.ChampionRepository;
import com.ccs.professorlol.patch.champion.ChampionPatchHistory;
import com.ccs.professorlol.patch.champion.PatchHistoryRepository;

@DisplayName("patchHistoryDetailService Test")
@SpringBootTest
@ActiveProfiles("test")
class PatchHistoryDetailServiceTest {

	@Autowired
	PatchHistoryDetailService patchHistoryDetailService;

	@Autowired
	ChampionRepository championRepository;

	@Autowired
	PatchHistoryRepository patchHistoryRepository;

	@Autowired
	EntityManager entityManager;

	@BeforeEach
	void savePatchHistoryToDB() {
		Champion save1 = championRepository.save(makeChampion());
		ChampionPatchHistory patchHistory1 = makeChampionPatchHistory(save1);
		patchHistoryRepository.save(patchHistory1);
		ChampionPatchHistory patchHistory2 = makeChampionPatchHistory(save1);
		patchHistoryRepository.save(patchHistory2);
		entityManager.clear();
	}

	@Transactional

	@Test
	@DisplayName("championPatchHistoryDetail 서비스 테스트")
	void name() {
		List<PatchHistoryDto> detail = patchHistoryDetailService.getChampionPatchHistoryDetail(1L);
		assertThat(detail.size()).isEqualTo(2);
		List<AbilityHistoryDto> abilityHistoryDtos = detail.get(0).getAbilityHistoryDtos();
		List<AttributeHistoryDto> attributeHistoryDtos = abilityHistoryDtos.get(0).getAttributeHistoryDtos();
		assertThat(abilityHistoryDtos.size()).isEqualTo(3);
		assertThat(attributeHistoryDtos.size()).isEqualTo(3);

	}
}