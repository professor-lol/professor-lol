package com.css.professorlol.dto.champion.ability.attribute;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;
import static support.DocumentTestUtil.convertFromHtmlFile;
import static support.DocumentTestUtil.getFileFromPath;

public class AttributeMapperTest {
    public static final String CHANGE_HTML_NAME = "AttributeChangeElements";
    public static final String REMOVE_HTML_NAME = "AttributeRemoveElements";
    public static final String NEW_HTML_NAME = "AttributeNewElements";

    @Test
    public void 하나의_Attribute_생성_확인_CHANGE() {
        Element select = beforeSetUpHtmlFile(CHANGE_HTML_NAME);
        Change change = AttributeMapper.convertChange(select);
        assertEquals("마나 소모량", change.getAttribute());
        assertEquals("60/70/80/90/100", change.getBeforeContent());
        assertEquals("40/55/70/85/100", change.getAfterContent());
    }

    @Test
    public void 하나의_Attribute_생성_확인_REMOVE() {
        Element select = beforeSetUpHtmlFile(REMOVE_HTML_NAME);
        Remove remove = AttributeMapper.convertRemove(select);
        assertEquals("탱탱볼 튀기기", remove.getAttribute());
        assertEquals("이제 퍼져나간 전이 표식이 적에게 피해를 입히지 않습니다.", remove.getContent());
    }

    @Test
    public void 하나의_Attribute_생성_확인_NEW() {
        Element select = beforeSetUpHtmlFile(NEW_HTML_NAME);
        New aNew = AttributeMapper.convertNew(select);
        assertEquals("멀리 멀리 퍼져라", aNew.getAttribute());
        assertEquals("이제 첫 번째 대상 주변의 적에게 항상 전이 표식을 남깁니다.", aNew.getContent());
    }

    private Element beforeSetUpHtmlFile(String attributeTypeFile) {
        File resourceFile = getFileFromPath(attributeTypeFile);
        Document document = convertFromHtmlFile(resourceFile);

        return document.child(0);
    }
}