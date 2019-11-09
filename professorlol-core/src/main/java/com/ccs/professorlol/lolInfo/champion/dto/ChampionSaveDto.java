package com.ccs.professorlol.lolInfo.champion.dto;

import com.ccs.professorlol.lolInfo.champion.Champion;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChampionSaveDto {
    private String id;
    private String key;
    private String name;

    @Builder
    public ChampionSaveDto(String id, String key, String name) {
        this.id = id;
        this.key = key;
        this.name = name;
    }

    public Champion toEntity() {
        return Champion.builder()
                .name(this.name)
                .key(this.key)
                .riotId(this.id)
                .build();
    }
}
