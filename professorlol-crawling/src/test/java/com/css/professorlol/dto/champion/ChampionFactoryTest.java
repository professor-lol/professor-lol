package com.css.professorlol.dto.champion;

import org.jsoup.nodes.Document;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static support.DocumentTestUtil.convertFromHtmlFile;
import static support.DocumentTestUtil.getFileFromPath;

public class ChampionFactoryTest {

    public static final String CHAMPION_FACTORY_PATCH_FILE = "PatchNote_9_12.html";

    private Document document;

    @Before
    public void setUp() throws IOException {
        File resourceFile = getFileFromPath(CHAMPION_FACTORY_PATCH_FILE);
        document = convertFromHtmlFile(resourceFile);
    }

    @Test
    public void 여러개의_Champion_생성_확인() {
        ChampionFactory championFactory = new ChampionFactory(document);
        assertEquals(18, championFactory.getChampions().size());
    }
}