package com.css.professorlol.domain.champion;

import com.css.professorlol.jsoupUtil.DocumentUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

import static com.css.professorlol.domain.champion.ability.AbilityFactoryTest.ABILITY_FILE_PATH;
import static org.junit.Assert.assertEquals;


public class ChampionMapperTest {
    public final static String CHAMPION_FILE_PATH = "com/css/professorlol/domain/champion/ChampionOneElement";

    @Test
    public void 하나의_Champion_생성_확인() throws IOException {
        //given
        ClassPathResource resourceHTMLFile = new ClassPathResource(CHAMPION_FILE_PATH);
        Document document = DocumentUtil.convertFromHtmlFile(resourceHTMLFile.getFile());
        Element select = document.child(0);

        //when
        Champion champion = ChampionMapper.of(select);

        //then
        assertEquals("라이즈", champion.getName());
        assertEquals("./PatchNote_9_12_files/image(2)", champion.getImage());
        assertEquals("Q - 과부하 최고 스킬 레벨이 감소하고 보호막이 삭제되며 " +
                "추가 피해량이 R - 공간 왜곡에 따라 증가합니다. " +
                "이제 W - 룬 감옥이 둔화 효과를 적용하고, " +
                "E - 주문 전이로 전이 표식을 남긴 적에게는 둔화 대신 속박 효과가 적용됩니다.", champion.getSummary());

        assertEquals("라이즈로 최적의 플레이를 펼칠 경우 약점을 찾기가 너무나 힘듭니다. " +
                "또한 라이즈는 사전 구성된 팀에서 아주 강한 위력을 발휘합니다. " +
                "프로 플레이에서는 이런 특징을 가진 챔피언을 선호하기 때문에 라이즈는 지금까지 " +
                "강력한 챔피언 선택지로 자리잡고 있습니다. 이런 위력을 약화시켜서 프로 플레이에서 발휘하는 존재감을 " +
                "조정하는 동시에 라이즈를 선택하고 싶지만 연계 공격을 완벽하게는 입력하지 못하는 플레이어에게 도움이 " +
                "될 수 있는 변경을 적용했습니다. 라이즈의 보호막이 삭제되면 까다로운 상대를 만났을 때 살아남을 수 있는 " +
                "수단이 많지 않아질 겁니다. 군중 제어 효과를 둔화로 변경하면 라이즈의 갱킹 대상이 2대 1 공격" +
                "(특히 점멸 > W - 룬 감옥 연계 공격)에서 도망칠 수 있는 가능성도 더 높아지겠죠. " +
                "숙련도가 낮은 플레이어들이 라이즈를 더 쉽게 플레이할 수 있도록 하기 위한 전반적 조정의 일환으로서 " +
                "E - 주문 전이가 첫 번째 대상 주변의 적에게 항상 전이 표식을 남기게 하고 " +
                "R - 공간 왜곡 기본 지속 효과로 추가 피해를 입히도록 했으니 전이 표식을 활용할 여지가 더 커질 겁니다. " +
                "또한 이번 변경에 맞춰 다양한 조정도 적용했습니다. 이번 변경이 일반적으로 업데이트라고 부를 정도의 규모는 " +
                "아니지만 라이즈는 변경되는 경우가 많지 않으니 업데이트라고 생각하셔도 좋습니다. 라이즈 버전 7을 기대해주세요! " +
                "(버전 8이었나요?)", champion.getContext());

        assertEquals(5, champion.getAbilities().size());
    }

    @Test
    public void ChampionMapper의_인자_ability와_AbilityFactory에_사용되는_mock_대응() throws IOException {
        //given
        ClassPathResource resourceChampionHTMLFile = new ClassPathResource(CHAMPION_FILE_PATH);
        Document championDocument = DocumentUtil.convertFromHtmlFile(resourceChampionHTMLFile.getFile());
        Element abilitiesElements = championDocument.child(0);

        ClassPathResource resourceAbilityHTMLFile = new ClassPathResource(ABILITY_FILE_PATH);
        Document abilityDocument = DocumentUtil.convertFromHtmlFile(resourceAbilityHTMLFile.getFile());
        Element manyAbilityElements = abilityDocument.child(0);

        //when

        //then
        assertEquals(abilitiesElements.val(), manyAbilityElements.val());
    }
}