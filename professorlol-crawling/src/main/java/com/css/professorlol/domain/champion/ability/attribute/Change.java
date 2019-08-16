package com.css.professorlol.domain.champion.ability.attribute;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

/**
 * <attribute>
 * <attribute></attribute>
 * <attribute-beforeContent></attribute-beforeContent>
 * <attribute-content></attribute-content>
 * </attribute>
 */

@Builder
@AllArgsConstructor
@Getter
public class Change {
    private String attribute;
    private String beforeContent;
    private String afterContent;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n========unit(change)========");
        sb.append("\nattribute : ").append(attribute);
        sb.append("\n").append(beforeContent).append("->").append(afterContent);
        return sb.toString();
    }
}
