package com.ccs.crawler.domain.champion;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class Change {   // .attribute-change
    private String attribute;   // 스킬 변경 사항 .attribute
    private String before;      // 변경전 능력 셋 .attribute-before (null 가능)
    private String after;       // 변경 후 능력 셋 .attribute-after
    private String remove;      // 삭제된 스킬     .attribute-remove

    /**
     조합 3가지

     <attribute>
     <attribute></attribute>
     <attribute-before></attribute-before>
     <attribute-after></attribute-after>
     </attribute>

     <attribute>
     <attribute></attribute>
     <attribute-remove></attribute-remove>
     </attribute>

     <attribute>
     <attribute></attribute>
     <attribute-after></attribute-after>
     </attribute>
     */
}
