package com.css.professorlol.config.resttemplate;

import com.css.professorlol.config.RiotRestTemplateBuilder;
import com.css.professorlol.config.properties.XRiotTokenProperties;
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

        private final Duration ONE_SEC = Duration.ofMillis(1000);
        private final Duration TWO_SEC = Duration.ofMillis(2000);

        private final XRiotTokenProperties xRiotTokenProperties;
        private final RestTemplateBuilder restTemplateBuilder;

        @Bean
        public LeagueRestTemplate leagueRestTemplate() {
            log.debug("League RestTemplate Builder created");
            RestTemplateBuilder restTemplateBuilder = RiotRestTemplateBuilder.get(this.restTemplateBuilder, this.xRiotTokenProperties);
            return new LeagueRestTemplateImpl(restTemplateBuilder.setConnectTimeout(ONE_SEC)
                    .setReadTimeout(TWO_SEC));
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