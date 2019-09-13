package com.css.professorlol.config.restTemplate;

import com.css.professorlol.config.exception.handler.RiotErrorHandler;
import com.css.professorlol.config.interceptor.RiotTokenInterceptor;
import com.css.professorlol.config.properties.RiotProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;

@Slf4j
public class RiotRestTemplateBuilder {
    private static final String RIOT_HOST_URL = "https://kr.api.riotgames.com";

    public static RestTemplateBuilder get(RestTemplateBuilder restTemplateBuilder, RiotProperties riotProperties) {
        RiotErrorHandler riotErrorHandler = new RiotErrorHandler();
        RiotTokenInterceptor riotTokenInterceptor = new RiotTokenInterceptor(riotProperties);
        return restTemplateBuilder.rootUri(RIOT_HOST_URL)
                .additionalInterceptors(riotTokenInterceptor)
                .errorHandler(riotErrorHandler);
    }

}