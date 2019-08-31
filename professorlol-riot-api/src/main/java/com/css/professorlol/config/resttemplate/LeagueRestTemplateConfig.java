package com.css.professorlol.config.resttemplate;

import com.css.professorlol.config.properties.RiotProperties;
import com.css.professorlol.league.LeagueRestTemplate;
import com.css.professorlol.league.impl.LeagueRestTemplateImpl;
import com.css.professorlol.league.impl.LeagueRestTemplateStubImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Duration;

@Configuration
@Slf4j
public class LeagueRestTemplateConfig {

    @Profile({"major"})
    @RequiredArgsConstructor
    @Configuration
    public static class MajorLeagueConfig {

        private static final Duration ONE_SEC = Duration.ofMillis(1000);
        private static final Duration TWO_SEC = Duration.ofMillis(2000);

        private final RiotProperties riotProperties;
        private final RestTemplateBuilder restTemplateBuilder;

        @Bean
        public LeagueRestTemplate leagueRestTemplate() {
            log.debug("League RestTemplate Builder created");
            RestTemplateBuilder restTemplateBuilder = RiotRestTemplateBuilder.get(this.restTemplateBuilder, this.riotProperties);
            return new LeagueRestTemplateImpl(restTemplateBuilder.setConnectTimeout(ONE_SEC)
                    .setReadTimeout(TWO_SEC)
                    .build());
        }

    }

    @Profile({"local", "test"})
    @RequiredArgsConstructor
    @Configuration
    public static class LocalLeagueConfig {

        @Bean
        public LeagueRestTemplate leagueRestTemplate() {
            log.debug("League RestTemplate Stub Bean created");
            return new LeagueRestTemplateStubImpl();
        }

    }
}