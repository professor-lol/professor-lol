package com.css.lolextapi.league.service;

import com.css.lolextapi.core.restTemplate.LolHeader;
import com.css.lolextapi.core.restTemplate.uri.LeagueURI;
import com.css.lolextapi.league.dto.LeagueEntryDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

import static com.css.lolextapi.core.util.ResponseType.LEAGUE_ENTRY_LIST_TYPE;

@Service
@RequiredArgsConstructor
public class LeagueService {

    private final RestTemplate restTemplate;

    //타임아웃 트라이 캐치
    public ResponseEntity<List<LeagueEntryDto>> getLeagueEntryInfo(String encryptedSummonerId) {
        URI leagueEntryUri = LeagueURI.getLeagueInfo(encryptedSummonerId);
        HttpHeaders lolHeader = LolHeader.getLolHeader();
        HttpEntity httpEntity = new HttpEntity(lolHeader);
        //RestTemplateBuilder  이용하기
        //인터셉터로 헤더넣기
        //익센션 핸들러
        //RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder().additionalInterceptors().errorHandler()
        //@Ignore

        //이너 클래스로 클래스타입 설정
        return restTemplate.exchange(leagueEntryUri, HttpMethod.GET, httpEntity, LEAGUE_ENTRY_LIST_TYPE);
    }

}
