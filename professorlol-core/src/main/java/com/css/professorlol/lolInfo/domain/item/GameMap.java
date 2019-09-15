package com.css.professorlol.lolInfo.domain.item;

import lombok.Getter;

/**
 *
 */
@Getter
public enum GameMap {
    TWISTED_TREELINE(10, "뒤틀린 숲"),
    SUMMONERS_RIFT(11, "소환사의 협곡"),
    HOWLING_ABYSS(12, "칼바람 나락"),
    TEAM_FIGHT_TACTICS(22, "전략적 팀 전투");

    private Integer id;
    private String name;

    GameMap(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

}