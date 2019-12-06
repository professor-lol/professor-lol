package com.ccs.professorlol.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class MostChampionAddReqDto {
    private List<Long> championIds;

    @Builder(builderMethodName = "createBuilder")
    public MostChampionAddReqDto(List<Long> championIds) {
        validationSize(championIds);
        this.championIds = championIds;
    }

    public void setChampionIds(List<Long> championIds) {
        validationSize(championIds);
        this.championIds = championIds;
    }

    private void validationSize(List<Long> championIds) {
        if (championIds.size() < 0 || championIds.size() > 3) {
            throw new RuntimeException("Most Champion Select Size Error");
        }
    }
}
