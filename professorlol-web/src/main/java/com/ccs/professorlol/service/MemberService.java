package com.ccs.professorlol.service;

import com.ccs.professorlol.config.exception.RiotClientException;
import com.ccs.professorlol.dto.MemberSaveReqDto;
import com.ccs.professorlol.lolInfo.champion.Champion;
import com.ccs.professorlol.lolInfo.champion.ChampionRepository;
import com.ccs.professorlol.lolInfo.champion.MostChampion;
import com.ccs.professorlol.member.domain.Member;
import com.ccs.professorlol.member.domain.MemberRepository;
import com.ccs.professorlol.member.domain.MemberType;
import com.ccs.professorlol.repository.mostchampion.MostChampionRepository;
import com.ccs.professorlol.security.store.AccessUserManager;
import com.ccs.professorlol.security.user.AccessUser;
import com.ccs.professorlol.summoner.SummonerRestTemplate;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberService {

    private final MemberRepository memberRepository;
    private final ChampionRepository championRepository;
    private final MostChampionRepository mostChampionRepository;
    private final AccessUserManager accessUserManager;
    private final SummonerRestTemplate summonerRestTemplate;


    public Member findByEmail(final String email) {
        return memberRepository.findByEmail(email);
    }

    @Transactional
    public Member saveMember(MemberSaveReqDto memberSaveReqDto) {
        validation(memberSaveReqDto);

        AccessUser accessUser = accessUserManager.loadAccessUserInStore();

        Member member = Member.createBuilder()
                .email(accessUser.getEmail())
                .name(accessUser.getName())
                .picture(accessUser.getPicture())
                .summonerName(memberSaveReqDto.getSummonerName())
                .memberType(findMemberTypeByEmail(accessUser.getEmail()))
                .build();
        memberRepository.save(member);

       saveMostChampion(memberSaveReqDto, member);

        return member;
    }

    //TODO: MostChampionService로 이동
    private void saveMostChampion(MemberSaveReqDto memberSaveReqDto, Member member){
        List<Champion> champions = memberSaveReqDto.getMostChampionDtos().stream()
                .map(mostChampionDto -> championRepository.findById(mostChampionDto.getId()).orElseThrow(IllegalAccessError::new))
                .collect(Collectors.toList());

        List<MostChampion> mostChampions = champions.stream()
                .map(champion -> MostChampion.builder()
                        .member(member)
                        .champion(champion)
                        .build())
                .collect(Collectors.toList());

        mostChampionRepository.saveAll(mostChampions);
    }


    private void validation(MemberSaveReqDto memberSaveReqDto) {
        isExistSummoner(memberSaveReqDto.getSummonerName()); //소환사 명 유효성 검사
        isExistUser(memberSaveReqDto.getSummonerName()); // 해당 소환사명으로 이미 가입한 사용자인지 검증
        if (memberSaveReqDto.getMostChampionDtos().size() <= 0 || memberSaveReqDto.getMostChampionDtos().size() > 3) {
            throw new IllegalArgumentException("모스트챔피언을 구독하지 않았거나 3명 이상입니다!");
        }
    }

    private void isExistSummoner(final String summonerName) {
        try {
            summonerRestTemplate.getSummonerDtoBySummonerName(summonerName);
        } catch (RiotClientException re) {
            throw new IllegalArgumentException("존재하지 않는 소환사입니다");
        }
    }

    private void isExistUser(final String summonerName) {
        if (memberRepository.findMemberBySummonerName(summonerName) != null) {
            throw new IllegalArgumentException("이미 해당 lol 아이디로 가입된 계정이 존재합니다!!!");
        }
    }

    private MemberType findMemberTypeByEmail(final String email) {
        String domain = email.substring(email.indexOf('@') + 1);
        return Arrays.asList(MemberType.values()).stream()
                .filter(memberType -> memberType.getDomain().equals(domain))
                .findAny()
                .orElseThrow(IllegalAccessError::new);
    }
}

