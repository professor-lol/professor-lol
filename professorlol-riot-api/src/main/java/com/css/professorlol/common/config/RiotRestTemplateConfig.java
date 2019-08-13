package com.css.professorlol.common.config;

import com.css.professorlol.common.interceptor.RiotTokenInterceptor;
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
    private static Duration ONE_SEC = Duration.ofMillis(1000L);
    private static Duration TWO_SEC = Duration.ofMillis(2000L);

    private static RestTemplateBuilder defaultRestTemplateBuilder;
    private final RiotTokenInterceptor riotTokenInterceptor;

    @PostConstruct
    public void init() {
        log.info("Riot RestTemplate Configuration init");
        defaultRestTemplateBuilder = new RestTemplateBuilder()
                .additionalInterceptors(riotTokenInterceptor)
                .rootUri(RIOT_HOST_URL);
    }

    @Profile("dev")
    @Configuration
    static class RiotRestTemplate {

        @PostConstruct
        private void init() {
            log.info("dev profile RiotRestTemplate init");
        }

        @Bean(name = "summonerRestTemplateBean")
        public RestTemplate getSummonerRestTemplateBean() {
            log.info("Summoner RestTemplate Bean created");
            return defaultRestTemplateBuilder.setConnectTimeout(ONE_SEC)
                    .setReadTimeout(TWO_SEC)
                    .build();
        }

        @Bean(name = "leagueRestTemplateBean")
        public RestTemplate getLeagueRestTemplateBean() {
            log.info("League RestTemplate Bean created");
            return defaultRestTemplateBuilder.setConnectTimeout(ONE_SEC)
                    .setReadTimeout(TWO_SEC)
                    .build();
        }

        @Bean(name = "matchRestTemplateBean")
        public RestTemplate getMatchRestTemplateBean() {
            log.info("Match RestTemplate Bean created");
            return defaultRestTemplateBuilder.setConnectTimeout(ONE_SEC)
                    .setReadTimeout(TWO_SEC)
                    .build();
        }

        @Bean(name = "thirdPartyRestTemplateBean")
        public RestTemplate getThirdPartyRestTemplateBean() {
            log.info("ThirdParty RestTemplate Bean created");
            return defaultRestTemplateBuilder.setConnectTimeout(ONE_SEC)
                    .setReadTimeout(TWO_SEC)
                    .build();
        }

    }

    @Profile("test")
    @Configuration
    static class RiotRestTemplateTest {

        @PostConstruct
        private void init() {
            log.info("test profile RiotRestTemplate init");
        }

        @Bean(name = "summonerRestTemplateBean")
        public RestTemplate getSummonerRestTemplateBean() {
            log.info("Test Summoner RestTemplate Bean created");
            return defaultRestTemplateBuilder.build();
        }

        @Bean(name = "leagueRestTemplateBean")
        public RestTemplate getLeagueRestTemplateBean() {
            log.info("Test League RestTemplate Bean created");
            return defaultRestTemplateBuilder.build();
        }

        @Bean(name = "matchRestTemplateBean")
        public RestTemplate getMatchRestTemplateBean() {
            log.info("Test Match RestTemplate Bean created");
            return defaultRestTemplateBuilder.build();
        }

        @Bean(name = "thirdPartyRestTemplateBean")
        public RestTemplate getThirdPartyRestTemplateBean() {
            log.info("Test ThirdParty RestTemplate Bean created");
            return defaultRestTemplateBuilder.build();
        }

    }
}
