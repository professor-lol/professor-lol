package com.ccs.professorlol.security.user;

import com.ccs.professorlol.security.store.AccessUserManager;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;


public class CustomUserService extends DefaultOAuth2UserService {

    private final AccessUserManager accessUserManager;

    public CustomUserService(AccessUserManager accessUserManager) {
        this.accessUserManager = accessUserManager;
    }

    @Override
    public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
        OAuth2User oAuth2User = super.loadUser(userRequest);
        AccessUser accessUser = AccessUser.of(oAuth2User);
        accessUserManager.saveAccessUserToStore(accessUser);
        return oAuth2User;
    }
}
