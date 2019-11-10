package com.ccs.professorlol.security;

import com.ccs.professorlol.security.user.CustomUserService;
import com.ccs.professorlol.web.handler.LoginSuccessHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.HttpStatusEntryPoint;

@Configuration
public class SecurityConfig {

    @Profile("major")
    @EnableGlobalMethodSecurity(securedEnabled = true)
    @RequiredArgsConstructor
    static public class SecurityMajorConfig extends WebSecurityConfigurerAdapter {
        private final CustomUserService customUserService;
        private final LoginSuccessHandler loginSuccessHandler;

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http
                    .csrf().disable()
                    .authorizeRequests()
                    .antMatchers("/login/**", "/static/**").permitAll()
                    .anyRequest().authenticated()
                    .and().exceptionHandling().authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED))
                    .and().oauth2Login()
                    .successHandler(loginSuccessHandler)
                    .userInfoEndpoint()
                    .userService(customUserService);
        }
    }

    @Profile({"test", "local"})
    @EnableGlobalMethodSecurity(securedEnabled = true)
    @RequiredArgsConstructor
    static public class SecurityTestConfig extends WebSecurityConfigurerAdapter {
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.antMatcher("/**").csrf().disable()
                    .cors().disable()
                    .authorizeRequests().anyRequest().permitAll();
        }
    }
}