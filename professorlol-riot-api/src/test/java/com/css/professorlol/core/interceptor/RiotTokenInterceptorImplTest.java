package com.css.professorlol.core.interceptor;

import com.css.professorlol.core.properties.XRiotTokenProperties;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class RiotTokenInterceptorImplTest {

    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private final Logger log = LoggerFactory.getLogger(RiotTokenInterceptorImplTest.class);

    @Autowired
    private RiotTokenInterceptor riotTokenInterceptor;

    @Autowired
    private XRiotTokenProperties xRiotTokenProperties;

    @LocalServerPort
    private int randomServerPort;

    @Test
    public void intercept_헤더_정상추가_확인() {
        //given
        RestTemplate restTemplate = new RestTemplateBuilder()
                .additionalInterceptors(riotTokenInterceptor)
                .build();

        //when
        Map<String,String> headers = restTemplate.getForObject("http://localhost:"+randomServerPort+"/api/test/get", Map.class);

        //then
        log.info(gson.toJson(headers));
        assertThat(headers.get(xRiotTokenProperties.getKey().toLowerCase())).isEqualTo(xRiotTokenProperties.getValue());
    }
}