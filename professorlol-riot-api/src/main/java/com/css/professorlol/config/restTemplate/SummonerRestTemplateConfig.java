package com.css.professorlol.config.restTemplate;

import com.css.professorlol.config.properties.RiotProperties;
import com.css.professorlol.summoner.SummonerRestTemplate;
import com.css.professorlol.summoner.impl.SummonerRestTemplateImpl;
import com.css.professorlol.summoner.impl.SummonerRestTemplateStubImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Duration;

@Configuration
@Slf4j
public class SummonerRestTemplateConfig {

    @Profile("major")
    @RequiredArgsConstructor
    @Configuration
    public static class MajorSummonerConfig {

        private static final Duration ONE_SEC = Duration.ofMillis(1000);
        private static final Duration TWO_SEC = Duration.ofMillis(2000);

        private final RiotProperties riotProperties;
        private final RestTemplateBuilder restTemplateBuilder;

        @Bean
        public SummonerRestTemplate summonerRestTemplate() {
            log.debug("Summoner RestTemplate Bean created");
            RestTemplateBuilder restTemplateBuilder = RiotRestTemplateBuilder.get(this.restTemplateBuilder, this.riotProperties);
            return new SummonerRestTemplateImpl(restTemplateBuilder.setConnectTimeout(ONE_SEC)
                    .setReadTimeout(TWO_SEC)
                    .build());
        }

    }

    @Profile({"local", "test"})
    @RequiredArgsConstructor
    @Configuration
    public static class LocalSummonerConfig {

        @Bean
        public SummonerRestTemplate summonerRestTemplate() {
            log.debug("Summoner RestTemplate Stub Bean created");
            return new SummonerRestTemplateStubImpl();
        }

    }

}