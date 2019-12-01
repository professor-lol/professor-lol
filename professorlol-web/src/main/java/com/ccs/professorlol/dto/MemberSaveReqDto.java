package com.ccs.professorlol.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
public class MemberSaveReqDto {

    private String summonerName;
    private List<MostChampionDto> mostChampionDtos = new ArrayList<>();

    @Builder(builderMethodName = "createBuilder")
    public MemberSaveReqDto(String summonerName, List<MostChampionDto> mostChampionDtos) {
        this.summonerName = summonerName;
        this.mostChampionDtos = mostChampionDtos;
    }
}
