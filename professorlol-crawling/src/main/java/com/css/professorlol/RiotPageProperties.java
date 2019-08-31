package com.css.professorlol;

import lombok.Getter;

import java.io.IOException;
import java.util.Properties;

@Getter
public class RiotPageProperties {
    private String host;

    public RiotPageProperties() {
        try {
            Properties properties = new Properties();
            properties.load(getClass().getClassLoader().getResourceAsStream("com/css/professorlol/riot.properties"));
            this.host=properties.getProperty("host");
        } catch (IOException e) {
            throw new RuntimeException("리소스 파일을 찾을 수 없습니다.");
        }
    }
}
