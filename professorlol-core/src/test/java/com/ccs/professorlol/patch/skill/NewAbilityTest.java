package com.ccs.professorlol.patch.skill;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Java6Assertions.assertThat;

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@DataJpaTest
@Transactional(propagation = Propagation.NOT_SUPPORTED)
public class NewAbilityTest {

    private static final String ATTRIBUTE = "멀리 멀리 퍼져라";
    private static final String NEW_CONTENT = "이제 첫 번째 대상 주변의 적에게 항상 전이 표식을 남깁니다.";
    private static final String ATTRIBUTE2 = "공간 왜곡 피해";
    private static final String NEW_CONTENT2 = "전이 표식이 남은 대상을 Q - 과부하로 공격하면 40/70/100%의 추가 피해를 입힙니다.";

    @Autowired
    ChampionAbilityHistoryRepository championAbilityHistoryRepository;

    @After
    public void tearDown() throws Exception {
        championAbilityHistoryRepository.deleteAll();
    }

    @Test
    public void DiscriminatorValue에따른_NewAbility_부모클래스로_save_확인_() {
        ChampionAbilityHistory championAbilityHistory3 = NewAbility.builder()
                .attribute(ATTRIBUTE)
                .newContent(NEW_CONTENT)
                .skillType(SkillType.E)
                .build();

        championAbilityHistoryRepository.save(championAbilityHistory3);

        NewAbility newAbility = (NewAbility) championAbilityHistoryRepository.findAll().get(0);
        assertThat(newAbility.getAttribute()).isEqualTo(ATTRIBUTE);
        assertThat(newAbility.getSkillType()).isEqualTo(SkillType.E);
        assertThat(newAbility.getNewContent()).isEqualTo(NEW_CONTENT);
        assertThat(newAbility.getChampionPatchHistory()).isNull();

    }

    @Test
    public void DiscriminatorValue에따른_NewAbility_자식클래스로_save_확인_() {
        NewAbility championAbilityHistory3 = NewAbility.builder()
                .attribute(ATTRIBUTE2)
                .newContent(NEW_CONTENT2)
                .skillType(SkillType.E)
                .build();

        championAbilityHistoryRepository.save(championAbilityHistory3);


        NewAbility newAbility = (NewAbility) championAbilityHistoryRepository.findAll().get(0);
        assertThat(newAbility.getAttribute()).isEqualTo(ATTRIBUTE2);
        assertThat(newAbility.getSkillType()).isEqualTo(SkillType.E);
        assertThat(newAbility.getNewContent()).isEqualTo(NEW_CONTENT2);
        assertThat(newAbility.getChampionPatchHistory()).isNull();

    }
}