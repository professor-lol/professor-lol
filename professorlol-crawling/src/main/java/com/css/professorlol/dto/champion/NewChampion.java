package com.css.professorlol.dto.champion;

import com.css.professorlol.dto.champion.ability.Ability;

import java.util.List;

public class NewChampion extends Champion {

    private List<LinkGroup> linkGroups; // 신챔일 경우 href 연결 > 상속으로 풀기

    public NewChampion(String name, String image, String summary, String context, List<Ability> abilities, List<LinkGroup> linkGroups) {
        super(name, image, summary, context, abilities);
        this.linkGroups = linkGroups;
    }


}
