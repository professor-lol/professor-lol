package com.css.lolextapi.core.restTemplate;

import org.springframework.http.HttpHeaders;

public class LolHeader {

    private static final String X_RIOT_TOKEN = "X-Riot-Token";

    public static HttpHeaders getLolHeader() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add(X_RIOT_TOKEN, "RGAPI-f30bd681-2568-44c5-b4b7-9bb7746242ec");
        return httpHeaders;
    }
}