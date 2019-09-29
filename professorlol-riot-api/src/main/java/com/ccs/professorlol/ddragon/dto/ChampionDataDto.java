package com.ccs.professorlol.ddragon.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChampionDataDto {
    private String type;
    private String format;
    private String version;
    @JsonProperty("data")
    private List<ChampionDto> championDtos;

    private void setChampionDtos(JsonNode data) {
        List<String> names = new ArrayList<>();
        data.fieldNames().forEachRemaining(names::add);

        this.championDtos = names.stream()
                .map(data::get)
                .map(this::parseChampion)
                .collect(Collectors.toList());
    }

    private ChampionDto parseChampion(JsonNode jsonNode) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(jsonNode.toString(), ChampionDto.class);
        } catch (Exception e) {
            throw new RuntimeException("Champion parse error");
        }
    }
}
