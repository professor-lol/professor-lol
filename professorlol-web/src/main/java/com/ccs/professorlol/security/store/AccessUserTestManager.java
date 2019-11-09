package com.ccs.professorlol.security.store;

import com.ccs.professorlol.security.user.AccessUser;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Component
@Profile({"test", "local"})
public class AccessUserTestManager implements AccessUserManager {
    private static final String SESSION_ATTRIBUTE_NAME_USER_INFO = "USER_INFO";
    private AccessUser accessUser;

    public AccessUserTestManager() {
        this.accessUser = AccessUser.builder()
                .name("테스트")
                .email("aaa@gmail.com")
                .picture("picture")
                .build();
    }

    @Override
    public void saveUserInfo(AccessUser accessUser) {
        //httpSession.setAttribute(SESSION_ATTRIBUTE_NAME_USER_INFO, accessUser);
    }

    @Override
    public AccessUser loadUserInfo() {
        return accessUser;
    }
}
