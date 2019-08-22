package com.css.professorlol.match.dto.matchList;

import com.css.professorlol.match.domain.Queue;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

/**
 * 솔랭, 자유랭만 (420,440)
 */
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MatchQueryParam {
    private static final String SEASON = "season";
    private static final String END_TIME = "endTime";
    private static final String BEGIN_TIME = "beginTime";
    private static final String END_INDEX = "endIndex";
    private static final String BEGIN_INDEX = "beginIndex";

    private Integer season;
    private Long endTime;
    private Long beginTime;
    private Integer endIndex;
    private Integer beginIndex;

    @Builder(builderMethodName = "testBuilder")
    private MatchQueryParam(Integer season, Integer endIndex, Integer beginIndex, Long endTime, Long beginTime) {
        this.season = season;
        this.endTime = endTime;
        this.beginTime = beginTime;
        this.endIndex = endIndex;
        this.beginIndex = beginIndex;
    }

    public Map<String, Object> getQueryParam() {
        Map<String, Object> queryParam = new HashMap<>();
        queryParam.put(Queue.SOLO.getName(), Queue.SOLO.getValue());
        queryParam.put(Queue.FREE.getName(), Queue.FREE.getValue());
        queryParam.put(SEASON, season);
        queryParam.put(END_TIME, endTime);
        queryParam.put(BEGIN_TIME, beginTime);
        queryParam.put(END_INDEX, endIndex);
        queryParam.put(BEGIN_INDEX, beginIndex);
        return queryParam;
    }
}