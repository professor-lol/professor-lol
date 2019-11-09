package com.ccs.professorlol.patch.champion;

import com.ccs.professorlol.patch.skill.*;
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
@DataJpaTest    //spring context 안띄고 test!
@Transactional(propagation = Propagation.NOT_SUPPORTED)
public class PatchHistoryTest {
    private final static String CHAMPION_NAME = "라이즈";
    private final static String SUMMARY = "Q - 과부하 최고 스킬 레벨이 감소하고 보호막이 삭제되며 추가 피해량이 R - 공간 왜곡에 따라 증가합니다.";
    private final static String CONTEXT = "라이즈로 최적의 플레이를 펼칠 경우 약점을 찾기가 너무나 힘듭니다. 또한 라이즈는 사전 구성된 팀에서 아주 강한 위력을 발휘합니다.";
    @Autowired
    PatchHistoryRepository patchHistoryRepository;
    @Autowired
    ChampionPatchHistoryRepository championPatchHistoryRepository;

    @After
    public void tearDown() throws Exception {
        patchHistoryRepository.deleteAll();
    }

    @Test
    public void PatchHistory로_검색시_casting_되는지_확인() {
        List<ChampionAbilityHistory> saveAbilityList = makeAbilityList();
        ChampionPatchHistory savePatchHistory = makeChampionPatchHistory(saveAbilityList);

        patchHistoryRepository.save(savePatchHistory);

        ChampionPatchHistory championPatchHistory = (ChampionPatchHistory) patchHistoryRepository.findAll().get(0);

        assertThat(championPatchHistory.getChampionName()).isSameAs(savePatchHistory.getChampionName());
    }

    @Test
    public void ChampionPatchHistory에서_ChampionAbilityHistory연결_확인() {
        List<ChampionAbilityHistory> saveAbilityList = makeAbilityList();
        ChampionPatchHistory savePatchHistory = makeChampionPatchHistory(saveAbilityList);

        championPatchHistoryRepository.save(savePatchHistory);

        ChampionPatchHistory championPatchHistory = championPatchHistoryRepository.findAll().get(0);

        assertThat(championPatchHistory.getChampionAbilityHistories().size()).isEqualTo(3);
    }

    @Test
    public void ChampionAbilityHistory에서_ChampionPatchHistory연결_확인() {
        List<ChampionAbilityHistory> saveAbilityList = makeAbilityList();
        ChampionPatchHistory savePatchHistory = makeChampionPatchHistory(saveAbilityList);

        championPatchHistoryRepository.save(savePatchHistory);

        ChampionPatchHistory championPatchHistory = championPatchHistoryRepository.findAll().get(0);

        assertThat(championPatchHistory.getChampionAbilityHistories().size()).isEqualTo(3);

        List<ChampionAbilityHistory> championAbilityHistories = championPatchHistory.getChampionAbilityHistories();

        assertBindHistory(championAbilityHistories.get(0).getChampionPatchHistory());
        assertBindHistory(championAbilityHistories.get(1).getChampionPatchHistory());
        assertBindHistory(championAbilityHistories.get(2).getChampionPatchHistory());
    }

    private void assertBindHistory(ChampionPatchHistory championPatchHistory) {
        assertThat(championPatchHistory.getChampionName()).isEqualTo(CHAMPION_NAME);
        assertThat(championPatchHistory.getContext()).isEqualTo(CONTEXT);
        assertThat(championPatchHistory.getSummary()).isEqualTo(SUMMARY);
    }

    private ChampionPatchHistory makeChampionPatchHistory(List<ChampionAbilityHistory> championAbilityHistories) {
        return ChampionPatchHistory.builder()
                .patchVersion("1v")
                .championAbilityHistories(championAbilityHistories)
                .championName(CHAMPION_NAME)
                .summary(SUMMARY)
                .context(CONTEXT)
                .build();
    }

    private List<ChampionAbilityHistory> makeAbilityList() {

        String attribute1 = "보호막";
        String removeContent1 = "이제 룬이 2개 방출되어도 라이즈에게 보호막을 씌우지 않습니다.";

        String attribute2 = "피해량";
        String changeContent1 = "60/85/110/135/160/185";
        String changeContent2 = "80/105/130/155/180";

        String attribute3 = "멀리 멀리 퍼져라";
        String newContent1 = "이제 첫 번째 대상 주변의 적에게 항상 전이 표식을 남깁니다.";

        List<ChampionAbilityHistory> championAbilityHistories = new ArrayList<>();

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

        championAbilityHistories.add(championAbilityHistory1);
        championAbilityHistories.add(championAbilityHistory2);
        championAbilityHistories.add(championAbilityHistory3);

        return championAbilityHistories;
    }
}