package com.ccs.professorlol.patch.skill;


import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RemoveAbility extends ChampionAbilityHistory {
    private String removeContent;       // 변경 후 능력 셋 .attribute-content

    @Builder
    private RemoveAbility(String attribute, SkillType skillType, String removeContent) {
        super(attribute, skillType);
        this.removeContent = removeContent;
    }
}
