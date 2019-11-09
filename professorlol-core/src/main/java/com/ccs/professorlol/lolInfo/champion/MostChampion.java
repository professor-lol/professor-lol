package com.ccs.professorlol.lolInfo.champion;


import com.ccs.professorlol.member.domain.Member;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MostChampion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "member_id")
    private Member member;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "champion_id")
    private Champion champion;

    @Builder
    public MostChampion(Member member, Champion champion) {
        this.member = member;
        this.champion = champion;
    }
}
