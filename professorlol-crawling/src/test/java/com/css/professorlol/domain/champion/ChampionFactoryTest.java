package com.css.professorlol.domain.champion;

import com.css.professorlol.jsoupUtil.DocumentUtil;
import org.jsoup.nodes.Document;
import org.junit.Before;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;

import static org.junit.Assert.assertEquals;

public class ChampionFactoryTest {

    public static final String CHAMPION_PATCH_FILE = "com/css/professorlol/PatchNote_9_12.html";

    private Document document;

    @Before
    public void setUp() throws Exception {
        ClassPathResource resourceHTMLFile = new ClassPathResource(CHAMPION_PATCH_FILE);
        document = DocumentUtil.convertFromHtmlFile(resourceHTMLFile.getFile());

    }

    @Test
    public void 여러개의_Champion_생성_확인() {
        ChampionFactory championFactory = new ChampionFactory(document);
        assertEquals(18, championFactory.getChampions().size());
    }
}