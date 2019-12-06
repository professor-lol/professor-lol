package com.ccs.professorlol.member.domain;

public interface MemberRepositoryCustom {
    Member findByEmailWithMostChampion(String email);
}
