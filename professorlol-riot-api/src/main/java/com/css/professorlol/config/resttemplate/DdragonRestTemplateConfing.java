package com.css.professorlol.config.resttemplate;

import com.css.professorlol.config.properties.RiotProperties;
import com.css.professorlol.ddragon.DdragonRestTemplate;
import com.css.professorlol.ddragon.impl.DdragonRestTemplateImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Duration;

@Configuration
@Slf4j
public class DdragonRestTemplateConfing {

    @Profile("major")
    @RequiredArgsConstructor
    @Configuration
    public static class MajorDdragonConfig {

        private static final Duration ONE_SEC = Duration.ofMillis(1000);
        private static final Duration TWO_SEC = Duration.ofMillis(2000);

        private final RiotProperties riotProperties;
        private final RestTemplateBuilder restTemplateBuilder;

        @Bean
        public DdragonRestTemplate DdragonRestTemplate() {
            log.debug("Ddragon RestTemplate bean Created");

            RestTemplateBuilder restTemplateBuilder = RiotRestTemplateBuilder.getDdragon(this.restTemplateBuilder, this.riotProperties);

            return new DdragonRestTemplateImpl(restTemplateBuilder.setConnectTimeout(ONE_SEC)
                    .setConnectTimeout(TWO_SEC)
                    .build());
        }
    }
}
