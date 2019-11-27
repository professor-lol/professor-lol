package com.ccs.professorlol.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class MostChampionAddReqDto {
    private List<String> championNames;

    @Builder(builderMethodName = "createBuilder")
    public MostChampionAddReqDto(List<String> championNames) {
        validationSize(championNames);
        this.championNames = championNames;
    }

    public void setChampionNames(List<String> championNames) {
        validationSize(championNames);
        this.championNames = championNames;
    }

    private void validationSize(List<String> championNames) {
        if (championNames.size() < 0 || championNames.size() > 3) {
            throw new RuntimeException("Most Champion Select Size Error");
        }
    }
}
