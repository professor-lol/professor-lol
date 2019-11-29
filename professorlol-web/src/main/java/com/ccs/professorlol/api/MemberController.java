package com.ccs.professorlol.api;

import com.ccs.professorlol.dto.MemberSaveReqDto;
import com.ccs.professorlol.member.domain.Member;
import com.ccs.professorlol.service.MemberService;
import com.ccs.professorlol.service.RiotAuthService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("api/v1/user")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;
    private final RiotAuthService riotAuthService;

    @PostMapping()
    public ResponseEntity<Member> sighUp(@RequestBody MemberSaveReqDto memberSaveReqDto) {
        Member member = memberService.saveMember(memberSaveReqDto);
        log.info("회원가입: {}", member.getEmail());
        return new ResponseEntity<>(member, HttpStatus.CREATED);
    }


    //소환사 명 유효성 체크 API
    //save할 때 또 체크 하기 때문에 사용하지 않아도 됨
    @GetMapping("/validation")
    public ResponseEntity<String> isValidSummonerName(final String summonerName) {
        if (StringUtils.isEmpty(summonerName)) {
            throw new IllegalArgumentException("소환사 명을 입력해주세요!");
        }
        riotAuthService.isExistSummoner(summonerName);
        return new ResponseEntity<>("유효성 체크 성공", HttpStatus.OK);
    }

}
