package com.css.professorlol.subscribe.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;


//TODO: 스킬이랑 능력치를 구분해서 둘고 있는 것이 나을지?
// 변경 된 사항을 리스트로 들고 있자. 변경 사항에는 이름이랑 변경 내용을 들고 있고,
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChampionHistory extends Info {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer championId;

    private List<ChampionChangeHistory> changeHistories;

}
