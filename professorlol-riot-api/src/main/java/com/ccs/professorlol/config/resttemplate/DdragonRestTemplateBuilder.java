package com.ccs.professorlol.config.resttemplate;

import com.ccs.professorlol.config.exception.handler.RiotErrorHandler;
import com.ccs.professorlol.config.interceptor.RiotTokenInterceptor;
import com.ccs.professorlol.config.properties.RiotProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;

public class DdragonRestTemplateBuilder {
    private static final String RIOT_DDRAGON_URL = "https://ddragon.leagueoflegends.com";

    public static RestTemplateBuilder getDdragon(RestTemplateBuilder restTemplateBuilder, RiotProperties riotProperties) {
        RiotErrorHandler riotErrorHandler = new RiotErrorHandler();
        RiotTokenInterceptor riotTokenInterceptor = new RiotTokenInterceptor(riotProperties);
        return restTemplateBuilder.rootUri(RIOT_DDRAGON_URL)
                .errorHandler(riotErrorHandler);
    }
}
