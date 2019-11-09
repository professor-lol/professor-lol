package com.ccs.professorlol.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@Getter
public class MemberSaveReqDto {
    @NotBlank
    private String summonerName;

    @Builder(builderMethodName = "createBuilder")
    public MemberSaveReqDto(@NotBlank String summonerName) {
        this.summonerName = summonerName;
    }
}
