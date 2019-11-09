package com.ccs.professorlol.patch.skill;

import com.ccs.professorlol.type.AttributeType;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChampionAttributeHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private AttributeType attributeType;
    private String attribute;
    private String beforeContent;
    private String afterContent;

    @Setter
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "champion_ability_history_id")
    private ChampionAbilityHistory championAbilityHistory;

    @Builder
    private ChampionAttributeHistory(AttributeType attributeType, String attribute, String beforeContent, String afterContent) {
        this.attributeType = attributeType;
        this.attribute = attribute;
        this.beforeContent = beforeContent;
        this.afterContent = afterContent;
    }
}
