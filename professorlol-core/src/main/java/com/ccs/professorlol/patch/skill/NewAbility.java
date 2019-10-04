package com.ccs.professorlol.patch.skill;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@DiscriminatorValue("2")
public class NewAbility extends ChampionAbilityHistory {
    private String newContent;       // 변경 후 능력 셋 .attribute-content

    @Builder
    private NewAbility(String attribute, SkillType skillType, String newContent) {
        super(attribute, skillType);
        this.newContent = newContent;
    }
}
