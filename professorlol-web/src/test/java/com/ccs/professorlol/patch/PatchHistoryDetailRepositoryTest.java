package com.ccs.professorlol.patch;

import com.ccs.professorlol.lolInfo.champion.Champion;
import com.ccs.professorlol.lolInfo.champion.ChampionRepository;
import com.ccs.professorlol.patch.champion.ChampionPatchHistory;
import com.ccs.professorlol.patch.champion.PatchHistoryRepository;
import com.ccs.professorlol.patch.skill.ChampionAbilityHistory;
import com.ccs.professorlol.patch.skill.ChampionAttributeHistory;
import com.ccs.professorlol.type.AttributeType;
import com.ccs.professorlol.type.SkillType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.ArrayList;
import java.util.List;

import static com.ccs.professorlol.type.AttributeType.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;


@DisplayName("패치노트에서 챔피언별 조회 테스트")
@ActiveProfiles("test")
@SpringBootTest
class PatchHistoryDetailRepositoryTest {

	@Autowired
	PatchHistoryDetailRepository patchHistoryDetailRepository;

	@Autowired
	PatchHistoryRepository patchHistoryRepository;

	private final String ATTRIBUTE1 = "보호막";

	private final static String CHAMPION_NAME = "라이즈";
	private final static String SUMMARY = "Q - 과부하 최고 스킬 레벨이 감소하고 보호막이 삭제되며 추가 피해량이 R - 공간 왜곡에 따라 증가합니다.";
	private final static String CONTEXT = "라이즈로 최적의 플레이를 펼칠 경우 약점을 찾기가 너무나 힘듭니다. 또한 라이즈는 사전 구성된 팀에서 아주 강한 위력을 발휘합니다.";

	private final static String TITLE = "큐스킬";
	private final static String IMAGE = "src";
	private final String REMOVE_CONTENT1 = "이제 룬이 2개 방출되어도 라이즈에게 보호막을 씌우지 않습니다.";
	private final String ATTRIBUTE2 = "피해량";
	private final String CHANGE_CONTENT1 = "60/85/110/135/160/185";
	private final String CHANGE_CONTENT2 = "80/105/130/155/180";
	private final String ATTRIBUTE3 = "멀리 멀리 퍼져라";
	private final String NEW_CONTENT1 = "이제 첫 번째 대상 주변의 적에게 항상 전이 표식을 남깁니다.";
	@Autowired
	ChampionRepository championRepository;

	@BeforeEach
	public void setUp() throws Exception {
		Champion save1 = championRepository.save(makeChampion());
		ChampionPatchHistory patchHistory1 = makePatchHistory(save1);
		patchHistoryRepository.save(patchHistory1);
		ChampionPatchHistory patchHistory2 = makePatchHistory(save1);
		patchHistoryRepository.save(patchHistory2);
	}

	@AfterEach
	void tearDown() {
		patchHistoryDetailRepository.deleteAll();
		patchHistoryRepository.deleteAll();
		championRepository.deleteAll();
	}

	@Test
	@DisplayName("챔피언 아이디값을 이용해서, 해당 챔피언의 패치정보 리스트 가져오기")

