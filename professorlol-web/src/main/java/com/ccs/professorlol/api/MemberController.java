package com.ccs.professorlol.api;

import com.ccs.professorlol.dto.MemberSaveReqDto;
import com.ccs.professorlol.member.domain.Member;
import com.ccs.professorlol.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("api/v1/user")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping()
    public ResponseEntity<Member> sighUp(@RequestBody MemberSaveReqDto memberSaveReqDto) {
        Member member = memberService.saveUser(memberSaveReqDto);
        log.info("회원가입: {}", member.getEmail());
        return new ResponseEntity<>(member, HttpStatus.OK);
    }
}
