package com.ccs.professorlol.patch.skill;


import com.ccs.professorlol.patch.champion.ChampionPatchHistory;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
        discriminatorType = DiscriminatorType.INTEGER,
        name = "ability_type",
        columnDefinition = "TINYINT(1)"
)
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class ChampionAbilityHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String attribute;
    private SkillType skillType;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patch_history_id")
    @Setter
    private ChampionPatchHistory championPatchHistory;

    protected ChampionAbilityHistory(String attribute, SkillType skillType) {
        this.attribute = attribute;
        this.skillType = skillType;
    }
}
