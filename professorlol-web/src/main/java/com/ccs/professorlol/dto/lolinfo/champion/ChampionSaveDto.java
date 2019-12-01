package com.ccs.professorlol.dto.lolinfo.champion;

import com.ccs.professorlol.ddragon.dto.champion.DdragonChampionStandAloneDto;
import com.ccs.professorlol.lolInfo.champion.Champion;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChampionSaveDto {
    @NonNull
    private String riotId;
    @NonNull
    private String key;
    @NonNull
    private String name;

    @Builder
    public ChampionSaveDto(String riotId, String key, String name) {
        this.riotId = riotId;
        this.key = key;
        this.name = name;
    }

    public static Champion makeChampion(DdragonChampionStandAloneDto championDto) {
        return ChampionSaveDto.builder()
                .riotId(championDto.getId())
                .key(championDto.getKey())
                .name(championDto.getName())
                .build()
                .toEntity();
    }

    public Champion toEntity() {
        return Champion.builder()
                .name(this.name)
                .key(this.key)
                .riotId(this.riotId)
                .build();
    }
}
