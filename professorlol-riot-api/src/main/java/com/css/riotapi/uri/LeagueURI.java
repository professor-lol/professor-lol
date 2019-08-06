package com.css.riotapi.uri;

import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

import static com.css.riotapi.uri.LolURIInfo.*;

public class LeagueURI {

    //네이밍
    public static URI getLeagueInfo(String encryptedSummonerId) {
        return UriComponentsBuilder.newInstance()
                .scheme(HTTPS)
                .host(HOST)
                .path(LEAGUE_ENTRY_BY_SUMMONER)
//                .queryParams()
                .build()
                .expand(encryptedSummonerId)
                .encode()
                .toUri();
    }

}
