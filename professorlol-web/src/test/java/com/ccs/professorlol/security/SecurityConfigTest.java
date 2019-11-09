package com.ccs.professorlol.security;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@Ignore
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class SecurityConfigTest {

    @Autowired
    private MockMvc mockMvc;


    @Test
    public void google로그인_시도하면_OAuth인증창_등장한다() throws Exception {
        this.mockMvc.perform(get("/oauth2/authorization/google"))
                .andDo(print())
                .andExpect(status().is3xxRedirection());
    }


    @Test
    public void 로그인_안하고_요청시_401() throws Exception {

        this.mockMvc.perform(get("/"))
                .andDo(print())
                .andExpect(status().isUnauthorized());
    }
}