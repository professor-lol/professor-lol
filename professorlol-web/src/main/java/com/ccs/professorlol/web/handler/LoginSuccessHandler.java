package com.ccs.professorlol.web.handler;

import com.ccs.professorlol.security.user.AccessUser;
import com.ccs.professorlol.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public interface LoginSuccessHandler extends AuthenticationSuccessHandler {

}
