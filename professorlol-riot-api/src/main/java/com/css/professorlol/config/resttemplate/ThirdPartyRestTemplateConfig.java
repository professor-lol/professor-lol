package com.css.professorlol.config.resttemplate;

import com.css.professorlol.config.exception.handler.RiotErrorHandler;
import com.css.professorlol.config.interceptor.RiotTokenInterceptor;
import com.css.professorlol.config.properties.XRiotTokenProperties;
import com.css.professorlol.third.ThirdPartyRestTemplate;
import com.css.professorlol.third.impl.ThirdPartyRestTemplateImpl;
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
public class ThirdPartyRestTemplateConfig {
    private static final String RIOT_HOST_URL = "https://kr.api.riotgames.com";

    @Profile("dev")
    @RequiredArgsConstructor
    public class ThirdPartyRestTemplateConfiguration {
        private final Duration ONE_SEC = Duration.ofMillis(1000);
        private final Duration TWO_SEC = Duration.ofMillis(2000);

        private final XRiotTokenProperties xRiotTokenProperties;

        private RestTemplateBuilder restTemplateBuilder;

        @PostConstruct
        public void init() {
            log.info("Init ThirdPartyRestTemplateConfiguration for dev");
            RiotErrorHandler riotErrorHandler = new RiotErrorHandler();
            RiotTokenInterceptor riotTokenInterceptor = new RiotTokenInterceptor(xRiotTokenProperties);
            restTemplateBuilder = new RestTemplateBuilder().rootUri(RIOT_HOST_URL)
                    .additionalInterceptors(riotTokenInterceptor)
                    .errorHandler(riotErrorHandler);
        }

        @Bean
        public ThirdPartyRestTemplate thirdPartyRestTemplate() {
            log.info("ThirdParty RestTemplate Bean created");
            RestTemplate restTemplate = restTemplateBuilder.setConnectTimeout(ONE_SEC)
                    .setReadTimeout(TWO_SEC)
                    .build();
            return new ThirdPartyRestTemplateImpl(restTemplate);
        }
    }

    //TODO : make stub bean

}
