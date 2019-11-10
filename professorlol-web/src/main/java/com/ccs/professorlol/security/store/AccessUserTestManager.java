package com.ccs.professorlol.security.store;

import com.ccs.professorlol.dto.MostChampionDto;
import com.ccs.professorlol.security.user.AccessUser;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
@Profile({"test", "local"})
public class AccessUserTestManager implements AccessUserManager {
    private AccessUser accessUser;

    public AccessUserTestManager() {
        MostChampionDto mostChampionDto = MostChampionDto.builder()
                .name("모스트챔피언")
                .id(1L)
                .build();
        this.accessUser = AccessUser.builder()
                .name("테스트")
                .email("aaa@gmail.com")
                .picture("picture")
                .summonerName("aaaaa")
                .mostChampionDtos(Arrays.asList(mostChampionDto))
                .build();
    }

    @Override
    public void saveAccessUserToStore(AccessUser accessUser) {
        this.accessUser = accessUser;
    }

    @Override
    public void saveUserInfo(AccessUser accessUser) {
        //httpSession.setAttribute(SESSION_ATTRIBUTE_NAME_USER_INFO, accessUser)/**/;
    }

    @Override
    public AccessUser loadUserInfo() {
        return accessUser;
    }


    public AccessUser loadAccessUserInStore() {
        return this.accessUser;
    }
}
