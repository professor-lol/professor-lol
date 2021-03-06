package com.ccs.professorlol.patch.champion;


import com.ccs.professorlol.lolInfo.LolInfo;
import com.ccs.professorlol.lolInfo.champion.Champion;
import com.ccs.professorlol.patch.skill.ChampionAbilityHistory;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@DiscriminatorValue("CHAMPION")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChampionPatchHistory extends PatchHistory {
    private String championName;
    private String summary;
    private String context;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "championPatchHistory")
    private List<ChampionAbilityHistory> championAbilityHistories;

    @Builder
    private ChampionPatchHistory(Champion champion, String patchVersion, String championName, String summary, String context, List<ChampionAbilityHistory> championAbilityHistories) {
        super(champion, patchVersion);
        this.championName = championName;
        this.summary = summary;
        this.context = context;
        this.championAbilityHistories = championAbilityHistories;
        championAbilityHistories.forEach(championAbilityHistory -> championAbilityHistory.setChampionPatchHistory(this));
    }

}
