package com.ccs.professorlol.api;

import com.ccs.professorlol.domain.user.User;
import com.ccs.professorlol.dto.UserSaveReqDto;
import com.ccs.professorlol.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/user")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;

    @PostMapping()
    public ResponseEntity<User> sighUp(@RequestBody UserSaveReqDto userSaveReqDto) {
        User user = userService.saveUser(userSaveReqDto);
        log.info("회원가입: {}", user.getLolId());
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
