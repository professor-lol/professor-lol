package com.css.professorlol.domain.champion.ability;


import com.css.professorlol.domain.champion.ability.attribute.Change;
import com.css.professorlol.domain.champion.ability.attribute.New;
import com.css.professorlol.domain.champion.ability.attribute.Remove;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@AllArgsConstructor
@Getter
public class Ability {  //스킬 .change-detail-title .attribute-title

    //기본 능력치는 .change-detail-title

    private String title;           // 스킬 명 .attribute-detail-title .attribute-title
    private String image;           // 스킬 이미지   img src
    private List<New> news;
    private List<Change> changes;
    private List<Remove> removes;


    public String toString() {
        return "\n========attribute========" +
                "\ntitle : " + title +
                "\nimage : " + image +
                "\nremoves : " + removes.toString() +
                "\nnews : " + news.toString() +
                "\nchange : " + changes.toString();
    }
}
