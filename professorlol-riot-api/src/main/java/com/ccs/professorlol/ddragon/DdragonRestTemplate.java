package com.ccs.professorlol.ddragon;

import com.ccs.professorlol.ddragon.dto.ChampionDataDto;
import com.ccs.professorlol.ddragon.dto.RealmsDto;
import com.google.gson.JsonObject;

public interface DdragonRestTemplate {
    //ddragon의 버전정보
    RealmsDto getCurrentRealms(String language);

    ChampionDataDto getChampions(String version, String language);

    JsonObject getIndividualChampion(String version, String language, String championName);
}
