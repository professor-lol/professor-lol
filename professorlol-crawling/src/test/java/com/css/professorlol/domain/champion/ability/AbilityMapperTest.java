package com.css.professorlol.domain.champion.ability;

import com.css.professorlol.jsoupUtil.DocumentUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Before;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

import static com.css.professorlol.domain.champion.ability.attribute.AttributeFactoryTest.ATTRIBUTE_FILE_PATH;
import static org.junit.Assert.assertEquals;

public class AbilityMapperTest {

    public static final String ABILITY_FILE_PATH = "com/css/professorlol/domain/champion/ability/AbilityOneElement";


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

    @Test
    public void AbilityMapper의_인자_Attribute와_AttributeFactory에_사용되는_mock_대응() throws IOException {
        //given
        ClassPathResource resourceAbilityHTMLFile = new ClassPathResource(ABILITY_FILE_PATH);
        Document abilityDocument = DocumentUtil.convertFromHtmlFile(resourceAbilityHTMLFile.getFile());
        Element oneAbilityElement = abilityDocument.child(0);

        ClassPathResource resourceAttributeHTMLFile = new ClassPathResource(ATTRIBUTE_FILE_PATH);
        Document attributeDocument = DocumentUtil.convertFromHtmlFile(resourceAttributeHTMLFile.getFile());
        Element manyAttributeElement = attributeDocument.child(0);
        Elements attributeElements = manyAttributeElement.select(".attribute_change");

        //when

        //then
        assertEquals(oneAbilityElement.val(), attributeElements.val());
    }

}

