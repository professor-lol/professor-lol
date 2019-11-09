package com.ccs.professorlol.patch.skill;

import com.ccs.professorlol.type.AttributeType;
import com.ccs.professorlol.type.SkillType;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@DataJpaTest
@Transactional(propagation = Propagation.NOT_SUPPORTED)
public class ChampionAbilityHistoryTest {

    @Autowired
    ChampionAbilityHistoryRepository championAbilityHistoryRepository;

    @After
    public void tearDown() throws Exception {
        championAbilityHistoryRepository.deleteAll();
    }

    private ChampionAbilityHistory makeAbilityList() {

        String title = "큐스킬";
        String image = "src";

        String attribute1 = "보호막";
        String removeContent1 = "이제 룬이 2개 방출되어도 라이즈에게 보호막을 씌우지 않습니다.";

        String attribute2 = "피해량";
        String changeContent1 = "60/85/110/135/160/185";
        String changeContent2 = "80/105/130/155/180";

        String attribute3 = "멀리 멀리 퍼져라";
        String newContent1 = "이제 첫 번째 대상 주변의 적에게 항상 전이 표식을 남깁니다.";

        List<ChampionAttributeHistory> championAttributeHistories = new ArrayList<>();

        ChampionAttributeHistory championAttributeHistory1 = ChampionAttributeHistory.builder()
                .attribute(attribute1)
                .afterContent(removeContent1)
                .beforeContent(null)
                .attributeType(AttributeType.REMOVE)
                .build();

        ChampionAttributeHistory championAttributeHistory2 = ChampionAttributeHistory.builder()
                .attribute(attribute2)
                .afterContent(changeContent1)
                .beforeContent(changeContent2)
                .attributeType(AttributeType.CHANGE)
                .build();

        ChampionAttributeHistory championAttributeHistory3 = ChampionAttributeHistory.builder()
                .attribute(attribute3)
                .afterContent(newContent1)
                .beforeContent(null)
                .attributeType(AttributeType.NEW)
                .build();

        championAttributeHistories.add(championAttributeHistory1);
        championAttributeHistories.add(championAttributeHistory2);
        championAttributeHistories.add(championAttributeHistory3);

        return ChampionAbilityHistory.builder()
                .title(title)
                .image(image)
                .championAttributeHistories(championAttributeHistories)
                .skillType(SkillType.Q)
                .build();
    }


    @Test
    public void 어빌리티_생성() {
        ChampionAbilityHistory championAbilityHistories = makeAbilityList();

        championAbilityHistoryRepository.save(championAbilityHistories);
        ChampionAbilityHistory ability = championAbilityHistoryRepository.findAll().get(0);

        assertThat(ability.getTitle()).isEqualTo("큐스킬");
        assertThat(ability.getChampionAttributeHistories().size()).isEqualTo(3);
    }
}