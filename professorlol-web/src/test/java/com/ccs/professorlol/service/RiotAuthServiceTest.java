package com.ccs.professorlol.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@ActiveProfiles("major")
@SpringBootTest
@RunWith(SpringRunner.class)
public class RiotAuthServiceTest {

    @Autowired
    RiotAuthService riotAuthService;

    @Test
    public void isExistSummoner() {
        //given
        riotAuthService.isExistSummoner("이상한새기");
        //when
        //then
    }
}
