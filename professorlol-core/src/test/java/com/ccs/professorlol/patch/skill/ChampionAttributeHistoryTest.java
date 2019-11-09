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

import java.util.Collections;

import static org.assertj.core.api.Java6Assertions.assertThat;

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@DataJpaTest
@Transactional(propagation = Propagation.NOT_SUPPORTED)
public class ChampionAttributeHistoryTest {

    private static final String ATTRIBUTE = "멀리 멀리 퍼져라";
    private static final String NEW_CONTENT = "이제 첫 번째 대상 주변의 적에게 항상 전이 표식을 남깁니다.";
    private static final String ATTRIBUTE1 = "보호막";
    private static final String REMOVE_CONTENT1 = "이제 룬이 2개 방출되어도 라이즈에게 보호막을 씌우지 않습니다.";
    private static final String ATTRIBUTE2 = "피해량";
    private static final String CHANGE_CONTENT1 = "60/85/110/135/160/185";
    private static final String CHANGE_CONTENT2 = "80/105/130/155/180";


    @Autowired
    ChampionAbilityHistoryRepository championAbilityHistoryRepository;

    @Autowired
    ChampionAttributeHistoryRepository championAttributeHistoryRepository;


    @After
    public void tearDown() throws Exception {
        championAbilityHistoryRepository.deleteAll();
    }

    @Test
    public void 새로운_어빌리티_생성() {
        ChampionAttributeHistory championAbilityHistory3 = ChampionAttributeHistory.builder()
                .attribute(ATTRIBUTE)
                .afterContent(NEW_CONTENT)
                .attributeType(AttributeType.NEW)
                .build();

        championAbilityHistoryRepository.save(championAbilityHistory(championAbilityHistory3));

        ChampionAttributeHistory removeAbility = championAttributeHistoryRepository.findAll().get(0);
        assertThat(removeAbility.getAttribute()).isEqualTo(ATTRIBUTE);
        assertThat(removeAbility.getAfterContent()).isEqualTo(NEW_CONTENT);
        assertThat(removeAbility.getAttributeType()).isEqualTo(AttributeType.NEW);
        assertThat(removeAbility.getChampionAbilityHistory()).isNotNull();
    }

    @Test
    public void 삭제된_어빌리티_생성() {
        ChampionAttributeHistory championAbilityHistory3 = ChampionAttributeHistory.builder()
                .attribute(ATTRIBUTE1)
                .afterContent(REMOVE_CONTENT1)
                .attributeType(AttributeType.REMOVE)
                .build();

        championAbilityHistoryRepository.save(championAbilityHistory(championAbilityHistory3));

        ChampionAttributeHistory removeAbility = championAttributeHistoryRepository.findAll().get(0);
        assertThat(removeAbility.getAttribute()).isEqualTo(ATTRIBUTE1);
        assertThat(removeAbility.getAfterContent()).isEqualTo(REMOVE_CONTENT1);
        assertThat(removeAbility.getAttributeType()).isEqualTo(AttributeType.REMOVE);
        assertThat(removeAbility.getChampionAbilityHistory()).isNotNull();
    }

    @Test
    public void 변경된_어빌리티_생성() {
        ChampionAttributeHistory championAbilityHistory3 = ChampionAttributeHistory.builder()
                .attribute(ATTRIBUTE2)
                .beforeContent(CHANGE_CONTENT1)
                .afterContent(CHANGE_CONTENT2)
                .attributeType(AttributeType.CHANGE)
                .build();

        championAbilityHistoryRepository.save(championAbilityHistory(championAbilityHistory3));

        ChampionAttributeHistory changeAbility = championAttributeHistoryRepository.findAll().get(0);
        assertThat(changeAbility.getAttribute()).isEqualTo(ATTRIBUTE2);
        assertThat(changeAbility.getBeforeContent()).isEqualTo(CHANGE_CONTENT1);
        assertThat(changeAbility.getAfterContent()).isEqualTo(CHANGE_CONTENT2);
        assertThat(changeAbility.getAttributeType()).isEqualTo(AttributeType.CHANGE);
        assertThat(changeAbility.getChampionAbilityHistory()).isNotNull();
    }

    private ChampionAbilityHistory championAbilityHistory(ChampionAttributeHistory championAttributeHistory) {
        return ChampionAbilityHistory.builder()
                .title("큐")
                .image("src")
                .skillType(SkillType.Q)
                .championAttributeHistories(Collections.singletonList(championAttributeHistory))
                .build();
    }
}