package com.ccs.professorlol.ddragon.dto.champion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class DdragonChampionSimplesDto {
    private String type;
    private String format;
    private String version;
    @JsonProperty("data")
    private List<DdragonChampionStandAloneDto> champions;

    @Builder(builderMethodName = "testBuilder")
    private DdragonChampionSimplesDto(String type, String format, String version, List<DdragonChampionStandAloneDto> champions) {
        this.type = type;
        this.format = format;
        this.version = version;
        this.champions = champions;
    }

    public void setChampions(JsonNode jsonNode) {
        List<String> names = new ArrayList<>();
        jsonNode.fieldNames().forEachRemaining(names::add);

        this.champions = names.stream()
                .map(jsonNode::get)
                .map(this::parseChampion)
                .collect(Collectors.toList());
    }

    private DdragonChampionStandAloneDto parseChampion(JsonNode jsonNode) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(jsonNode.toString(), DdragonChampionStandAloneDto.class);
        } catch (Exception e) {
            throw new RuntimeException("Champion parse error");
        }
    }
}
