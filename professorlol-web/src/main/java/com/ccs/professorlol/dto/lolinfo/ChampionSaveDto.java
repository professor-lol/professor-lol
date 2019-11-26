package com.ccs.professorlol.dto.lolinfo;

import com.ccs.professorlol.ddragon.dto.champion.DdragonChampionStandAloneDto;
import com.ccs.professorlol.lolInfo.champion.Champion;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChampionSaveDto {
    private String riotId;
    private String key;
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
