package com.css.professorlol.config.resttemplate;

import com.css.professorlol.config.exception.handler.RiotErrorHandler;
import com.css.professorlol.config.interceptor.RiotTokenInterceptor;
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

    @Profile("dev")
    @RequiredArgsConstructor
    @Configuration
    public static class LeagueRestTemplateConfiguration {
        private static final String RIOT_HOST_URL = "https://kr.api.riotgames.com";

        private final Duration ONE_SEC = Duration.ofMillis(1000);
        private final Duration TWO_SEC = Duration.ofMillis(2000);

        private final XRiotTokenProperties xRiotTokenProperties;
        private final RestTemplateBuilder restTemplateBuilder;

        @Bean
        public LeagueRestTemplate leagueRestTemplate() {
            RiotErrorHandler riotErrorHandler = new RiotErrorHandler();
            RiotTokenInterceptor riotTokenInterceptor = new RiotTokenInterceptor(xRiotTokenProperties);
            return new LeagueRestTemplateImpl(this.restTemplateBuilder.setConnectTimeout(ONE_SEC)
                    .setReadTimeout(TWO_SEC)
                    .errorHandler(riotErrorHandler)
                    .additionalInterceptors(riotTokenInterceptor)
                    .rootUri(RIOT_HOST_URL));
        }

    }

    @Profile("stub")
    @RequiredArgsConstructor
    @Configuration
    public static class LeagueRestTemplateStubConfiguration {

        @Bean
        public LeagueRestTemplate leagueRestTemplate() {
            log.info("League RestTemplate Stub Bean created");
            return new LeagueRestTemplateStubImpl();
        }

    }
}