	public void getChampionDetailByChampionId() {
		List<ChampionAbilityHistory> championAbilityHistories =
				patchHistoryDetailRepository.getMyChampionHistoryByChampionId(1L);

		assertAll(
				() -> assertThat(championAbilityHistories.size()).isEqualTo(4)
		);

		//ChampionAbilityHistory 검증
		for (ChampionAbilityHistory ch : championAbilityHistories) {
			assertAll(
					() -> assertThat(ch.getImage()).isEqualTo(IMAGE),
					() -> assertThat(ch.getTitle()).isEqualTo(TITLE),
					() -> assertThat(ch.getSkillType()).isEqualTo(SkillType.Q)
			);
			ChampionPatchHistory championPatchHistory = ch.getChampionPatchHistory();
			assertAll(
					() -> assertThat(championPatchHistory.getPatchVersion()).isEqualTo("1v"),
					() -> assertThat(championPatchHistory.getChampionName()).isEqualTo(CHAMPION_NAME),
					() -> assertThat(championPatchHistory.getContext()).isEqualTo(CONTEXT),
					() -> assertThat(championPatchHistory.getSummary()).isEqualTo(SUMMARY));

			Champion champion = championPatchHistory.getChampion();
			assertAll(
					() -> assertThat(champion.getKey()).isEqualTo("key"),
					() -> assertThat(champion.getName()).isEqualTo(CHAMPION_NAME),
					() -> assertThat(champion.getRiotId()).isEqualTo("riotId")
			);

			List<ChampionAttributeHistory> championAttributeHistories = ch.getChampionAttributeHistories();
			ChampionAttributeHistory championAttributeHistories1 = championAttributeHistories.get(0);
			assertAll(
					() -> assertThat(championAttributeHistories1.getAttributeType()).isEqualTo(REMOVE),
					() -> assertThat(championAttributeHistories1.getAttribute()).isEqualTo(ATTRIBUTE1),
					() -> assertThat(championAttributeHistories1.getAfterContent()).isEqualTo(REMOVE_CONTENT1),
					() -> assertThat(championAttributeHistories1.getBeforeContent()).isEqualTo(null)
			);
			ChampionAttributeHistory championAttributeHistories2 = championAttributeHistories.get(1);
			assertAll(
					() -> assertThat(championAttributeHistories2.getAttributeType()).isEqualTo(CHANGE),
					() -> assertThat(championAttributeHistories2.getAttribute()).isEqualTo(ATTRIBUTE2),
					() -> assertThat(championAttributeHistories2.getAfterContent()).isEqualTo(CHANGE_CONTENT1),
					() -> assertThat(championAttributeHistories2.getBeforeContent()).isEqualTo(CHANGE_CONTENT2)
			);
			ChampionAttributeHistory championAttributeHistories3 = championAttributeHistories.get(2);
			assertAll(
					() -> assertThat(championAttributeHistories3.getAttributeType()).isEqualTo(NEW),
					() -> assertThat(championAttributeHistories3.getAttribute()).isEqualTo(ATTRIBUTE3),
					() -> assertThat(championAttributeHistories3.getAfterContent()).isEqualTo(NEW_CONTENT1),
					() -> assertThat(championAttributeHistories3.getBeforeContent()).isEqualTo(null)
			);
		}
	}

	private Champion makeChampion() {
		return Champion.builder()
				.key("key")
				.name(CHAMPION_NAME)
				.riotId("riotId")
				.build();
	}

	private ChampionPatchHistory makePatchHistory(Champion champion) {

		return ChampionPatchHistory.builder()
				.patchVersion("1v")
				.championAbilityHistories(makeAbilityList())
				.championName(CHAMPION_NAME)
				.summary(SUMMARY)
				.context(CONTEXT)
				.champion(champion)
				.build();
	}

	private List<ChampionAbilityHistory> makeAbilityList() {

		List<ChampionAbilityHistory> championAbilityHistories = new ArrayList<>();

		List<ChampionAttributeHistory> championAttributeHistories0 = makeAttributeList();
		List<ChampionAttributeHistory> championAttributeHistories1 = makeAttributeList();

		ChampionAbilityHistory build = ChampionAbilityHistory.builder()
				.title(TITLE)
				.image(IMAGE)
				.championAttributeHistories(championAttributeHistories0)
				.skillType(SkillType.Q)
				.build();

		ChampionAbilityHistory build1 = ChampionAbilityHistory.builder()
				.title(TITLE)
				.image(IMAGE)
				.championAttributeHistories(championAttributeHistories1)
				.skillType(SkillType.Q)
				.build();

		championAbilityHistories.add(build);
		championAbilityHistories.add(build1);

		return championAbilityHistories;
	}

	private List<ChampionAttributeHistory> makeAttributeList() {
		List<ChampionAttributeHistory> championAttributeHistories = new ArrayList<>();

		ChampionAttributeHistory championAttributeHistory1 = ChampionAttributeHistory.builder()
				.attribute(ATTRIBUTE1)
				.afterContent(REMOVE_CONTENT1)
				.beforeContent(null)
				.attributeType(REMOVE)
				.build();

		ChampionAttributeHistory championAttributeHistory2 = ChampionAttributeHistory.builder()
				.attribute(ATTRIBUTE2)
				.afterContent(CHANGE_CONTENT1)
				.beforeContent(CHANGE_CONTENT2)
				.attributeType(AttributeType.CHANGE)
				.build();

		ChampionAttributeHistory championAttributeHistory3 = ChampionAttributeHistory.builder()
				.attribute(ATTRIBUTE3)
				.afterContent(NEW_CONTENT1)
				.beforeContent(null)
				.attributeType(AttributeType.NEW)
				.build();

		championAttributeHistories.add(championAttributeHistory1);
		championAttributeHistories.add(championAttributeHistory2);
		championAttributeHistories.add(championAttributeHistory3);
		return championAttributeHistories;
	}

}