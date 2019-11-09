package com.ccs.professorlol.ddragon.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Getter;


@Getter
public class RealmsDto {

    @JsonAlias("n")
    private LoLDataVersion lolDataVersion; // 데이터 버전 가지고있는 Class, 실제로 쓰이는 항목
    private String v;
    private String l; // 언어 코드
    private String cdn; // 정적리소스 버전
    private String dd; //Ddragon 버전
    private String lg;
    private String css;
    private int profileiconmax;
    private String store;

    public String getItemVersion() {
        return this.lolDataVersion.getItem();
    }

    public String getChampionVersion() {
        return this.lolDataVersion.getChampion();
    }

    @Getter
    public static class LoLDataVersion {
        private String item; //item 버전
        private String rune; //rune 버전
        private String mastery; //master 버전
        private String champion; //챔피언 버전
        private String profileicon; //profileicon 버전
        private String map; //map 버전
        private String langauage; //language 버전
        private String sticker; //sticker 버전
    }
}
