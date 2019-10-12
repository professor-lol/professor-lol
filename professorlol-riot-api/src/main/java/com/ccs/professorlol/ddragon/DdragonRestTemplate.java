package com.ccs.professorlol.ddragon;

import com.ccs.professorlol.ddragon.dto.ChampionDataDto;
import com.ccs.professorlol.ddragon.dto.ChampionDto;
import com.ccs.professorlol.ddragon.dto.ItemDataDto;
import com.ccs.professorlol.ddragon.dto.RealmsDto;

public interface DdragonRestTemplate {
    //ddragon의 버전정보
    RealmsDto getCurrentRealms();

    ChampionDataDto getChampions(String version);

    ChampionDto getIndividualChampion(String version, String championName);

    ItemDataDto getItems(String version);
}
