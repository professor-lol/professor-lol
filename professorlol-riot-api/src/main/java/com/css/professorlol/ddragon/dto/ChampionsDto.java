package com.css.professorlol.ddragon.dto;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.Getter;

@Getter
public class ChampionsDto {
    private String type;
    private String format;
    private String version;
    private JsonNode data;
}
