package com.css.professorlol.domain.champion.ability;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.List;

import static com.css.professorlol.util.DocumentUtil.convertFromHtmlFile;
import static com.css.professorlol.util.DocumentUtilTest.getFileFromPath;
import static org.junit.Assert.assertEquals;

public class AbilityFactoryTest {

    public static final String ABILITY_FACTORY_FILE_PATH = "com/css/professorlol/domain/champion/ability/AbilityElements";

    Element select;

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