package com.ccs.professorlol.member.domain;

import com.ccs.professorlol.lolInfo.champion.MostChampion;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
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
    private String picture;

    @Enumerated(value = EnumType.STRING)
    private MemberType memberType;

    @OneToMany(mappedBy = "member", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<MostChampion> mostChampions = new ArrayList<>();

    @Builder(builderMethodName = "createBuilder")
    public Member(String email, String name, String summonerName, String picture, MemberType memberType) {
        this.email = email;
        this.name = name;
        this.summonerName = summonerName;
        this.picture = picture;
        this.memberType = memberType;
    }
}
