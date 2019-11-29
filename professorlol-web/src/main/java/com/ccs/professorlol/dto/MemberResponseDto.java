package com.ccs.professorlol.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberResponseDto {
    private String email;
    private String name;
    private String summonerName;
    private String picture;
    private List<MostChampionDto> mostChampions;

    @Builder(builderMethodName = "createBuilder")
    public MemberResponseDto(String email, String name, String summonerName, String picture, List<MostChampionDto> mostChampions) {
        this.email = email;
        this.name = name;
        this.summonerName = summonerName;
        this.picture = picture;
        this.mostChampions = mostChampions;
    }
}
