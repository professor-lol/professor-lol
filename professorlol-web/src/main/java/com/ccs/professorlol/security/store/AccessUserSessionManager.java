package com.ccs.professorlol.security.store;

import com.ccs.professorlol.security.user.AccessUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;

@Component
@RequiredArgsConstructor
public class AccessUserSessionManager implements AccessUserManager {
    private static final String SESSION_ATTRIBUTE_NAME_USER_INFO = "USER_INFO";

    private final HttpSession httpSession;

    @Override
    public void saveUserInfo(AccessUser accessUser) {
        httpSession.setAttribute(SESSION_ATTRIBUTE_NAME_USER_INFO, accessUser);
    }

    @Override
    public AccessUser loadUserInfo() {
        return (AccessUser) httpSession.getAttribute(SESSION_ATTRIBUTE_NAME_USER_INFO);
    }
}
