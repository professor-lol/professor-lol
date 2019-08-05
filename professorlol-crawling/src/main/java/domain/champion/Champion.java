package domain.champion;

import org.jsoup.select.Elements;

import java.util.List;

import static jsoupUtil.ElementContextUtil.getTextFromElement;
import static jsoupUtil.ElementContextUtil.getUrlFromElement;

/**
 * 패치 노트에서와 수정된 패치 노트에서의 html이 다르다
 * 아래는 패치 노트 기준
 * 수정된 패치 노트
 * > .change-detail-title .ability-title 안에 image, name 들어가있다
 */
public class Champion { // .header-primary : 제목이 나온다 (여기 id 값에 champions 가 포함되면 이 도메인 사용)
    private String name;                // 챔피온 이름 .change-title #name
    private String image;               // 챔피온 이미지 .reference-link img src
    private String summary;             // 챔피온 변경사항 요약  .summary
    private String context;             // 챔피온 변경사항 이유  .blockquote context
    private List<Ability> abilities;    // 챔피온 변경사항 스킬 리스트  .attribute-change

    Champion(String name, String image, String summary, String context, List<Ability> abilities) {
        this.name = name;
        this.image = image;
        this.summary = summary;
        this.context = context;
        this.abilities = abilities;
    }

    private Champion(Builder builder) {
        this.name = builder.name;
        this.image = builder.image;
        this.summary = builder.summary;
        this.context = builder.context;
        this.abilities = builder.abilities;
    }

    public String toString() {
        return  "\nname : " + name +
                "\nimage : " + image +
                "\nsummary : " + summary +
                "\ncontext : " + context +
                "\nability : " + abilities.toString();
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public String getSummary() {
        return summary;
    }

    public String getContext() {
        return context;
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    public static class Builder {

        private String name;
        private String image;
        private String summary;
        private String context;
        private List<Ability> abilities;

        Builder() {
        }

        Builder name(Elements name) {
            this.name = getTextFromElement(name);
            return this;
        }

        Builder image(Elements image) {
            this.image = getUrlFromElement(image);
            return this;
        }

        Builder summary(Elements summary) {
            this.summary = getTextFromElement(summary);
            return this;
        }

        Builder context(Elements context) {
            this.context = getTextFromElement(context);
            return this;
        }

        Builder abilities(Elements abilities) {
            this.abilities = AbilityFactory.of(abilities);
            return this;
        }

        Champion build() {
            return new Champion(this.name, this.image, this.summary, this.context, this.abilities);
        }
    }
}
