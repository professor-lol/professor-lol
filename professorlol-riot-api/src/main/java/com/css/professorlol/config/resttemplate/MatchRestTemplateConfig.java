package com.css.professorlol.config.resttemplate;

import com.css.professorlol.config.RiotRestTemplateBuilder;
import com.css.professorlol.config.properties.XRiotTokenProperties;
import com.css.professorlol.match.MatchRestTemplate;
import com.css.professorlol.match.impl.MatchRestTemplateImpl;
import com.css.professorlol.match.impl.MatchRestTemplateStubImpl;
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

    @Profile("dev")
    @Configuration
    @RequiredArgsConstructor
    public static class MatchRestTemplateConfiguration {

        private final Duration ONE_SEC = Duration.ofMillis(1000);
        private final Duration TWO_SEC = Duration.ofMillis(2000);

        private final XRiotTokenProperties xRiotTokenProperties;
        private final RestTemplateBuilder restTemplateBuilder;

        @Bean
        public MatchRestTemplate matchRestTemplate() {
            log.info("Match RestTemplate Bean created");
            RestTemplateBuilder restTemplateBuilder = RiotRestTemplateBuilder.get(this.restTemplateBuilder, this.xRiotTokenProperties);
            return new MatchRestTemplateImpl(restTemplateBuilder.setConnectTimeout(ONE_SEC)
                    .setReadTimeout(TWO_SEC));
        }

    }

    @Profile("stub")
    @Configuration
    @RequiredArgsConstructor
    public static class MatchRestTemplateStubConfiguration {

        @Bean
        public MatchRestTemplate matchRestTemplate() {
            log.info("Match RestTemplate Stub Bean created");
            return new MatchRestTemplateStubImpl();
        }

    }

}