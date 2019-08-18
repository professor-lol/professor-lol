package com.css.professorlol.domain.champion.ability;

import com.css.professorlol.util.DocumentUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static com.css.professorlol.domain.champion.ability.attribute.AttributeFactoryTest.ATTRIBUTE_FACTORY_FILE_PATH;
import static com.css.professorlol.util.DocumentUtil.convertFromHtmlFile;
import static com.css.professorlol.util.DocumentUtilTest.getFileFromPath;
import static org.junit.Assert.assertEquals;

public class AbilityMapperTest {

    public static final String ABILITY_MAPPER_FILE_PATH = "com/css/professorlol/domain/champion/ability/AbilityOneElement";


    Elements select;

    @Before
    public void setUp() {
        File resourceFile = getFileFromPath(ABILITY_MAPPER_FILE_PATH);
        Document document = convertFromHtmlFile(resourceFile);
        select = document.children();
    }

    @Test
    public void 하나의_Ability_생성_확인() {
        Ability ability = AbilityMapper.convert(select);
        assertEquals("W - 룬 감옥", ability.getTitle());
        assertEquals("./PatchNote_9_12_files/image(4)", ability.getImage());
        assertEquals(2, ability.getRemoves().size());
        assertEquals(1, ability.getNews().size());
        assertEquals(2, ability.getChanges().size());
    }

    @Test
    public void AbilityMapper의_인자_Attribute와_AttributeFactory에_사용되는_mock_대응() {
        //given
        File resourceAbilityHTMLFile = getFileFromPath(ABILITY_MAPPER_FILE_PATH);
        Document abilityDocument = convertFromHtmlFile(resourceAbilityHTMLFile);
        Element oneAbilityElement = abilityDocument.child(0);

        File resourceAttributeHTMLFile = getFileFromPath(ATTRIBUTE_FACTORY_FILE_PATH);
        Document attributeDocument = convertFromHtmlFile(resourceAttributeHTMLFile);
        Element manyAttributeElement = attributeDocument.child(0);
        Elements attributeElements = manyAttributeElement.select(".attribute_change");

        //when

        //then
        assertEquals(oneAbilityElement.val(), attributeElements.val());
    }

}

