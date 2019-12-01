package com.ccs.professorlol.dto.lolinfo.champion;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.annotation.Nonnull;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChampionUpdateDto {

    @Nonnull
    private Long id;
    private String riotId;
    private String key;
    private String name;

    @Builder
    public ChampionUpdateDto(@Nonnull Long id, String riotId, String key, String name) {
        this.id = id;
        this.riotId = riotId;
        this.key = key;
        this.name = name;
    }
}
