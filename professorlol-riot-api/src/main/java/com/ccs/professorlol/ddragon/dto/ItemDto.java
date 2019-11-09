package com.ccs.professorlol.ddragon.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;

import java.util.List;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemDto {

    private String id;
    //    private Maps maps;
    private List<String> tags;
    private Stats stats;
    private String requiredAlly;
    private String requiredChampion;
    private boolean hideFromAll;
    private boolean inStore;
    private int specialRecipe;
    private List<String> into;
    private List<String> from;
    private boolean consumeOnFull;
    private int depth;
    private int stacks;
    private boolean consumed;
    private String plaintext;
    private String colloq;
    private String description;
    private String group;
    private Gold gold;
    private Rune rune;
    private String name;
    private Image image;

//    @Getter
//    @JsonIgnoreProperties(ignoreUnknown = true)
//    public static class Maps {
//        private boolean a;
//        private boolean b;
//        private boolean c;
//        private boolean d;
//    }

    @Getter
    public static class Image {
        private String full;
        private String sprite;
        private String group;
        private int x;
        private int y;
        private int w;
        private int h;
    }

    @Getter
    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    public static class Stats {
        private int FlatMovementSpeedMod;
        private int PercentSpellVampMod;
        private int PercentLifeStealMod;
        private int rFlatEnergyModPerLevel;
        private int FlatEnergyPoolMod;
        private int rFlatEnergyRegenModPerLevel;
        private int FlatEnergyRegenMod;
        private int rPercentMagicPenetrationModPerLevel;
        private int rPercentMagicPenetrationMod;
        private int rFlatMagicPenetrationModPerLevel;
        private int rFlatMagicPenetrationMod;
        private int rFlatGoldPer10Mod;
        private int rPercentTimeDeadModPerLevel;
        private int rPercentTimeDeadMod;
        private int rFlatTimeDeadModPerLevel;
        private int rFlatTimeDeadMod;
        private int rPercentCooldownModPerLevel;
        private int rPercentCooldownMod;
        private int PercentEXPBonus;
        private int FlatEXPBonus;
        private int PercentSpellBlockMod;
        private int rFlatSpellBlockModPerLevel;
        private int FlatSpellBlockMod;
        private int PercentBlockMod;
        private int FlatBlockMod;
        private int PercentCritDamageMod;
        private int rFlatCritDamageModPerLevel;
        private int FlatCritDamageMod;
        private int PercentCritChanceMod;
        private int rFlatCritChanceModPerLevel;
        private int FlatCritChanceMod;
        private int PercentDodgeMod;
        private int rFlatDodgeModPerLevel;
        private int rFlatDodgeMod;
        private int rPercentAttackSpeedModPerLevel;
        private int PercentAttackSpeedMod;
        private int FlatAttackSpeedMod;
        private int rPercentMovementSpeedModPerLevel;
        private int PercentMovementSpeedMod;
        private int rFlatMovementSpeedModPerLevel;
        private int PercentMagicDamageMod;
        private int rFlatMagicDamageModPerLevel;
        private int FlatMagicDamageMod;
        private int PercentPhysicalDamageMod;
        private int rFlatPhysicalDamageModPerLevel;
        private int FlatPhysicalDamageMod;
        private int rPercentArmorPenetrationModPerLevel;
        private int rPercentArmorPenetrationMod;
        private int rFlatArmorPenetrationModPerLevel;
        private int rFlatArmorPenetrationMod;
        private int PercentArmorMod;
        private int rFlatArmorModPerLevel;
        private int FlatArmorMod;
        private int PercentMPRegenMod;
        private int rFlatMPRegenModPerLevel;
        private int FlatMPRegenMod;
        private int PercentHPRegenMod;
        private int rFlatHPRegenModPerLevel;
        private int FlatHPRegenMod;
        private int PercentMPPoolMod;
        private int PercentHPPoolMod;
        private int rFlatMPModPerLevel;
        private int FlatMPPoolMod;
        private int rFlatHPModPerLevel;
        private int FlatHPPoolMod;
    }

    @Getter
    public static class Gold {
        private boolean purchasable;
        private int sell;
        private int total;
        private int base;
    }

    @Getter
    public static class Rune {
        private String type;
        private int tier;
        private boolean isrune;
    }
}
