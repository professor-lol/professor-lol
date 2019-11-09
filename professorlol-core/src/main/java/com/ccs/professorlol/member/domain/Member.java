package com.ccs.professorlol.member.domain;

import com.ccs.professorlol.lolInfo.champion.MostChampion;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String name;
    private String summonerName;
    @Enumerated(value = EnumType.STRING)
    private MemberType memberType;

    @OneToMany(mappedBy = "member", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<MostChampion> mostChampion;


//    @OneToMany(mappedBy = "member")
//    private List<Subscribe> subscribes;

    @Builder(builderMethodName = "createBuilder")
    public Member(String email, String name, String summonerName, MemberType memberType) {
        this.email = email;
        this.name = name;
        this.summonerName = summonerName;
        this.memberType = memberType;
    }
}
