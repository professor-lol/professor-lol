package com.css.riotapi.match.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.Map;
import java.util.Set;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MatchQueryParam {

    private Set<Integer> queue;
    private Set<Integer> season;
    private Integer endIndex;
    private Integer startIndex;

    public Map getQueryParam() {
        MultiValueMap<String, Object> queryParam = new LinkedMultiValueMap<>();
        if (!queue.isEmpty()) {
            queryParam.add("queue", queue);
        }
        if (!season.isEmpty()) {
            queryParam.add("season", season);
        }
        if (endIndex != null) {
            queryParam.add("endIndex", endIndex);
        }
        if (startIndex != null) {
            queryParam.add("endIndex", startIndex);
        }
        return queryParam;
    }

    @Builder(builderMethodName = "testBuilder")
    private MatchQueryParam(Set<Integer> queue, Set<Integer> season, Integer endIndex, Integer startIndex) {
        this.queue = queue;
        this.season = season;
        this.endIndex = endIndex;
        this.startIndex = startIndex;
    }
}
