package com.ccs.professorlol.config.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "riot")
@Component
@Getter
@Setter
public class RiotProperties {

    private String host;
    private Token token;

    @Getter
    @Setter
    public static class Token {
        public static final String KEY = "X-Riot-Token";
        private String value;
    }

}