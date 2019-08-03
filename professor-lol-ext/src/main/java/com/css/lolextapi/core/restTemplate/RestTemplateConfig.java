package com.css.lolextapi.core.restTemplate;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
@RequiredArgsConstructor
public class RestTemplateConfig {

    private static final int TIME_OUT = 2000;
    private static final int MAX_CONNECTION_POOL = 100;
    private static final int MAX_CONNECTION_PER = 10;


    @Bean
    public MatchRestTemplate restTemplate() {
        HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
        factory.setReadTimeout(TIME_OUT);
        factory.setConnectTimeout(TIME_OUT);
        CloseableHttpClient httpClient = HttpClientBuilder.create()
                .setMaxConnTotal(MAX_CONNECTION_POOL)
                .setMaxConnPerRoute(MAX_CONNECTION_PER)
                .build();
        factory.setHttpClient(httpClient);
        return new MatchRestTemplate(factory);
    }

}
