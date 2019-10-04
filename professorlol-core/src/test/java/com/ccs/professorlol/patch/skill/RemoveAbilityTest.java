package com.ccs.professorlol.patch.skill;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class RemoveAbilityTest {

    String attribute1 = "보호막";
    String removeContent1 = "이제 룬이 2개 방출되어도 라이즈에게 보호막을 씌우지 않습니다.";

    String attribute2 = "탱탱볼 튀기기";
    String removeContent2 = "이제 퍼져나간 전이 표식이 적에게 피해를 입히지 않습니다.";

    @Autowired
    ChampionAbilityHistoryRepository championAbilityHistoryRepository;

    @Autowired
    RemoveAbilityRepository removeAbilityRepository;


    @Test
    public void DiscriminatorValue에따른_RemoveAbility_부모클래스로save_확인() {
        ChampionAbilityHistory championAbilityHistory3 = RemoveAbility.builder()
                .attribute(attribute1)
                .removeContent(removeContent1)
                .skillType(SkillType.E)
                .build();

        championAbilityHistoryRepository.save(championAbilityHistory3);

        RemoveAbility removeAbility = removeAbilityRepository.findAll().get(0);
        assertThat(removeAbility.getAttribute()).isEqualTo(attribute1);
        assertThat(removeAbility.getSkillType()).isEqualTo(SkillType.E);
        assertThat(removeAbility.getRemoveContent()).isEqualTo(removeContent1);
        assertThat(removeAbility.getChampionPatchHistory()).isNull();
    }


    @Test
    public void DiscriminatorValue에따른_RemoveAbility_내클래스로save_확인() {
        RemoveAbility championAbilityHistory3 = RemoveAbility.builder()
                .attribute(attribute2)
                .removeContent(removeContent2)
                .skillType(SkillType.E)
                .build();

        removeAbilityRepository.save(championAbilityHistory3);

        RemoveAbility removeAbility = removeAbilityRepository.findAll().get(0);
        assertThat(removeAbility.getAttribute()).isEqualTo(attribute2);
        assertThat(removeAbility.getSkillType()).isEqualTo(SkillType.E);
        assertThat(removeAbility.getRemoveContent()).isEqualTo(removeContent2);
        assertThat(removeAbility.getChampionPatchHistory()).isNull();
    }
}