package com.ccs.professorlol.patch;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "ability_type")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class ChampionAbilityHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String attribute;
    private SkillType skillType;

    @ManyToOne
    @JoinColumn(name = "patch_history_id")
    @Setter
    private ChampionPatchHistory championPatchHistory;

    protected ChampionAbilityHistory(String attribute, SkillType skillType) {
        this.attribute = attribute;
        this.skillType = skillType;
    }
}
