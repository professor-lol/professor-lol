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
public class RemoveAbilityTest {

    private static final String ATTRIBUTE1 = "보호막";
    private static final String REMOVE_CONTENT1 = "이제 룬이 2개 방출되어도 라이즈에게 보호막을 씌우지 않습니다.";

    private static final String ATTRIBUTE2 = "탱탱볼 튀기기";
    private static final String REMOVE_CONTENT2 = "이제 퍼져나간 전이 표식이 적에게 피해를 입히지 않습니다.";

    @Autowired
    ChampionAbilityHistoryRepository championAbilityHistoryRepository;

    @After
    public void tearDown() throws Exception {
        championAbilityHistoryRepository.deleteAll();
    }

    @Test
    public void DiscriminatorValue에따른_RemoveAbility_부모클래스로save_확인() {
        ChampionAbilityHistory championAbilityHistory3 = RemoveAbility.builder()
                .attribute(ATTRIBUTE1)
                .removeContent(REMOVE_CONTENT1)
                .skillType(SkillType.E)
                .build();

        championAbilityHistoryRepository.save(championAbilityHistory3);

        RemoveAbility removeAbility = (RemoveAbility) championAbilityHistoryRepository.findAll().get(0);
        assertThat(removeAbility.getAttribute()).isEqualTo(ATTRIBUTE1);
        assertThat(removeAbility.getSkillType()).isEqualTo(SkillType.E);
        assertThat(removeAbility.getRemoveContent()).isEqualTo(REMOVE_CONTENT1);
        assertThat(removeAbility.getChampionPatchHistory()).isNull();
    }


    @Test
    public void DiscriminatorValue에따른_RemoveAbility_내클래스로save_확인() {
        RemoveAbility championAbilityHistory3 = RemoveAbility.builder()
                .attribute(ATTRIBUTE2)
                .removeContent(REMOVE_CONTENT2)
                .skillType(SkillType.E)
                .build();

        championAbilityHistoryRepository.save(championAbilityHistory3);

        RemoveAbility removeAbility = (RemoveAbility) championAbilityHistoryRepository.findAll().get(0);
        assertThat(removeAbility.getAttribute()).isEqualTo(ATTRIBUTE2);
        assertThat(removeAbility.getSkillType()).isEqualTo(SkillType.E);
        assertThat(removeAbility.getRemoveContent()).isEqualTo(REMOVE_CONTENT2);
        assertThat(removeAbility.getChampionPatchHistory()).isNull();
    }
}