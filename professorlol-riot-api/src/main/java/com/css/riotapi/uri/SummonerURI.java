package com.css.riotapi.uri;

import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

import static com.css.riotapi.uri.LolURIInfo.*;

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
