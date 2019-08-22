package com.css.professorlol.config.resttemplate;

import com.css.professorlol.config.exception.handler.RiotErrorHandler;
import com.css.professorlol.config.interceptor.RiotTokenInterceptor;
import com.css.professorlol.config.properties.XRiotTokenProperties;
import com.css.professorlol.match.MatchRestTemplate;
import com.css.professorlol.match.impl.MatchRestTemplateImpl;
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
    public class MatchRestTemplateConfiguration {
        private static final String RIOT_HOST_URL = "https://kr.api.riotgames.com";

        private final Duration ONE_SEC = Duration.ofMillis(1000);
        private final Duration TWO_SEC = Duration.ofMillis(2000);

        private final XRiotTokenProperties xRiotTokenProperties;

        private final RestTemplateBuilder restTemplateBuilder;

        @Bean
        public MatchRestTemplate matchRestTemplate() {
            log.info("Match RestTemplate Bean created");
            RiotErrorHandler riotErrorHandler = new RiotErrorHandler();
            RiotTokenInterceptor riotTokenInterceptor = new RiotTokenInterceptor(xRiotTokenProperties);
            return new MatchRestTemplateImpl(restTemplateBuilder.rootUri(RIOT_HOST_URL)
                    .additionalInterceptors(riotTokenInterceptor)
                    .errorHandler(riotErrorHandler).setConnectTimeout(ONE_SEC)
                    .setReadTimeout(TWO_SEC));
        }
    }

    //TODO : make stub bean

}