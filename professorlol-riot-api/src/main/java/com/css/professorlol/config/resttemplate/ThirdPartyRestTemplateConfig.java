package com.css.professorlol.config.resttemplate;

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

    @Profile({"major"})
    @Configuration
    @RequiredArgsConstructor
    public static class MajorThirdConfig {

        private final Duration ONE_SEC = Duration.ofMillis(1000);
        private final Duration TWO_SEC = Duration.ofMillis(2000);

        private final XRiotTokenProperties xRiotTokenProperties;
        private final RestTemplateBuilder restTemplateBuilder;

        @Bean
        public ThirdPartyRestTemplate thirdPartyRestTemplate() {
            log.debug("ThirdParty RestTemplate Bean created.");
            RestTemplateBuilder restTemplateBuilder = RiotRestTemplateBuilder.get(this.restTemplateBuilder, this.xRiotTokenProperties);
            restTemplateBuilder = restTemplateBuilder.setConnectTimeout(ONE_SEC)
                    .setReadTimeout(TWO_SEC);
            return new ThirdPartyRestTemplateImpl(restTemplateBuilder);
        }

    }

    @Profile({"local", "test"})
    @Configuration
    @RequiredArgsConstructor
    public static class LocalThirdConfig {

        @Bean
        public ThirdPartyRestTemplate thirdPartyRestTemplate() {
            log.debug("ThirdParty RestTemplate Stub Bean created.");
            return new ThirdPartyRestTemplateStubImpl();
        }

    }

}
