package com.ccs.professorlol.service;

import com.ccs.professorlol.PatchNoteCrawler;
import com.ccs.professorlol.PatchResponseDto;
import com.ccs.professorlol.dto.champion.ChampionDto;
import com.ccs.professorlol.dto.champion.ability.Ability;
import com.ccs.professorlol.dto.champion.ability.attribute.Attribute;
import com.ccs.professorlol.lolInfo.champion.Champion;
import com.ccs.professorlol.lolInfo.champion.ChampionRepository;
import com.ccs.professorlol.patch.champion.ChampionPatchHistory;
import com.ccs.professorlol.patch.champion.ChampionPatchHistoryRepository;
import com.ccs.professorlol.patch.skill.ChampionAbilityHistory;
import com.ccs.professorlol.patch.skill.ChampionAttributeHistory;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class ChampionDtoPatchHistoryServiceTest {

    @Autowired
    private ChampionPatchHistoryService championPatchHistoryService;

    @MockBean(name = "patchNoteCrawler")
    private PatchNoteCrawler patchNoteCrawler;

    @Autowired
    private ChampionPatchHistoryRepository patchHistoryRepository;

    @Autowired
    private ChampionRepository championRepository;


    @After
    public void tearDown() {
        patchHistoryRepository.deleteAll();
        championRepository.deleteAll();
    }

    @Test
    public void 챔피언_패치히스토리_저장() {
        //given
        final String championName = "라이즈";
        final String abilityTitle = "과부하";
        final String attribute = "테스트";
        final Long version = 1L;

        //when
        given(patchNoteCrawler.findChampionPatchById(version))
                .willReturn(new PatchResponseDto<>("1", Collections.singletonList(champion(championName, abilityTitle, attribute))));

        championRepository.save(Champion.builder().name(championName).build());
        championPatchHistoryService.createPatchHistory(version);

        //then
        ChampionPatchHistory championPatchHistory = patchHistoryRepository.findAll().get(0);
        ChampionAbilityHistory championAbilityHistory = championPatchHistory.getChampionAbilityHistories().get(0);
        ChampionAttributeHistory championAttributeHistory = championAbilityHistory.getChampionAttributeHistories().get(0);

        assertThat(championPatchHistory.getChampionName()).isEqualTo(championName);
        assertThat(championAbilityHistory.getTitle()).isEqualTo(abilityTitle);
        assertThat(championAttributeHistory.getAttribute()).isEqualTo(attribute);
    }

    private ChampionDto champion(String name, String title, String attribute) {
        return ChampionDto.builder()
                .name(name)
                .abilities(Collections.singletonList(ability(title, attribute)))
                .build();
    }

    private Ability ability(String title, String attribute) {
        return Ability.builder()
                .title(title)
                .attributes(Collections.singletonList(attribute(attribute)))
                .build();
    }

    private Attribute attribute(String attribute) {
        return Attribute.builder()
                .attribute(attribute)
                .build();
    }
}