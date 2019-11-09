package com.ccs.professorlol.ddragon.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
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

    @Builder(builderMethodName = "testBuilder")
    private RealmsDto(LoLDataVersion lolDataVersion, String v, String l, String cdn, String dd, String lg, String css, int profileiconmax, String store) {
        this.lolDataVersion = lolDataVersion;
        this.v = v;
        this.l = l;
        this.cdn = cdn;
        this.dd = dd;
        this.lg = lg;
        this.css = css;
        this.profileiconmax = profileiconmax;
        this.store = store;
    }

    public String getItemVersion() {
        return this.lolDataVersion.getItem();
    }

    public String getChampionVersion() {
        return this.lolDataVersion.getChampion();
    }

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class LoLDataVersion {
        private String item; //item 버전
        private String rune; //rune 버전
        private String mastery; //master 버전
        private String champion; //챔피언 버전
        private String profileicon; //profileicon 버전
        private String map; //map 버전
        private String langauage; //language 버전
        private String sticker; //sticker 버전

        @Builder(builderMethodName = "testBuilder")
        private LoLDataVersion(String item, String rune, String mastery, String champion, String profileicon, String map, String langauage, String sticker) {
            this.item = item;
            this.rune = rune;
            this.mastery = mastery;
            this.champion = champion;
            this.profileicon = profileicon;
            this.map = map;
            this.langauage = langauage;
            this.sticker = sticker;
        }
    }
}
