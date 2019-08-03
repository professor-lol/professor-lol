package com.css.lolextapi.match.service;

import com.css.lolextapi.core.restTemplate.LolHeader;
import com.css.lolextapi.core.restTemplate.uri.MatchURI;
import com.css.lolextapi.match.dto.MatchlistDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
@RequiredArgsConstructor
public class MatchService {

    private final RestTemplate restTemplate;

    public ResponseEntity<MatchlistDto> getMatchlistInfo(String encryptedAccountId) {
        URI matchlistUri = MatchURI.getLeagueInfo(encryptedAccountId);
        HttpHeaders httpHeaders = LolHeader.getLolHeader();
        HttpEntity httpEntity = new HttpEntity(httpHeaders);
        return restTemplate.exchange(matchlistUri, HttpMethod.GET, httpEntity, MatchlistDto.class);

    }
}
