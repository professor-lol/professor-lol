package com.ccs.professorlol.ddragon;

import com.ccs.professorlol.ddragon.dto.*;

public interface DdragonRestTemplate {
    //ddragon의 버전정보
    RealmsDto getCurrentRealms();

    ChampionDataDto getChampions(String version);

    ChampionFullDataDto getChampionFulls(String version);

    ChampionDto getIndividualChampion(String version, String championName);

    ItemDataDto getItems(String version);
}
