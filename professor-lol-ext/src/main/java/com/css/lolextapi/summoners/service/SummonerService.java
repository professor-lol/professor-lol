package com.css.lolextapi.summoners.service;

import com.css.lolextapi.core.restTemplate.LolHeader;
import com.css.lolextapi.core.restTemplate.uri.SummonerURI;
import com.css.lolextapi.summoners.dto.SummonerDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
@Slf4j
@RequiredArgsConstructor
public class SummonerService {

    private final RestTemplate restTemplate;

    public ResponseEntity<SummonerDto> getSummonerInfo(String summonerName) {
        URI summonerUri = SummonerURI.getSummonerInfoByName(summonerName);
        HttpHeaders lolHeader = LolHeader.getLolHeader();
        HttpEntity httpEntity = new HttpEntity(lolHeader);

        return restTemplate.exchange(summonerUri, HttpMethod.GET, httpEntity, SummonerDto.class);
    }

}
