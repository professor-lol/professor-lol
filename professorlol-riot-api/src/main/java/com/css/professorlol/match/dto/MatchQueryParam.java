package com.css.professorlol.match.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MatchQueryParam {
    private static final String QUEUE = "queue";
    private static final String SEASON = "season";
    private static final String BEGIN_INDEX = "beginIndex";
    private static final String END_INDEX = "endIndex";

    private Integer queue;
    private Integer season;
    private Integer endIndex;
    private Integer beginIndex;

    public Map<String, Object> getQueryParam() {
        Map<String, Object> queryParam = new HashMap<>();
        queryParam.put(QUEUE, queue);
        queryParam.put(SEASON, season);
        queryParam.put(END_INDEX, endIndex);
        queryParam.put(BEGIN_INDEX, beginIndex);
        return queryParam;
    }

    @Builder(builderMethodName = "testBuilder")
    private MatchQueryParam(Integer queue, Integer season, Integer endIndex, Integer beginIndex) {
        this.queue = queue;
        this.season = season;
        this.endIndex = endIndex;
        this.beginIndex = beginIndex;
    }
}