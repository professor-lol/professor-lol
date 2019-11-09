package com.ccs.professorlol.dto.champion;

import com.ccs.professorlol.dto.champion.ability.Ability;
import com.ccs.professorlol.parser.element.AbilityParser;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.jsoup.nodes.Element;

import java.util.List;

import static com.ccs.professorlol.dto.champion.ChampionSelector.*;
import static com.ccs.professorlol.util.ElementContextUtil.getTextFromCssSelector;
import static com.ccs.professorlol.util.ElementContextUtil.getUrlFromCssSelector;

/**
 * 패치 노트에서와 수정된 패치 노트에서의 html이 다르다
 * 아래는 패치 노트 기준
 * 수정된 패치 노트
 * > .change-detail-title .attribute-title 안에 image, name 들어가있다
 */
@Builder
@AllArgsConstructor
@Getter
public class ChampionDto { // .header-primary : 제목이 나온다 (여기 id 값에 champions 가 포함되면 이 도메인 사용)
    private String name;                // 챔피온 이름 .change-title #name
    private String image;               // 챔피온 이미지 .reference-link img src
    private String summary;             // 챔피온 변경사항 요약  .summary
    private String context;             // 챔피온 변경사항 이유  .blockquote context
    private List<Ability> abilities;    // 챔피온 변경사항 스킬 리스트  .attribute-change

    public String toString() {
        return "\nname : " + name +
                "\nimage : " + image +
                "\nsummary : " + summary +
                "\ncontext : " + context +
                "\nabilities : " + abilities.toString();
    }

    public static ChampionDto of(Element element) {
        return ChampionDto.builder()
                .name(getTextFromCssSelector(element, NAME.getCssQuery()))
                .summary(getTextFromCssSelector(element, SUMMARY.getCssQuery()))
                .context(getTextFromCssSelector(element, CONTEXT.getCssQuery()))
                .image(getUrlFromCssSelector(element, IMAGE.getCssQuery()))
                .abilities(AbilityParser.of(element))
                .build();
    }
}
