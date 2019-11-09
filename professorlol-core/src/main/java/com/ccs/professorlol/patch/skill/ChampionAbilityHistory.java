package com.ccs.professorlol.patch.skill;


import com.ccs.professorlol.patch.champion.ChampionPatchHistory;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChampionAbilityHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private SkillType skillType;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "championAbilityHistory")
    private List<ChampionAttributeHistory> championAttributeHistories;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "patch_history_id")
    @Setter
    private ChampionPatchHistory championPatchHistory;

    @Builder
    private ChampionAbilityHistory(String title, String image, SkillType skillType, List<ChampionAttributeHistory> championAttributeHistories, ChampionPatchHistory championPatchHistory) {
        this.title = title;
        this.image = image;
        this.skillType = skillType;
        this.championAttributeHistories = championAttributeHistories;
        this.championPatchHistory = championPatchHistory;
        this.championAttributeHistories.forEach(championAttributeHistory -> championAttributeHistory.setChampionAbilityHistory(this));
    }
}
