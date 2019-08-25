package com.css.professorlol.config.resttemplate;

import com.css.professorlol.config.RiotRestTemplateBuilder;
import com.css.professorlol.config.properties.XRiotTokenProperties;
import com.css.professorlol.third.ThirdPartyRestTemplate;
import com.css.professorlol.third.impl.ThirdPartyRestTemplateImpl;
import com.css.professorlol.third.impl.ThirdPartyRestTemplateStubImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Duration;

@Slf4j
@Configuration
public class ThirdPartyRestTemplateConfig {
    private static final String RIOT_HOST_URL = "https://kr.api.riotgames.com";

    @Profile("dev")
    @Configuration
    @RequiredArgsConstructor
    public static class ThirdPartyRestTemplateConfiguration {
        private final Duration ONE_SEC = Duration.ofMillis(1000);
        private final Duration TWO_SEC = Duration.ofMillis(2000);

        private final XRiotTokenProperties xRiotTokenProperties;
        private final RestTemplateBuilder restTemplateBuilder;

        @Bean
        public ThirdPartyRestTemplate thirdPartyRestTemplate() {
            RestTemplateBuilder restTemplateBuilder = RiotRestTemplateBuilder.get(this.restTemplateBuilder, this.xRiotTokenProperties);
            restTemplateBuilder = restTemplateBuilder.rootUri(RIOT_HOST_URL)
                    .setConnectTimeout(ONE_SEC)
                    .setReadTimeout(TWO_SEC);
            return new ThirdPartyRestTemplateImpl(restTemplateBuilder);
        }

    }

    @Profile("stub")
    @Configuration
    @RequiredArgsConstructor
    public static class ThirdPartyRestTemplateStubConfiguration {

        @Bean
        public ThirdPartyRestTemplate thirdPartyRestTemplate() {
            return new ThirdPartyRestTemplateStubImpl();
        }

    }

}
