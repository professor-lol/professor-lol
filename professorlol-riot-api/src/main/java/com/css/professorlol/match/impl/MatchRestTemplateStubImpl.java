package com.css.professorlol.match.impl;

import com.css.professorlol.config.exception.RiotServerException;
import com.css.professorlol.match.MatchRestTemplate;
import com.css.professorlol.match.dto.match.MatchDto;
import com.css.professorlol.match.dto.matchList.MatchQueryParam;
import com.css.professorlol.match.dto.matchList.MatchlistDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.ResourceUtils;

import javax.validation.constraints.NotBlank;
import java.io.BufferedReader;
import java.io.FileReader;

@Slf4j
public class MatchRestTemplateStubImpl implements MatchRestTemplate {

    public MatchRestTemplateStubImpl() {
        log.debug("Stub MatchRestTemplate created.");
    }

    @Override
    public MatchlistDto getMatchList(@NotBlank final String encryptedAccountId, MatchQueryParam queryParam) {
        try {
            return new ObjectMapper().readValue(getMatchListStubBody(), MatchlistDto.class);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public MatchDto getMatchByMatchId(Long matchId) {
        try {
            return new ObjectMapper().readValue(getMatchStubBody(), MatchDto.class);
        } catch (Exception e) {
            throw new RiotServerException("Stub Error.");
        }
    }

    private String getMatchListStubBody() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(ResourceUtils.getFile("classpath:stub/MatchListStubBody.json")));
            Gson gson = new Gson();
            Object json = gson.fromJson(bufferedReader, Object.class);
            return gson.toJson(json);
        } catch (Exception e) {
            throw new RuntimeException("parse error");
        }
    }

    private String getMatchStubBody() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(ResourceUtils.getFile("classpath:stub/MatchStubBody.json")));
            Gson gson = new Gson();
            Object json = gson.fromJson(bufferedReader, Object.class);
            return gson.toJson(json);
        } catch (Exception e) {
            throw new RuntimeException("parse error");
        }
    }
}