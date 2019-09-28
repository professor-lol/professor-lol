package com.ccs.professorlol.dto.bug;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
public class BugFix {
    private String context; //버그 설명 <li>
}
