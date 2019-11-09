package com.ccs.professorlol.dto.champion.ability.attribute;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
enum AttributeSelector {

    ATTRIBUTE(".attribute"),
    BEFORE(".attribute-before"),
    AFTER(".attribute-after"),
    REMOVE(".attribute-removed"),
    ATTRIBUTE_EXTRA(".attribute span");

    private final String cssQuery;
}
