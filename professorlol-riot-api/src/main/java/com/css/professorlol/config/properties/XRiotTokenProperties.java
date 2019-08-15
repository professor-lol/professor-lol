package com.css.professorlol.config.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "riot.token")
@Component
@Getter
@Setter //이거 세터 없이 만드는 방법 없음??
public class XRiotTokenProperties {
    private String key;
    private String value;
}