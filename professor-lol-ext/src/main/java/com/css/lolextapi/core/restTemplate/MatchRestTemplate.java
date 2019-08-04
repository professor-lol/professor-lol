//package com.css.lolextapi.core.restTemplate;
//
//import com.css.lolextapi.match.dto.MatchlistDto;
//import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
//import org.springframework.web.client.RestTemplate;
//
//public class MatchRestTemplate {
//
//    private RestTemplate restTemplate;
//
//    public MatchRestTemplate(HttpComponentsClientHttpRequestFactory factory) {
//        this.restTemplate = new RestTemplate(factory);
//    }
//
//    public MatchlistDto get(String name){
//        return restTemplate.getForObject(name);
//    }
//}
