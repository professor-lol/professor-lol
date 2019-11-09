package com.ccs.professorlol.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@Getter
@Setter
public class MemberSaveReqDto {
    @NotBlank
    private String lolId;

    @Builder(builderMethodName = "createBuilder")
    public MemberSaveReqDto(@NotBlank String lolId) {
        this.lolId = lolId;
    }
}
