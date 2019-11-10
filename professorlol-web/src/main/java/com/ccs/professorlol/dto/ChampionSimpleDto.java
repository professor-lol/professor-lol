package com.ccs.professorlol.dto;

import com.ccs.professorlol.lolInfo.champion.Champion;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class ChampionSimpleDto {
    private Long id;

    private String riotId;
    private Integer key;
    private String name;
    private String image;

    public ChampionSimpleDto(Champion champion) {
        this.id = champion.getId();
        this.riotId = champion.getRiotId();
        this.key = champion.getKey();
        this.name = champion.getName();
        this.image = "http://ddragon.leagueoflegends.com/cdn/9.22.1/img/champion/Yuumi.png";
    }
}
