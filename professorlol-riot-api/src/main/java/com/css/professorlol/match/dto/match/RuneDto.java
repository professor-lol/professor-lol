package com.css.professorlol.match.dto.match;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RuneDto {
    private Integer runeId;
    private Integer rank;
}
