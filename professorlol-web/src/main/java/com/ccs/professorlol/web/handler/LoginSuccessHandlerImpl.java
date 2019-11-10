package com.ccs.professorlol.web.handler;

import com.ccs.professorlol.dto.MostChampionDto;
import com.ccs.professorlol.lolInfo.champion.MostChampion;
import com.ccs.professorlol.member.domain.Member;
import com.ccs.professorlol.security.store.AccessUserManager;
import com.ccs.professorlol.security.user.AccessUser;
import com.ccs.professorlol.service.MemberService;
import com.ccs.professorlol.service.MostChampionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@Component
public class LoginSuccessHandlerImpl implements LoginSuccessHandler {

    private final MemberService memberService;
    private final MostChampionService mostChampionService;
    private final AccessUserManager accessUserManager;
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException {
        Member member = memberService.findByEmail(accessUserManager.loadAccessUserInStore().getEmail());
        /*    AccessUser accessUser = (AccessUser)request.getSession().getAttribute(SESSION_ATTRIBUTE_NAME_USER_INFO);
        OAuth2User oAuth2User = customUserService.loadUser()*/
        if (member == null) {
            log.info("아직 가입하지 않은 사용자입니다.");
            response.sendRedirect("/registration"); //회원가입 페이지로 이동
            return;
        }

        if (member.getMostChampions() == null) {
            throw new RuntimeException("등록된 모스트챔피언이 없습니다!");
        }

        //TODO: Member의 MostChampion 조회 메서드 구현
        List<MostChampion> mostChampions = mostChampionService.findByMember(member);

        List<MostChampionDto> mostChampionDto = mostChampions.stream()
                .map(mostChampion -> MostChampionDto.builder()
                        .id(mostChampion.getChampion().getId())
                        .name(mostChampion.getChampion().getName()).build())
                .collect(Collectors.toList());

        AccessUser accessUser = AccessUser.builder()
                .name(member.getName())
                .email(member.getEmail())
                .picture(member.getPicture())
                .summonerName(member.getSummonerName())
                .mostChampionDtos(mostChampionDto)
                .build();

        accessUserManager.saveUserInfo(accessUser);

        response.sendRedirect("/page"); //대시보드
    }
}
