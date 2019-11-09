package com.ccs.professorlol.dto.champion;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class LinkGroup {
    private String content;
    private String url;

    @Builder
    public LinkGroup(String content, String url) {
        this.content = content;
        this.url = url;
    }
}
