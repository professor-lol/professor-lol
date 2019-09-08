package com.css.professorlol.subscribe.domain;

import com.css.professorlol.common.RowStatus;
import com.css.professorlol.member.domain.Member;
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
    private Info info;
    @Enumerated(value = EnumType.STRING)
    private RowStatus active;
}
