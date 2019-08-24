package com.ccs.professorlol.web.handler;

import com.ccs.professorlol.security.user.AccessUser;
import com.ccs.professorlol.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
@RequiredArgsConstructor
@Component
public class LoginSuccessHandlerImpl implements LoginSuccessHandler {

    private static final String SESSION_ATTRIBUTE_NAME_USER_INFO = "USER_INFO";
    private final UserService userService;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        AccessUser accessUser = (AccessUser)request.getSession().getAttribute(SESSION_ATTRIBUTE_NAME_USER_INFO);
        if(userService.findByGoogleEmail(accessUser.getEmail())==null){
            log.info("없는회원: {}", accessUser.getEmail());
            response.sendRedirect("/registration");
            return;
        }
        response.sendRedirect("/page");
    }
}
