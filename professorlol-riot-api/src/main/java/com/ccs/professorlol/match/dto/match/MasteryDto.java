package com.ccs.professorlol.match.dto.match;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MasteryDto {
    private Integer masteryId;
    private Integer rank;
}
