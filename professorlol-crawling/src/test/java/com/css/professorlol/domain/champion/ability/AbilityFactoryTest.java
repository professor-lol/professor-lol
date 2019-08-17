package com.css.professorlol.domain.champion.ability;

import com.css.professorlol.jsoupUtil.DocumentUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Before;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AbilityFactoryTest {

    public static final String ABILITY_FILE_PATH = "com/css/professorlol/domain/champion/ability/AbilityElements";


    Element select;

    @Before
    public void setUp() throws Exception {
        ClassPathResource resourceHTMLFile = new ClassPathResource(ABILITY_FILE_PATH);
        Document document = DocumentUtil.convertFromHtmlFile(resourceHTMLFile.getFile());
        select = document.child(0);
    }

    @Test
    public void 여러개의_Ability_생성_확인() {
        List<Ability> abilities = AbilityFactory.of(select);
        assertEquals(5, abilities.size());
    }
}