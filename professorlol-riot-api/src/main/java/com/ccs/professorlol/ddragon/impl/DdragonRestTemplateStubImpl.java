package com.ccs.professorlol.ddragon.impl;

import com.ccs.professorlol.ddragon.DdragonRestTemplate;
import com.ccs.professorlol.ddragon.dto.RealmsDto;
import com.ccs.professorlol.ddragon.dto.champion.DdragonChampionDto;
import com.ccs.professorlol.ddragon.dto.champion.DdragonChampionFullsDto;
import com.ccs.professorlol.ddragon.dto.champion.DdragonChampionSimplesDto;
import com.ccs.professorlol.ddragon.dto.item.ItemDataDto;
import lombok.RequiredArgsConstructor;

//TODO : 이민형 작성 해주세요.
@RequiredArgsConstructor
public class DdragonRestTemplateStubImpl implements DdragonRestTemplate {

    @Override
    public RealmsDto getCurrentRealms() {
        return null;
    }

    @Override
    public DdragonChampionSimplesDto getChampionSimples(String version) {
        return null;
    }

    @Override
    public DdragonChampionFullsDto getChampionFulls(String version) {
        return null;
    }

    @Override
    public DdragonChampionDto getIndividualChampion(String version, String championName) {
        return null;
    }

    @Override
    public ItemDataDto getItems(String version) {
        return null;
    }
}
