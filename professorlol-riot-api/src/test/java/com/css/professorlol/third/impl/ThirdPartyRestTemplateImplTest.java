package com.css.professorlol.third.impl;

import com.css.professorlol.config.exception.NotCorrectInputException;
import com.css.professorlol.config.exception.RiotClientException;
import com.css.professorlol.config.restTemplate.ThirdPartyRestTemplateConfig;
import com.css.professorlol.third.ThirdPartyRestTemplate;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@Ignore
@SpringBootTest
@RunWith(SpringRunner.class)
@ActiveProfiles("major")
public class ThirdPartyRestTemplateImplTest {

    private static final Logger log = LoggerFactory.getLogger(ThirdPartyRestTemplate.class);
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();


    @Autowired
    private ThirdPartyRestTemplateConfig.MajorThirdConfig majorThirdConfig;

    private ThirdPartyRestTemplate thirdPartyRestTemplate;

    @Before
    public void setUp() throws Exception {
        this.thirdPartyRestTemplate = majorThirdConfig.thirdPartyRestTemplate();
    }

    @Test
    public void getThirdPartyCodeBySummonerId_정상입력() {
        //given
        String encryptedSummonerId = "ikOkuPXpvz6vO7d5JOtFq2oBalTG2CHc9BkTKapqIOdVIXc";

        //when
        String thirdPartyCodeBySummonerId = this.thirdPartyRestTemplate.getThirdPartyCodeBySummonerId(encryptedSummonerId);

        //then
        assertThat(thirdPartyCodeBySummonerId).isNotNull();
        log.info(thirdPartyCodeBySummonerId);
    }

    @Test
    public void getSummonerDto_결과없음() {
        //given
        String encryptedSummonerId = "1M7EGb747N2UwwU9rrtHpcbiwnrXRVOR7h6b8FgEjZJj6-w";

        //when
        //then (404 NOT FOUND)
        assertThatThrownBy(() -> this.thirdPartyRestTemplate.getThirdPartyCodeBySummonerId(encryptedSummonerId))
                .isInstanceOf(RiotClientException.class);
    }

    @Test
    public void getSummonerDto_올바르지_않은_값_입력() {
        //올바르지 않은 값 -> encryptedSummonerId에 !#$!DAF 이런식으로 이상한 값 줬을 때도 해당함.
        //given
        //when
        //then (400 BAD REQUEST)
        assertThatThrownBy(() -> this.thirdPartyRestTemplate.getThirdPartyCodeBySummonerId(null))
                .isInstanceOf(NotCorrectInputException.class);
    }


}