package com.css.professorlol.domain.champion;

import com.css.professorlol.util.DocumentUtil;
import org.jsoup.nodes.Document;
import org.junit.Before;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;

import java.io.File;

import static com.css.professorlol.util.DocumentUtil.convertFromHtmlFile;
import static com.css.professorlol.util.DocumentUtilTest.getFileFromPath;
import static org.junit.Assert.assertEquals;

public class ChampionFactoryTest {

    public static final String CHAMPION_FACTORY_PATCH_FILE = "com/css/professorlol/PatchNote_9_12.html";

    private Document document;

    @Before
    public void setUp() {
        File resourceFile = getFileFromPath(CHAMPION_FACTORY_PATCH_FILE);
        document = convertFromHtmlFile(resourceFile);
    }

    @Test
    public void 여러개의_Champion_생성_확인() {
        ChampionFactory championFactory = new ChampionFactory(document);
        assertEquals(18, championFactory.getChampions().size());
    }


}