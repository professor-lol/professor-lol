package com.css.professorlol.member.domain;

import com.css.professorlol.lolInfo.domain.LolInfo;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Subscribe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Member member;
    @ManyToOne
    private LolInfo lolInfo;
    @Enumerated(value = EnumType.STRING)
    private boolean active;
}
