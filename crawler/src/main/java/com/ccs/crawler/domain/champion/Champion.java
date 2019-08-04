package com.ccs.crawler.domain.champion;

import java.util.List;

/**
 * 패치 노트에서와 수정된 패치 노트에서의 html이 다르다
 * 아래는 패치 노트 기준
 * 수정된 패치 노트
 * > .change-detail-title .ability-title 안에 image, name 들어가있다
 */
//@AllArgsConstructor
//@Getter
//@Builder
public class Champion { // .header-primary : 제목이 나온다 (여기 id 값에 champions 가 포함되면 이 도메인 사용)
    private String name;                // 챔피온 이름 .change-title #name
    private String image;               // 챔피온 이미지 .reference-link img src
    private String summary;             // 챔피온 변경사항 요약  .summary
    private String context;             // 챔피온 변경사항 이유  .blockquote context
    private List<Ability> abilities;    // 챔피온 변경사항 스킬 리스트  .attribute-change
    private List<LinkGroup> linkGroups; // 신챔일 경우 href 연결 > 상속으로 풀기

    public Champion() {
    }

    public Champion(String name, String image, String summary, String context, List<Ability> abilities, List<LinkGroup> linkGroups) {
        this.name = name;
        this.image = image;
        this.summary = summary;
        this.context = context;
        this.abilities = abilities;
        this.linkGroups = linkGroups;
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

    public List<LinkGroup> getLinkGroups() {
        return linkGroups;
    }

    public Champion name(String name) {
        this.name = name;
        return this;
    }

    public Champion image(String image) {
        this.image = image;
        return this;
    }

    public Champion summary(String summary) {
        this.summary = summary;
        return this;
    }

    public Champion context(String context) {
        this.context = context;
        return this;
    }

    public Champion abilities(List<Ability> abilities) {
        this.abilities = abilities;
        return this;
    }

    public Champion linkGroups(List<LinkGroup> linkGroups) {
        this.linkGroups = linkGroups;
        return this;
    }

    public Champion build() {

        System.out.println("name: " + name);
        System.out.println("image: " + image);
        System.out.println("summary: " + summary);
        System.out.println("context: " + context);
        System.out.println();

        return new Champion(this.name, this.image, this.summary, this.context, this.abilities, this.linkGroups);
    }
}
