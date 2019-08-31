package com.css.professorlol.config.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "riot.token")
@Component
@Getter
@Setter
public class XRiotTokenProperties {
    public static final String KEY = "X-Riot-Token";
    private String value;
}