package com.ccs.professorlol.dto.champion.ability.attribute;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static support.DocumentTestUtil.convertFromHtmlFile;
import static support.DocumentTestUtil.getFileFromPath;


public class AttributeParserTest {

    public final static String ATTRIBUTE_FACTORY_FILE_PATH = "AttributeAllElements";

    private Elements select;

    @Before
    public void setUp() {
        File resourceFile = getFileFromPath(ATTRIBUTE_FACTORY_FILE_PATH);
        Document document = convertFromHtmlFile(resourceFile);

        select = document.children();
    }

    @Test
    public void 여러개의_NEW_attribute_생성_확인() {
        List<Attribute> attributes = AttributeParser.parse(select);
        List<AttributeType> attributeTypes = attributes.stream().map(Attribute::getAttributeType).collect(Collectors.toList());

        assertEquals(attributes.size(), 6);
        assertType(attributeTypes, 2, AttributeType.NEW);
        assertType(attributeTypes, 2, AttributeType.REMOVE);
        assertType(attributeTypes, 2, AttributeType.CHANGE);
    }

    private void assertType(List<AttributeType> attributeTypes, int count, AttributeType type) {
        int result = 0;
        for (int i = 0; i < attributeTypes.size(); i++) {
            if (attributeTypes.get(i) == type) {
                result++;
            }
        }
        assertEquals(count, result);
    }


}