package com.css.professorlol.member.domain;

import com.css.professorlol.common.RowStatus;
import lombok.AccessLevel;
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
    @Enumerated(value = EnumType.STRING)
    private MemberType memberType;
    @Enumerated(value = EnumType.STRING)
    private RowStatus active;

    @OneToMany(mappedBy = "member")
    private List<Subscribe> subscribes;
}
