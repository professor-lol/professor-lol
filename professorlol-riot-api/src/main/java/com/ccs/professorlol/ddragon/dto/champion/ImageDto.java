package com.ccs.professorlol.ddragon.dto.champion;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ImageDto {
    private int h;
    private int w;
    private int y;
    private int x;
    private String group;
    private String sprite;
    private String full;
}
