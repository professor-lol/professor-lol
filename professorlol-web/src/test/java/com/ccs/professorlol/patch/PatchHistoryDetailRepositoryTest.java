package com.ccs.professorlol.patch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccs.professorlol.patch.champion.ChampionPatchHistory;
import com.ccs.professorlol.patch.champion.PatchHistory;
import com.ccs.professorlol.patch.skill.ChampionAbilityHistory;
import com.ccs.professorlol.patch.skill.ChampionAttributeHistory;
import com.ccs.professorlol.type.AttributeType;
import com.ccs.professorlol.type.SkillType;

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@DataJpaTest
@Transactional(propagation = Propagation.NOT_SUPPORTED)
public class PatchHistoryDetailRepositoryTest {

	@Autowired
	PatchHistoryDetailRepository patchHistoryDetailRepository;

	private final static String CHAMPION_NAME = "라이즈";
	private final static String SUMMARY = "Q - 과부하 최고 스킬 레벨이 감소하고 보호막이 삭제되며 추가 피해량이 R - 공간 왜곡에 따라 증가합니다.";
	private final static String CONTEXT = "라이즈로 최적의 플레이를 펼칠 경우 약점을 찾기가 너무나 힘듭니다. 또한 라이즈는 사전 구성된 팀에서 아주 강한 위력을 발휘합니다.";

	@Before
	public void setUp() throws Exception {
		PatchHistory patchHistory = makePatchHistory();

	}

	@Test
	public void 조회테스트() {
		// List<ChampionAbilityHistory> byChampionId = patchHistoryDetailRepository.getMyChampionHistory(1L);
		List<ChampionAbilityHistory> championAbilityHistories = patchHistoryDetailRepository.getAllChampionHistory();

	}

	private PatchHistory makePatchHistory() {
		ChampionAbilityHistory championAbilityHistory = makeAbilityList();

		PatchHistory patchHistory = ChampionPatchHistory.builder()
			.patchVersion("1v")
			.championAbilityHistories(Collections.singletonList(championAbilityHistory))
			.championName(CHAMPION_NAME)
			.summary(SUMMARY)
			.context(CONTEXT)
			.build();

		return patchHistory;
	}

	private ChampionPatchHistory makeChampionPatchHistory() {
		List<ChampionAbilityHistory> championAbilityHistories = Collections.singletonList(makeAbilityList());

		ChampionPatchHistory patchHistory = ChampionPatchHistory.builder()
			.patchVersion("1v")
			.championAbilityHistories(championAbilityHistories)
			.championName(CHAMPION_NAME)
			.summary(SUMMARY)
			.context(CONTEXT)
			.build();

		return patchHistory;
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
}