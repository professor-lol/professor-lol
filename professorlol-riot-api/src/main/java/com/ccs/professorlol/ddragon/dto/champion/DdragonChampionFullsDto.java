package com.ccs.professorlol.ddragon.dto.champion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class DdragonChampionFullsDto {
    private String type;
    private String format;
    private String version;
    @JsonProperty("data")
    private List<DdragonChampionDto> championFullDtos;

    @Builder(builderMethodName = "testBuilder")
    private DdragonChampionFullsDto(String type, String format, String version, List<DdragonChampionDto> championDtos) {
        this.type = type;
        this.format = format;
        this.version = version;
        this.championFullDtos = championDtos;
    }

    public void setChampionFullDtos(JsonNode data) {
        List<String> names = new ArrayList<>();
        data.fieldNames().forEachRemaining(names::add);

        this.championFullDtos = names.stream()
                .map(data::get)
                .map(this::parseChampion)
                .collect(Collectors.toList());
    }

    private DdragonChampionDto parseChampion(JsonNode jsonNode) {
        try {
            ((ObjectNode) jsonNode).put("version", this.version);
            return new ObjectMapper().readValue(jsonNode.toString(), DdragonChampionDto.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Champion parse error");
        }
    }
}
