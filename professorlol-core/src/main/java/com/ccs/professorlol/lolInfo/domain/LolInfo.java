package com.ccs.professorlol.lolInfo.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//TODO: 이름 수정 계획.
//TODO: BaseTimeEntity 생성해서 상속받기
@Entity
@Getter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class LolInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String patchNoteVersion; // title, version 논의 필요
    protected String championName;

    public LolInfo(String patchNoteVersion, String championName) {
        this.patchNoteVersion = patchNoteVersion;
        this.championName = championName;
    }
}
