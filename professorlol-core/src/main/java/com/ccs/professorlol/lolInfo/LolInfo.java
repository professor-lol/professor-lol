package com.ccs.professorlol.lolInfo;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//TODO: 이름 수정 계획.
//TODO: BaseTimeEntity 생성해서 상속받기
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class LolInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String patchNoteVersion;

    @Builder
    public LolInfo(String patchNoteVersion) {
        this.patchNoteVersion = patchNoteVersion;
    }

    public LolInfo(Long id, String patchNoteVersion) {
        this.id = id;
        this.patchNoteVersion = patchNoteVersion;
    }
}
