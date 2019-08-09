package com.css.riotapi.summoner.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "riot.summoner.test")
@Component
@Getter
@Setter
@Profile("test")
public class SummonerTestProperties {

    private Long timeOut;
    private Long connOut;

}
