package com.ccs.professorlol.crawler;

import lombok.Getter;

import java.io.IOException;
import java.util.Properties;

@Getter
public class RiotPageProperties {
    private String host;
    private int timeout;

    public RiotPageProperties() {
        try {
            Properties properties = new Properties();
            properties.load(getClass().getClassLoader().getResourceAsStream("riot.properties"));

            this.host=properties.getProperty("host");
            this.timeout = Integer.parseInt(properties.getProperty("timeout"));
        } catch (IOException e) {
            throw new RuntimeException("리소스 파일을 찾을 수 없습니다.");
        }
    }
}
