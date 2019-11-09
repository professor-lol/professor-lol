package com.ccs.professorlol.ddragon.dto.item;

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
public class ItemDataDto {
    private String type;
    private String version;
    @JsonProperty("data")
    private List<ItemDto> items;

    private void setItems(JsonNode data) {
        List<String> itemIds = new ArrayList<>();
        data.fieldNames().forEachRemaining(itemIds::add);
        this.items = itemIds.stream()
                .map(data::get)
                .map(this::parseItem)
                .collect(Collectors.toList());
    }

    private ItemDto parseItem(JsonNode jsonNode) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(jsonNode.toString(), ItemDto.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Item Parse Error");
        }
    }
}
