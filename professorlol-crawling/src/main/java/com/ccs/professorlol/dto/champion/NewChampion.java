package com.ccs.professorlol.dto.champion;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;


import java.util.List;

@Getter
@ToString
public class NewChampion { // 신챔같은 경우는 attribute가 없어서 일단 상속관계는 뺏음

    private String name;
    private String image;
    private String summary;
    private String context;
    private List<LinkGroup> linkGroups;

    @Builder
    public NewChampion(String name, String image, String summary, String context, List<LinkGroup> linkGroups) {
        this.name = name;
        this.image = image;
        this.summary = summary;
        this.context = context;
        this.linkGroups = linkGroups;
    }
}
