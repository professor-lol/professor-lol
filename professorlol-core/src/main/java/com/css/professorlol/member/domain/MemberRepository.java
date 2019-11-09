package com.css.professorlol.member.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
    User findByLolId(String lolId);
}
