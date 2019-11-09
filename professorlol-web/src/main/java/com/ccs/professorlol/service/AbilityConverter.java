package com.ccs.professorlol.service;

import com.ccs.professorlol.dto.champion.ability.Ability;
import com.ccs.professorlol.dto.champion.ability.attribute.Attribute;
import com.ccs.professorlol.patch.skill.ChampionAbilityHistory;
import com.ccs.professorlol.patch.skill.ChampionAttributeHistory;

import java.util.List;
import java.util.stream.Collectors;

public class AbilityConverter {

    public static List<ChampionAbilityHistory> convert(List<Ability> abilities) {
        return abilities.stream()
                .map(AbilityConverter::convert)
                .collect(Collectors.toList());
    }

    private static ChampionAbilityHistory convert(Ability ability) {
        return ChampionAbilityHistory.builder()
                .title(ability.getTitle())
                .image(ability.getImage())
                .championAttributeHistories(ability.getAttributes().stream().map(AbilityConverter::convert).collect(Collectors.toList()))
                .build();
    }

    private static ChampionAttributeHistory convert(Attribute attribute) {
        return ChampionAttributeHistory.builder()
                .beforeContent(attribute.getBeforeContent())
                .attributeType(attribute.getAttributeType())
                .attribute(attribute.getAttribute())
                .afterContent(attribute.getAfterContent())
                .build();
    }
}


