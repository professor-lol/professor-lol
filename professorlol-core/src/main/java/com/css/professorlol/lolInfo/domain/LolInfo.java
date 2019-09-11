package com.css.professorlol.lolInfo.domain;

import com.css.professorlol.member.domain.Subscribe;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

//TODO: 이름 수정 계획.
//TODO: BaseTimeEntity 생성해서 상속받기
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class LolInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String patchNoteVersion; // title, version 논의 필요

    @OneToMany(mappedBy = "info")
    private List<Subscribe> subscribes;
}
