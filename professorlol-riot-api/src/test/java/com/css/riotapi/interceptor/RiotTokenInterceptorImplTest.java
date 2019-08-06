package com.css.riotapi.interceptor;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
public class RiotTokenInterceptorImplTest {

    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private final Logger log = LoggerFactory.getLogger(RiotTokenInterceptorImplTest.class);

    @Autowired
    private RiotTokenInterceptor riotTokenInterceptor;

    @Autowired
    XRiotTokenProperties xRiotTokenProperties;

    @Test
    public void intercept_헤더_정상추가_확인() {
        RestTemplate restTemplate = new RestTemplateBuilder()
                .additionalInterceptors(riotTokenInterceptor)
                .build();

        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://httpbin.org/get", String.class);

        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseEntity.getHeaders().get(xRiotTokenProperties.getKey()).get(0)).isEqualTo(xRiotTokenProperties.getValue());
        log.info(gson.toJson(responseEntity.getHeaders()));
    }
}