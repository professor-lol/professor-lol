package com.ccs.professorlol.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@Getter
public class UserSaveReqDto {
    @NotBlank
    private String lolId;
}
