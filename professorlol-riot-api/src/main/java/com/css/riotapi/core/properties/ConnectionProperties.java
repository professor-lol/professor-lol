package com.css.riotapi.core.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "connection")
@Getter
@Setter
@Component
public class ConnectionProperties {
    private Long connTimeOut;
    private Long readTimeOut;
}
