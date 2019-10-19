package com.ccs.professorlol.patch.champion;


import com.ccs.professorlol.lolInfo.domain.LolInfo;
import com.ccs.professorlol.patch.skill.ChampionAbilityHistory;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.stream.Collectors;

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
    private ChampionPatchHistory(LolInfo lolInfo, String patchVersion, String championName, String summary, String context, List<ChampionAbilityHistory> championAbilityHistories) {
        super(lolInfo, patchVersion);
        this.championName = championName;
        this.summary = summary;
        this.context = context;
        this.championAbilityHistories = championAbilityHistories.stream()
                .map(championAbilityHistory -> {
                    championAbilityHistory.setChampionPatchHistory(this);
                    return championAbilityHistory;
                })
                .collect(Collectors.toList());
    }

}
