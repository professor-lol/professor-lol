package com.css.professorlol.ddragon;

import com.css.professorlol.ddragon.dto.RealmsDto;
import com.google.gson.JsonObject;

public interface DdragonRestTemplate {
    //ddragon의 버전정보
    RealmsDto getCurrentRealms(String language);

    JsonObject getChampions(String version, String language);

    JsonObject getIndividualChampion(String version, String language, String championName);
}
