package com.css.professorlol.core.properties;

import com.css.professorlol.common.properties.XRiotTokenProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
public class XRiotTokenPropertiesTest {

    @Autowired
    private XRiotTokenProperties xRiotTokenProperties;

    @Test
    public void riot_yml_에서_토큰값_가져오는지_확인() {
        assertThat(xRiotTokenProperties.getKey()).isEqualTo("X-Riot-Token");
        assertThat(xRiotTokenProperties.getValue()).isNotNull();
        assertThat(xRiotTokenProperties.getValue()).isNotEmpty();
    }
}