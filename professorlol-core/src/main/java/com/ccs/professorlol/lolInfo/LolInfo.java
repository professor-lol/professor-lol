package com.ccs.professorlol.lolInfo;

import com.ccs.professorlol.lolInfo.exception.AlreadySavedException;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
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

    @Column(unique = true)
    @Setter
    private String patchNoteVersion;

    @Builder
    public LolInfo(String patchNoteVersion) {
        this.patchNoteVersion = patchNoteVersion;
    }

    public LolInfo(Long id, String patchNoteVersion) {
        this.id = id;
        this.patchNoteVersion = patchNoteVersion;
    }

    public void alreadySavedException() {
        throw new AlreadySavedException(this.getPatchNoteVersion());
    }
}
