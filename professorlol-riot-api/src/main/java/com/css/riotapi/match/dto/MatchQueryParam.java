package com.css.riotapi.match.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Optional;

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

    public MultiValueMap<String, String> getQueryParam() {
        MultiValueMap<String, String> queryParam = new LinkedMultiValueMap<>();
        addQueryParam(queryParam, QUEUE, queue);
        addQueryParam(queryParam, SEASON, season);
        addQueryParam(queryParam, BEGIN_INDEX, beginIndex);
        addQueryParam(queryParam, END_INDEX, endIndex);
        return queryParam;
    }

    private void addQueryParam(MultiValueMap<String, String> queryParam, String key, Integer maybeValue) {
        Optional.ofNullable(maybeValue)
                .map(String::valueOf)
                .ifPresent(value -> queryParam.add(key, value));
    }

    public String getOptionalURI() {
        return UriComponentsBuilder.newInstance()
                .queryParams(getQueryParam())
                .build()
                .encode()
                .toUriString();
    }

    @Builder(builderMethodName = "testBuilder")
    private MatchQueryParam(Integer queue, Integer season, Integer endIndex, Integer beginIndex) {
        this.queue = queue;
        this.season = season;
        this.endIndex = endIndex;
        this.beginIndex = beginIndex;
    }
}
