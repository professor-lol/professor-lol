package com.ccs.professorlol.lolInfo.domain.item;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    // 아이템 상세 스펙, html 태그 형식의 String 이 들어감.
    private String description;

    // 하위 아이템 코드
    private List<Integer> from;

    // 상위 아이템 코드
    private List<Integer> into;

    @Embedded
    private Gold gold;

    @Enumerated(EnumType.STRING)
    private List<GameMap> maps;
}
