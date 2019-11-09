package com.ccs.professorlol.ddragon.dto.champion;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PassiveDto {
    private ImageDto image;
    private String description;
    private String name;
}
