package com.ccs.professorlol.member.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String name;
    private String lolId;
    @Enumerated(value = EnumType.STRING)
    private MemberType memberType;


//    @OneToMany(mappedBy = "member")
//    private List<Subscribe> subscribes;


    @Builder(builderMethodName = "createBuilder")
    public Member(String email, String name, String lolId, MemberType memberType) {
        this.email = email;
        this.name = name;
        this.lolId = lolId;
        this.memberType = memberType;
    }


}
