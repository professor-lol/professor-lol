package com.ccs.professorlol.config.resttemplate;

import com.ccs.professorlol.config.properties.RiotProperties;
import com.ccs.professorlol.match.MatchRestTemplate;
import com.ccs.professorlol.match.impl.MatchRestTemplateImpl;
import com.ccs.professorlol.match.impl.MatchRestTemplateStubImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Duration;

@Configuration
@Slf4j
public class MatchRestTemplateConfig {

    @Profile("major")
    @Configuration
    @RequiredArgsConstructor
    public static class MajorMatchConfig {

        private static final Duration ONE_SEC = Duration.ofMillis(1000);
        private static final Duration TWO_SEC = Duration.ofMillis(2000);

        private final RiotProperties riotProperties;
        private final RestTemplateBuilder restTemplateBuilder;

        @Bean
        public MatchRestTemplate matchRestTemplate() {
            log.debug("Match RestTemplate Bean created");
            RestTemplateBuilder restTemplateBuilder = RiotRestTemplateBuilder.get(this.restTemplateBuilder, this.riotProperties);
            return new MatchRestTemplateImpl(restTemplateBuilder.setConnectTimeout(ONE_SEC)
                    .setReadTimeout(TWO_SEC)
                    .build());
        }

    }

    @Profile({"local", "test"})
    @Configuration
    @RequiredArgsConstructor
    public static class LocalMatchConfig {

        @Bean
        public MatchRestTemplate matchRestTemplate() {
            log.debug("Match RestTemplate Stub Bean created");
            return new MatchRestTemplateStubImpl();
        }

    }

}