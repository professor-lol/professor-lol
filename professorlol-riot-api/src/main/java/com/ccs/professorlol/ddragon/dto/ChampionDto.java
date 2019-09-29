package com.ccs.professorlol.ddragon.dto;

import lombok.Getter;

import java.util.List;

@Getter
public class ChampionDto {

    private Stats stats;
    private String partype;
    private List<String> tags;
    private Image image;
    private Info info;
    private String blurb;
    private String title;
    private String name;
    private String key;
    private String id;
    private String version;

    @Getter
    public static class Stats {
        private double attackspeed;
        private double attackspeedperlevel;
        private int attackdamageperlevel;
        private int attackdamage;
        private int critperlevel;
        private int crit;
        private int mpregenperlevel;
        private int mpregen;
        private int hpregenperlevel;
        private int hpregen;
        private int attackrange;
        private double spellblockperlevel;
        private double spellblock;
        private double armorperlevel;
        private int armor;
        private int movespeed;
        private int mpperlevel;
        private int mp;
        private int hpperlevel;
        private int hp;
    }

    @Getter
    public static class Image {
        private int h;
        private int w;
        private int y;
        private int x;
        private String group;
        private String sprite;
        private String full;
    }

    @Getter
    public static class Info {
        private int difficulty;
        private int magic;
        private int defense;
        private int attack;
    }
}
