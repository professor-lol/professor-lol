package com.css.professorlol.domain.champion.ability;

import com.css.professorlol.jsoupUtil.DocumentUtil;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Before;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;

import static org.junit.Assert.assertEquals;

public class AbilityMapperTest {

    public final static String ABILITY_FILE_PATH = "domain/champion/ability/AbilityOneElement";

    Elements select;

    @Before
    public void setUp() throws Exception {
        ClassPathResource resourceHTMLFile = new ClassPathResource(ABILITY_FILE_PATH);
        Document document = DocumentUtil.convertFromHtmlFile(resourceHTMLFile.getFile());
        select = document.children();
    }

    @Test
    public void 하나의_Ability_생성_확인() {
        Ability ability = AbilityMapper.of(select);
        assertEquals("W - 룬 감옥", ability.getTitle());
        assertEquals("./PatchNote_9_12_files/image(4)", ability.getImage());
        assertEquals(2, ability.getRemoves().size());
        assertEquals(1, ability.getNews().size());
        assertEquals(2, ability.getChanges().size());
    }

}

