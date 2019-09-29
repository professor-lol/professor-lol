package com.ccs.professorlol.patch;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChangeAbility extends ChampionAbilityHistory {
    private String beforeContent;
    private String afterContent;

    @Builder
    private ChangeAbility(String attribute, SkillType skillType, String beforeContent, String afterContent) {
        super(attribute, skillType);
        this.beforeContent = beforeContent;
        this.afterContent = afterContent;
    }

}
