package com.css.professorlol.summoner.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Summoner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String summonerName;

    @Enumerated(EnumType.STRING)
    private Tier currentTier;

    private String thirdPartyId;

    @OneToMany
    private List<SeasonHistory> seasonHistories;
}
