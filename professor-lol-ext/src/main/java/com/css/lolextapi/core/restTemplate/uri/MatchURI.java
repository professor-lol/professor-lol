package com.css.lolextapi.core.restTemplate.uri;

import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

import static com.css.lolextapi.core.restTemplate.uri.LolURIInfo.*;

public class MatchURI {

    public static URI getLeagueInfo(String encryptedAccountId) {
        return UriComponentsBuilder.newInstance()
                .scheme(HTTPS)
                .host(HOST)
                .path(MATCH_LIST_BY_ACCOUNT)
                .build()
                .expand(encryptedAccountId)
                .encode()
                .toUri();
    }

}
