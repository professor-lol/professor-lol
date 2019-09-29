package com.css.professorlol;

import com.google.gson.Gson;
import com.google.gson.JsonParser;
import org.springframework.http.HttpStatus;
import org.springframework.util.ResourceUtils;

import java.io.BufferedReader;
import java.io.FileReader;

public class MockResponse {

    public static String getExceptionResponseBody(String message, HttpStatus status) {
        return new JsonParser().parse("{\n" +
                "    \"status\": {\n" +
                "        \"status_code\": " + status.value() + ",\n" +
                "        \"message\": \"" + message + "\"\n" +
                "    }\n" +
                "}").toString();
    }

    public static String getSummonerMockBody() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(ResourceUtils.getFile("classpath:mock/SummonerMockBody.json")));
            Gson gson = new Gson();
            Object json = gson.fromJson(bufferedReader, Object.class);
            return gson.toJson(json);
        } catch (Exception e) {
            throw new RuntimeException("mock error");
        }
    }

    public static String getLeagueMockBody() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(ResourceUtils.getFile("classpath:mock/LeagueMockBody.json")));
            Gson gson = new Gson();
            Object json = gson.fromJson(bufferedReader, Object.class);
            return gson.toJson(json);
        } catch (Exception e) {
            throw new RuntimeException("mock error");
        }
    }

    public static String getMatchListMockBody() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(ResourceUtils.getFile("classpath:mock/MatchListMockBody.json")));
            Gson gson = new Gson();
            Object json = gson.fromJson(bufferedReader, Object.class);
            return gson.toJson(json);
        } catch (Exception e) {
            throw new RuntimeException("mock error");
        }
    }

    public static String getMatchMockBody() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(ResourceUtils.getFile("classpath:mock/MatchMockBody.json")));
            Gson gson = new Gson();
            Object json = gson.fromJson(bufferedReader, Object.class);
            return gson.toJson(json);
        } catch (Exception e) {
            throw new RuntimeException("mock error");
        }
    }

    public static String getChampionsDtoMockBody() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(ResourceUtils.getFile("classpath:mock/ChampionsMockBody.json")));
            Gson gson = new Gson();
            Object json = gson.fromJson(bufferedReader, Object.class);
            return gson.toJson(json);
        } catch (Exception e) {
            throw new RuntimeException("mock error");
        }
    }
}
