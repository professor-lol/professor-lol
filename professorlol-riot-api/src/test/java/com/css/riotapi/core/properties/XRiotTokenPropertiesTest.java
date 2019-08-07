package com.css.riotapi.core.properties;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
public class XRiotTokenPropertiesTest {

    Logger log = LoggerFactory.getLogger(XRiotTokenPropertiesTest.class);

    @Autowired
    private XRiotTokenProperties xRiotTokenProperties;

    @Test
    public void riot_yml_에서_토큰값_가져오는지_확인() {

        assertThat(xRiotTokenProperties.getKey()).isEqualTo("X-Riot-Token");
        assertThat(xRiotTokenProperties.getValue()).isNotEmpty();

        log.info(xRiotTokenProperties.getValue());
    }
}