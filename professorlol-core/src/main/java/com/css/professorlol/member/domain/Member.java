package com.css.professorlol.member.domain;

import com.css.professorlol.common.RowStatus;
import lombok.AccessLevel;
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
    private MemberType memberType;
    @Enumerated(value = EnumType.STRING)
    private RowStatus active;
}
