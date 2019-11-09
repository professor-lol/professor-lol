package com.ccs.professorlol.ddragon;

import com.ccs.professorlol.ddragon.dto.RealmsDto;
import com.ccs.professorlol.ddragon.dto.champion.DdragonChampionDto;
import com.ccs.professorlol.ddragon.dto.champion.DdragonChampionFullsDto;
import com.ccs.professorlol.ddragon.dto.champion.DdragonChampionSimplesDto;
import com.ccs.professorlol.ddragon.dto.item.ItemDataDto;

public interface DdragonRestTemplate {
    //ddragon의 버전정보
    RealmsDto getCurrentRealms();

    DdragonChampionSimplesDto getChampions(String version);

    DdragonChampionFullsDto getChampionFulls(String version);

    DdragonChampionDto getIndividualChampion(String version, String championName);

    ItemDataDto getItems(String version);
}
