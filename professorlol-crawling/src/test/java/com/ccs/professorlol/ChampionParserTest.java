package com.ccs.professorlol;

import com.ccs.professorlol.parser.ChampionParser;
import org.jsoup.nodes.Document;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;
import static support.DocumentTestUtil.convertFromHtmlFile;
import static support.DocumentTestUtil.getFileFromPath;

public class ChampionParserTest {

    public static final String CHAMPION_FACTORY_PATCH_FILE = "PatchNote_9_12.html";

    private Document document;

    @Before
    public void setUp() {
        File resourceFile = getFileFromPath(CHAMPION_FACTORY_PATCH_FILE);
        document = convertFromHtmlFile(resourceFile);
    }

    @Test
    public void 여러개의_Champion_생성_확인() {
        ChampionParser championParser = new ChampionParser();
        assertEquals(18, championParser.parse(document).size());
    }
}