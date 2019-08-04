package com.ccs.crawler.domain.champion;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class Ability {  //스킬 .change-detail-title .ability-title
    //기본 능력치는 .change-detail-title
    private String title;           // 스킬 명 .attribute-detail-title .ability-title
    private String image;           // 스킬 이미지   img src
//    private List<New> news;
//    private List<Change> changes;
//    private List<Remove> removes;

}
