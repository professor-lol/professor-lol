package com.ccs.professorlol.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.util.List;

@NoArgsConstructor
@Getter
public class MemberSaveReqDto {

    private String summonerName;
    private List<MostChampionDto> mostChampionDtos;

    @Builder(builderMethodName = "createBuilder")

    public MemberSaveReqDto(String summonerName, List<MostChampionDto> mostChampionDtos) {
        this.summonerName = summonerName;
        this.mostChampionDtos = mostChampionDtos;
    }
}
