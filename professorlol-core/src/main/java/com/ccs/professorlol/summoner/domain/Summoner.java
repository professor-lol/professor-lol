package com.ccs.professorlol.summoner.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Summoner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String accountId;
    private String name;
    @Enumerated(value = EnumType.STRING)
    private Tier tier; // enum으로 빼기
    private String thirdPartyId;
}
