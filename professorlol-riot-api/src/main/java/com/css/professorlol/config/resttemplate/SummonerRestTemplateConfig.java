package com.css.professorlol.config.resttemplate;

import com.css.professorlol.config.exception.handler.RiotErrorHandler;
import com.css.professorlol.config.interceptor.RiotTokenInterceptor;
import com.css.professorlol.config.properties.XRiotTokenProperties;
import com.css.professorlol.summoner.SummonerRestTemplate;
import com.css.professorlol.summoner.impl.SummonerRestTemplateImpl;
import com.css.professorlol.summoner.impl.SummonerRestTemplateStubImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.time.Duration;

@Configuration
@Slf4j
public class SummonerRestTemplateConfig {
    private static final String RIOT_HOST_URL = "https://kr.api.riotgames.com";

    @Profile("dev")
    @RequiredArgsConstructor
    @Configuration
    public static class SummonerRestTemplateConfiguration {
        private static final Duration ONE_SEC = Duration.ofMillis(1000);
        private static final Duration TWO_SEC = Duration.ofMillis(2000);

        private final XRiotTokenProperties xRiotTokenProperties;

        private RestTemplateBuilder restTemplateBuilder;

        @PostConstruct
        public void init() {
            log.info("Init SummonerRestTemplateConfiguration for dev");
            RiotErrorHandler riotErrorHandler = new RiotErrorHandler();
            RiotTokenInterceptor riotTokenInterceptor = new RiotTokenInterceptor(xRiotTokenProperties);
            restTemplateBuilder = new RestTemplateBuilder().rootUri(RIOT_HOST_URL)
                    .additionalInterceptors(riotTokenInterceptor)
                    .errorHandler(riotErrorHandler);
        }

        @Bean
        public SummonerRestTemplate summonerRestTemplate() {
            log.info("Summoner RestTemplate Bean created");
            RestTemplate restTemplate = restTemplateBuilder.setConnectTimeout(ONE_SEC)
                    .setReadTimeout(TWO_SEC)
                    .build();
            return new SummonerRestTemplateImpl(restTemplate);
        }
    }

    @Profile("stub")
    @RequiredArgsConstructor
    @Configuration
    public static class SummonerRestTemplateStubConfiguration {
        @Bean
        public RestTemplate restTemplate() {
            RiotErrorHandler riotErrorHandler = new RiotErrorHandler();
            return new RestTemplateBuilder().rootUri(RIOT_HOST_URL)
                    .errorHandler(riotErrorHandler)
                    .build();
        }

        @Bean
        public SummonerRestTemplate summonerRestTemplate() {
            log.info("Summoner RestTemplate Stub Bean created");
            RestTemplate restTemplate = new RestTemplate();
            return new SummonerRestTemplateStubImpl(restTemplate);
        }
    }

}
