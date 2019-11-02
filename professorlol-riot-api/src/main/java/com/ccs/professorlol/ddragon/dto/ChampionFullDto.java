package com.ccs.professorlol.ddragon.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;

import java.util.List;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChampionFullDto {

    private Passive passive;
    //@JsonProperty("spells")
    private List<Spell> spells;
    private Stats stats;
    private Info info;
    private String partype;
    private List<String> tags;
    private List<String> enemytips;
    private List<String> allytips;
    private String blurb;
    private String lore;
    private Image image;
    private String title;
    private String name;
    private String key;
    private String id;

    /*public void setSpells(JsonNode spells) {
        List<String> spellNames = new ArrayList<>();
        spells.fieldNames().forEachRemaining(spellNames::add);

        this.spells = spellNames.stream()
                .map(spells::get)
                .map(this::parseSpell)
                .collect(Collectors.toList());
    }*/

    public Spell parseSpell(JsonNode jsonNode) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(jsonNode.toString(), Spell.class);
        } catch (Exception e) {
            throw new RuntimeException("Spell parse error");
        }
    }

    @Getter
    public static class Passive {
        private Image image;
        private String description;
        private String name;
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
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Spell {
        private String resource;
        private Image image;
        private String costType;
        private String costBurn;
        private int maxrank;
        private String tooltip;
        private String description;
        private String name;
        private String id;
    }

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
        private double hpregenperlevel;
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
    public static class Info {
        private int difficulty;
        private int magic;
        private int defense;
        private int attack;
    }
}
