package com.css.lolextapi.core.restTemplate.uri;

import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

import static com.css.lolextapi.core.restTemplate.uri.LolURIInfo.*;

public class SummonerURI {

    public static URI getSummonerInfoByName(String summonerName) {
        return UriComponentsBuilder.newInstance()
                .scheme(HTTPS)
                .host(HOST)
                .path(SUMMONER_BY_NAME)
                .build()
                .expand(summonerName)
                .encode()
                .toUri();
    }

}
