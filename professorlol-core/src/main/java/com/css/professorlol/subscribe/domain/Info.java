package com.css.professorlol.subscribe.domain;

import lombok.AccessLevel;
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
public class Info {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String patchNoteVersion; // title, version 논의 필요
}
