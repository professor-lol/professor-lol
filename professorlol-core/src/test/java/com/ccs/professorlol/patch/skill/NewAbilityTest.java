package com.ccs.professorlol.patch.skill;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class NewAbilityTest {

    String attribute1 = "멀리 멀리 퍼져라";
    String newContent1 = "이제 첫 번째 대상 주변의 적에게 항상 전이 표식을 남깁니다.";
    //
    String attribute2 = "공간 왜곡 피해";
    String newContent2 = "전이 표식이 남은 대상을 Q - 과부하로 공격하면 40/70/100%의 추가 피해를 입힙니다.";

//    String attribute1 = "멀리 멀리 퍼져라";
//    String newContent1 = "이제 첫 번째 대상 주변의 적에게 항상 전이 표식을 남깁니다.";

    @Autowired
    ChampionAbilityHistoryRepository championAbilityHistoryRepository;

    @Autowired
    NewAbilityRepository newAbilityRepository;

    @Autowired
    private EntityManager entityManager;

    @Test
    public void DiscriminatorValue에따른_NewAbility_부모클래스로_save_확인_() {
        ChampionAbilityHistory championAbilityHistory3 = NewAbility.builder()
                .attribute(attribute1)
                .newContent(newContent1)
                .skillType(SkillType.E)
                .build();

        championAbilityHistoryRepository.save(championAbilityHistory3);
        entityManager.clear();

        NewAbility newAbility = newAbilityRepository.findAll().get(0);
        assertThat(newAbility.getAttribute()).isEqualTo(attribute1);
        assertThat(newAbility.getSkillType()).isEqualTo(SkillType.E);
        assertThat(newAbility.getNewContent()).isEqualTo(newContent1);
        assertThat(newAbility.getChampionPatchHistory()).isNull();

    }

    @Test
    public void DiscriminatorValue에따른_NewAbility_자식클래스로_save_확인_() {
        NewAbility championAbilityHistory3 = NewAbility.builder()
                .attribute(attribute2)
                .newContent(newContent2)
                .skillType(SkillType.E)
                .build();

        newAbilityRepository.save(championAbilityHistory3);
        entityManager.clear();

        NewAbility newAbility = newAbilityRepository.findAll().get(0);
        assertThat(newAbility.getAttribute()).isEqualTo(attribute2);
        assertThat(newAbility.getSkillType()).isEqualTo(SkillType.E);
        assertThat(newAbility.getNewContent()).isEqualTo(newContent2);
        assertThat(newAbility.getChampionPatchHistory()).isNull();

    }
}