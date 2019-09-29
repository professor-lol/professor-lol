package com.ccs.professorlol.dto.champion.ability;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static support.DocumentTestUtil.convertFromHtmlFile;
import static support.DocumentTestUtil.getFileFromPath;

public class AbilityFactoryTest {

    public static final String ABILITY_FACTORY_FILE_PATH = "AbilityElements";

    private Element select;

    @Before
    public void setUp() {
        File resourceFile = getFileFromPath(ABILITY_FACTORY_FILE_PATH);
        Document document = convertFromHtmlFile(resourceFile);
        select = document.child(0);
    }

    @Test
    public void 여러개의_Ability_생성_확인() {
        List<Ability> abilities = AbilityFactory.of(select);
        assertEquals(5, abilities.size());
    }
}