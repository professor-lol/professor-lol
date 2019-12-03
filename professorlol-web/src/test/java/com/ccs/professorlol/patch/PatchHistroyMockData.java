package com.ccs.professorlol.patch;

import static com.ccs.professorlol.type.AttributeType.*;

import java.util.ArrayList;
import java.util.List;

import com.ccs.professorlol.lolInfo.champion.Champion;
import com.ccs.professorlol.patch.champion.ChampionPatchHistory;
import com.ccs.professorlol.patch.skill.ChampionAbilityHistory;
import com.ccs.professorlol.patch.skill.ChampionAttributeHistory;
import com.ccs.professorlol.type.SkillType;

public class PatchHistroyMockData {

	public final static String PATCH_VERSION = "1v";

	public final static String CHAMPION_NAME = "라이즈";
	public final static String SUMMARY = "Q - 과부하 최고 스킬 레벨이 감소하고 보호막이 삭제되며 추가 피해량이 R - 공간 왜곡에 따라 증가합니다.";
	public final static String CONTEXT = "라이즈로 최적의 플레이를 펼칠 경우 약점을 찾기가 너무나 힘듭니다. 또한 라이즈는 사전 구성된 팀에서 아주 강한 위력을 발휘합니다.";

	public final static String TITLE = "큐스킬";
	public final static String IMAGE = "src";

	public final static String ATTRIBUTE1 = "보호막";
	public final static String REMOVE_CONTENT1 = "이제 룬이 2개 방출되어도 라이즈에게 보호막을 씌우지 않습니다.";
	public final static String ATTRIBUTE2 = "피해량";
	public final static String CHANGE_CONTENT1 = "60/85/110/135/160/185";
	public final static String CHANGE_CONTENT2 = "80/105/130/155/180";
	public final static String ATTRIBUTE3 = "멀리 멀리 퍼져라";
	public final static String NEW_CONTENT1 = "이제 첫 번째 대상 주변의 적에게 항상 전이 표식을 남깁니다.";

	public static ChampionPatchHistory makeChampionPatchHistory(Champion champion) {
		return ChampionPatchHistory.builder()
			.championName(CHAMPION_NAME)
			.context(CONTEXT)
			.summary(SUMMARY)
			.patchVersion(PATCH_VERSION)
			.championAbilityHistories(makeChampionPatchHistoryList())
			.champion(champion)
			.build();
	}

	public static ChampionPatchHistory makeChampionPatchHistory() {
		return ChampionPatchHistory.builder()
			.championName(CHAMPION_NAME)
			.context(CONTEXT)
			.summary(SUMMARY)
			.patchVersion(PATCH_VERSION)
			.championAbilityHistories(makeChampionPatchHistoryList())
			.build();
	}

	private static List<ChampionAbilityHistory> makeChampionPatchHistoryList() {
		List<ChampionAbilityHistory> championAbilityHistories = new ArrayList<>();
		championAbilityHistories.add(makeChampionAbilityHistory());
		championAbilityHistories.add(makeChampionAbilityHistory());
		championAbilityHistories.add(makeChampionAbilityHistory());

		return championAbilityHistories;
	}

	public static ChampionAttributeHistory makeChampionAttribute() {
		return ChampionAttributeHistory.builder()
			.attribute(ATTRIBUTE1)
			.afterContent(REMOVE_CONTENT1)
			.attributeType(REMOVE)
			.build();
	}

	private static List<ChampionAttributeHistory> makeListChampionAttributeHistory() {
		List<ChampionAttributeHistory> championAttributeHistories = new ArrayList<>();
		championAttributeHistories.add(makeChampionAttribute());
		championAttributeHistories.add(makeChampionAttribute());
		championAttributeHistories.add(makeChampionAttribute());

		return championAttributeHistories;
	}

	public static ChampionAbilityHistory makeChampionAbilityHistory() {
		return ChampionAbilityHistory.builder()
			.image(IMAGE)
			.title(TITLE)
			.skillType(SkillType.Q)
			.championAttributeHistories(makeListChampionAttributeHistory())
			.build();
	}

	public static Champion makeChampion() {
		return Champion.builder()
			.key("key")
			.name(CHAMPION_NAME)
			.riotId("riotId")
			.build();
	}

}
