package com.ccs.professorlol.parser;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@Getter
@RequiredArgsConstructor
public enum ParserGroup {
    BUG_FIX_1PARSER(new BugFixParser()),
    NEW_CHAMP_PARSER(new NewChampionParser()),
    CHAMPION(new ChampionParser());

    private final PatchNoteParser patchNoteParser;

    public static <T> T findByParserType(Class<T> type) {
        return type.cast(Arrays.stream(ParserGroup.values())
                .filter(parserGroup -> parserGroup.getPatchNoteParser().getClass() == type)
                .findFirst()
                .orElseThrow(RuntimeException::new)
                .getPatchNoteParser());
    }
}


