package com.css.riotapi.match.impl;

import com.css.riotapi.match.MatchRestTemplate;
import com.css.riotapi.match.dto.MatchQueryParam;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MatchRestTemplateImplTest {

    @Autowired
    private MatchRestTemplate matchRestTemplate;

    @Test
    public void getMatchlist_성공_쿼리파라미터_없이() {
        MatchQueryParam matchQueryParam = MatchQueryParam.testBuilder()
                .build();


    }
}