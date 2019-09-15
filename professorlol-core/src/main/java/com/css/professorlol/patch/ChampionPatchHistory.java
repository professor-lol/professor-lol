package com.css.professorlol.patch;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CHAMPION")
public class ChampionPatchHistory {
    private AbilityType abilityType;
    private String context;

}
