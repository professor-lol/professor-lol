package com.css.professorlol.ddragon.dto;

import lombok.Getter;


@Getter
public class RealmsDto {

    private N n;
    private String v;
    private String l;
    private String cdn;
    private String dd;
    private String lg;
    private String css;
    private int profileiconmax;
    private String store;

    @Getter
    public static class N {
        private String item;
        private String rune;
        private String mastery;
        private String champion;
        private String profileicon;
        private String map;
        private String langauage;
        private String sticker;
    }

}
