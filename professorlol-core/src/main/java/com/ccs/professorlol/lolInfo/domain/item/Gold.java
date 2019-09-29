package com.ccs.professorlol.lolInfo.domain.item;

import javax.persistence.Embeddable;

@Embeddable
public class Gold {
    // 조합 아이템일 경우 조합비용, 아닐경우 기본비용
    private Integer base;
    // 상점 구매 가능 여부
    private boolean purchasable;
    // 총 구매 가격
    private Integer total;
    // 되팔기 가격
    private Integer sell;
}
