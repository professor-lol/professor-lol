package com.ccs.professorlol.ddragon.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChampionFullDataDto {
    private String type;
    private String format;
    private String version;
    @JsonProperty("data")
    private List<ChampionFullDto> championFullDtos;

    public void setChampionFullDtos(JsonNode data) {
        List<String> names = new ArrayList<>();
        data.fieldNames().forEachRemaining(names::add);

        this.championFullDtos = names.stream()
                .map(data::get)
                .map(this::parseChampion)
                .collect(Collectors.toList());
    }

    private ChampionFullDto parseChampion(JsonNode jsonNode) {
        try {
            ((ObjectNode) jsonNode).put("version", this.version);
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(jsonNode.toString(), ChampionFullDto.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Champion parse error");
        }
    }
}
