package com.ccs.professorlol.patch.skill;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.assertj.core.api.Java6Assertions.assertThatThrownBy;

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@DataJpaTest
public class ChampionAbilityHistoryTest {

    @Autowired
    ChampionAbilityHistoryRepository<ChampionAbilityHistory> championAbilityHistoryRepository;

    @Autowired
    private EntityManager entityManager;

    private List<ChampionAbilityHistory> saveInitAbility() {

        String attribute1 = "보호막";
        String removeContent1 = "이제 룬이 2개 방출되어도 라이즈에게 보호막을 씌우지 않습니다.";

        String attribute2 = "피해량";
        String changeContent1 = "60/85/110/135/160/185";
        String changeContent2 = "80/105/130/155/180";

        String attribute3 = "멀리 멀리 퍼져라";
        String newContent1 = "이제 첫 번째 대상 주변의 적에게 항상 전이 표식을 남깁니다.";

        List<ChampionAbilityHistory> list = new ArrayList<>();

        ChampionAbilityHistory championAbilityHistory1 = RemoveAbility.builder()
                .attribute(attribute1)
                .removeContent(removeContent1)
                .skillType(SkillType.Q)
                .build();

        ChampionAbilityHistory championAbilityHistory2 = ChangeAbility.builder()
                .attribute(attribute2)
                .beforeContent(changeContent1)
                .afterContent(changeContent2)
                .skillType(SkillType.Q)
                .build();

        ChampionAbilityHistory championAbilityHistory3 = NewAbility.builder()
                .attribute(attribute3)
                .newContent(newContent1)
                .skillType(SkillType.E)
                .build();

        list.add(championAbilityHistory1);
        list.add(championAbilityHistory2);
        list.add(championAbilityHistory3);

        championAbilityHistoryRepository.saveAll(list);
        entityManager.clear();

        return list;
    }

    @Test
    public void championAbilityHistory로_검색시_casting_되는지_확인() {
        List<ChampionAbilityHistory> championAbilityHistories = saveInitAbility();

        RemoveAbility removeAbility = (RemoveAbility) championAbilityHistoryRepository.findAll().get(0);

        assertThat(removeAbility.getAttribute()).isSameAs(championAbilityHistories.get(0).getAttribute());
    }

    @Test
    public void championAbilityHistory로_검색시_잘못된타입인데_casting_되는지_확인() {
        saveInitAbility();

        assertThatThrownBy(()-> {
            ChangeAbility changeAbility = (ChangeAbility) championAbilityHistoryRepository.findAll().get(0);
        }).isInstanceOf(ClassCastException.class);
    }
}