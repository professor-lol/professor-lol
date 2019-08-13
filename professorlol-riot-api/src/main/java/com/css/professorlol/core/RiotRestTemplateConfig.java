package com.css.professorlol.core;

import com.css.professorlol.core.interceptor.RiotTokenInterceptor;
import com.css.professorlol.core.properties.RiotURIProperties;
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
@RequiredArgsConstructor
public class RiotRestTemplateConfig {

    private static final String RIOT_HOST_URL = "https://kr.api.riotgames.com";
    private static RestTemplateBuilder defaultRestTemplateBuilder;
    private final RiotURIProperties riotURIProperties;
    private final RiotTokenInterceptor riotTokenInterceptor;

    @PostConstruct
    public void init() {
        log.debug("Riot RestTemplate Configuration init");
        defaultRestTemplateBuilder = new RestTemplateBuilder()
                .additionalInterceptors(riotTokenInterceptor);
    }

    @Profile("dev")
    static class RiotRestTemplate {

        @PostConstruct
        private void init() {
            log.debug("dev RiotRestTemplate init");
        }

        @Bean(name = "summonerRestTemplateBean")
        public RestTemplate getSummonerRestTemplateBean() {
            log.debug("Summoner RestTemplate Bean created");
            Duration READ_TIME = Duration.ofMillis(1000L);
            Duration CONN_TIME = Duration.ofMillis(2000L);
            return defaultRestTemplateBuilder.rootUri(RIOT_HOST_URL)
                    .setConnectTimeout(CONN_TIME)
                    .setReadTimeout(READ_TIME)
                    .build();
        }

        @Bean(name = "leagueRestTemplateBean")
        public RestTemplate getLeagueRestTemplateBean() {
            log.debug("League RestTemplate Bean created");
            Duration READ_TIME = Duration.ofMillis(2000L);
            Duration CONN_TIME = Duration.ofMillis(2000L);

            return defaultRestTemplateBuilder.build();
        }

        @Bean(name = "matchRestTemplateBean")
        public RestTemplate getMatchRestTemplateBean() {
            log.debug("Match RestTemplate Bean created");
            Duration READ_TIME = Duration.ofMillis(2000L);
            Duration CONN_TIME = Duration.ofMillis(2000L);

            return defaultRestTemplateBuilder.build();
        }

    }

    @Profile("test")
    static class RiotRestTemplateTest {

        @PostConstruct
        private void init() {
            log.debug("test RiotRestTemplate init");
        }

        @Bean(name = "summonerRestTemplateBean")
        public RestTemplate getSummonerRestTemplateBean() {
            log.debug("Test Summoner RestTemplate Bean created");
            return defaultRestTemplateBuilder.build();
        }

        @Bean(name = "leagueRestTemplateBean")
        public RestTemplate getLeagueRestTemplateBean() {
            log.debug("Test League RestTemplate Bean created");
            return defaultRestTemplateBuilder.build();
        }

        @Bean(name = "matchRestTemplateBean")
        public RestTemplate getMatchRestTemplateBean() {
            log.debug("Test Match RestTemplate Bean created");
            return defaultRestTemplateBuilder.build();
        }

    }
}
