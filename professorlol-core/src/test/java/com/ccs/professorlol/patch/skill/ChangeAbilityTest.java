package com.ccs.professorlol.patch.skill;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ChangeAbilityTest {

    String attribute1 = "피해량";
    String changeContent11 = "60/85/110/135/160/185";
    String changeContent12 = "80/105/130/155/180";

    String attribute2 = "최고 스킬 레벨";
    String changeContent21 = "2";
    String changeContent22 = "3";


    @Autowired
    ChampionAbilityHistoryRepository championAbilityHistoryRepository;

    @Autowired
    ChangeAbilityRepository changeAbilityRepository;

    @Test
    public void DiscriminatorValue에따른_ChangeAbility_부모클래스로save_확인() {
        ChampionAbilityHistory championAbilityHistory3 = ChangeAbility.builder()
                .attribute(attribute1)
                .beforeContent(changeContent11)
                .afterContent(changeContent12)
                .skillType(SkillType.E)
                .build();

        championAbilityHistoryRepository.save(championAbilityHistory3);

        ChangeAbility changeAbility = changeAbilityRepository.findAll().get(0);
        assertThat(changeAbility.getAttribute()).isEqualTo(attribute1);
        assertThat(changeAbility.getSkillType()).isEqualTo(SkillType.E);
        assertThat(changeAbility.getBeforeContent()).isEqualTo(changeContent11);
        assertThat(changeAbility.getAfterContent()).isEqualTo(changeContent12);
        assertThat(changeAbility.getChampionPatchHistory()).isNull();

    }


    @Test
    public void DiscriminatorValue에따른_ChangeAbility_내클래스로save_확인() {
        ChangeAbility championAbilityHistory3 = ChangeAbility.builder()
                .attribute(attribute2)
                .beforeContent(changeContent21)
                .afterContent(changeContent22)
                .skillType(SkillType.E)
                .build();

        changeAbilityRepository.save(championAbilityHistory3);

        ChangeAbility changeAbility = changeAbilityRepository.findAll().get(0);
        assertThat(changeAbility.getAttribute()).isEqualTo(attribute2);
        assertThat(changeAbility.getSkillType()).isEqualTo(SkillType.E);
        assertThat(changeAbility.getBeforeContent()).isEqualTo(changeContent21);
        assertThat(changeAbility.getAfterContent()).isEqualTo(changeContent22);
        assertThat(changeAbility.getChampionPatchHistory()).isNull();

    }
}