package com.css.professorlol.config;

import com.css.professorlol.config.exception.handler.RiotErrorHandler;
import com.css.professorlol.config.interceptor.RiotTokenInterceptor;
import com.css.professorlol.config.properties.XRiotTokenProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;

@Slf4j
public class RiotRestTemplateBuilder {

    public static RestTemplateBuilder get(RestTemplateBuilder restTemplateBuilder, XRiotTokenProperties xRiotTokenProperties) {
        RiotErrorHandler riotErrorHandler = new RiotErrorHandler();
        RiotTokenInterceptor riotTokenInterceptor = new RiotTokenInterceptor(xRiotTokenProperties);
        return restTemplateBuilder.rootUri(XRiotTokenProperties.RIOT_HOST_URL)
                .additionalInterceptors(riotTokenInterceptor)
                .errorHandler(riotErrorHandler);
    }

}
