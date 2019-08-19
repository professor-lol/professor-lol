package com.ccs.professorlol.service;

import com.ccs.professorlol.domain.user.User;
import com.ccs.professorlol.domain.user.UserRepository;
import com.ccs.professorlol.dto.UserSaveReqDto;
import com.ccs.professorlol.security.store.AccessUserManager;
import com.ccs.professorlol.security.user.AccessUser;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class UserService {

    private final UserRepository userRepository;
    private final AccessUserManager accessUserManager;

    public User findByGoogleEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public User saveUser(UserSaveReqDto userSaveReqDto) {
        if (exist(userSaveReqDto.getLolId()) != null) {
            throw new IllegalArgumentException("이미 해당 lol 아이디로 가입된 계정이 존재합니다!!!");
        }
        AccessUser accessUser = accessUserManager.loadUserInfo();
        User user = User.createBuilder()
                .email(accessUser.getEmail())
                .name(accessUser.getName())
                .picture(accessUser.getPicture())
                .lolId(userSaveReqDto.getLolId())
                .build();
        return userRepository.save(user);
    }

    private User exist(String lolId) {
        return userRepository.findByLolId(lolId);
    }

}
