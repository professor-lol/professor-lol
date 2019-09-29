package com.ccs.professorlol.dto.champion.ability.attribute;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

/**
 * <attribute>
 * <attribute></attribute>
 * <attribute-content></attribute-content>
 * </attribute>
 */

@Builder
@AllArgsConstructor
@Getter
public class Remove {   // .attribute-change
    private String attribute;   // 스킬 변경 사항 .attribute
    private String content;       // 변경 후 능력 셋 .attribute-removed

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nattribute : ").append(attribute);
        sb.append("\n>>>").append(content);
        return sb.toString();
    }
}
