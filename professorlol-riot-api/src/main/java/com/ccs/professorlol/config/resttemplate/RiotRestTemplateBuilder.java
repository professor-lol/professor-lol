package com.ccs.professorlol.config.resttemplate;

import com.ccs.professorlol.config.exception.handler.RiotErrorHandler;
import com.ccs.professorlol.config.interceptor.RiotTokenInterceptor;
import com.ccs.professorlol.config.properties.RiotProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;

@Slf4j
public class RiotRestTemplateBuilder {
    private static final String RIOT_HOST_URL = "https://kr.api.riotgames.com";

    private static final String RIOT_DDRAGON_URL = "https://ddragon.leagueoflegends.com";

    public static RestTemplateBuilder get(RestTemplateBuilder restTemplateBuilder, RiotProperties riotProperties) {
        RiotErrorHandler riotErrorHandler = new RiotErrorHandler();
        RiotTokenInterceptor riotTokenInterceptor = new RiotTokenInterceptor(riotProperties);
        return restTemplateBuilder.rootUri(RIOT_HOST_URL)
                .additionalInterceptors(riotTokenInterceptor)
                .errorHandler(riotErrorHandler);
    }

    //TODO : 함수명 체크 해봐야해...
    public static RestTemplateBuilder getDdragon(RestTemplateBuilder restTemplateBuilder, RiotProperties riotProperties) {
        RiotErrorHandler riotErrorHandler = new RiotErrorHandler();
        RiotTokenInterceptor riotTokenInterceptor = new RiotTokenInterceptor(riotProperties);
        return restTemplateBuilder.rootUri(RIOT_DDRAGON_URL)
                .errorHandler(riotErrorHandler);
    }

}