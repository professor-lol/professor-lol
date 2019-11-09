package com.ccs.professorlol.web.handler;

import com.ccs.professorlol.security.user.AccessUser;
import com.ccs.professorlol.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
@RequiredArgsConstructor
@Component
public class LoginSuccessHandlerImpl implements LoginSuccessHandler {

    private static final String SESSION_ATTRIBUTE_NAME_USER_INFO = "USER_INFO";
    private final MemberService memberService;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException {
        AccessUser accessUser = (AccessUser)request.getSession().getAttribute(SESSION_ATTRIBUTE_NAME_USER_INFO);
        if (memberService.findByEmail(accessUser.getEmail()) == null) {
            response.sendRedirect("/registration");
            return;
        }
        response.sendRedirect("/page");
    }
}
