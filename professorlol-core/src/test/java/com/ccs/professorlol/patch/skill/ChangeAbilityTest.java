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
public class ChangeAbilityTest {

    private static final String ATTRIBUTE1 = "피해량";
    private static final String CHANGE_CONTENT1 = "60/85/110/135/160/185";
    private static final String CHANGE_CONTENT2 = "80/105/130/155/180";

    private static final String ATTRIBUTE2 = "최고 스킬 레벨";
    private static final String CHANGE_CONTENT3 = "2";
    private static final String CHANGE_CONTENT4 = "3";


    @Autowired
    ChampionAbilityHistoryRepository championAbilityHistoryRepository;

    @After
    public void tearDown() throws Exception {
        championAbilityHistoryRepository.deleteAll();
    }

    @Test
    public void DiscriminatorValue에따른_ChangeAbility_부모클래스로save_확인() {
        ChampionAbilityHistory championAbilityHistory3 = ChangeAbility.builder()
                .attribute(ATTRIBUTE1)
                .beforeContent(CHANGE_CONTENT1)
                .afterContent(CHANGE_CONTENT2)
                .skillType(SkillType.E)
                .build();

        championAbilityHistoryRepository.save(championAbilityHistory3);

        ChangeAbility changeAbility = (ChangeAbility) championAbilityHistoryRepository.findAll().get(0);
        assertThat(changeAbility.getAttribute()).isEqualTo(ATTRIBUTE1);
        assertThat(changeAbility.getSkillType()).isEqualTo(SkillType.E);
        assertThat(changeAbility.getBeforeContent()).isEqualTo(CHANGE_CONTENT1);
        assertThat(changeAbility.getAfterContent()).isEqualTo(CHANGE_CONTENT2);
        assertThat(changeAbility.getChampionPatchHistory()).isNull();

    }


    @Test
    public void DiscriminatorValue에따른_ChangeAbility_내클래스로save_확인() {
        ChangeAbility championAbilityHistory3 = ChangeAbility.builder()
                .attribute(ATTRIBUTE2)
                .beforeContent(CHANGE_CONTENT3)
                .afterContent(CHANGE_CONTENT4)
                .skillType(SkillType.E)
                .build();

        championAbilityHistoryRepository.save(championAbilityHistory3);

        ChangeAbility changeAbility = (ChangeAbility) championAbilityHistoryRepository.findAll().get(0);
        assertThat(changeAbility.getAttribute()).isEqualTo(ATTRIBUTE2);
        assertThat(changeAbility.getSkillType()).isEqualTo(SkillType.E);
        assertThat(changeAbility.getBeforeContent()).isEqualTo(CHANGE_CONTENT3);
        assertThat(changeAbility.getAfterContent()).isEqualTo(CHANGE_CONTENT4);
        assertThat(changeAbility.getChampionPatchHistory()).isNull();

    }
}