package com.css.professorlol.domain.champion.ability.attribute;

import com.css.professorlol.jsoupUtil.DocumentUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class AttributeMapperTest {

    public static final String ATTRIBUTE_DIRECTORY_PATH = "com/css/professorlol/domain/champion/ability/attribute/";

    public static final String CHANGE_HTML_NAME = "AttributeChangeElements";
    public static final String REMOVE_HTML_NAME = "AttributeRemoveElements";
    public static final String NEW_HTML_NAME = "AttributeNewElements";

    @Test
    public void 하나의_Attribute_생성_확인_CHANGE() throws IOException {
        Element select = beforeSetUpHtmlFile(CHANGE_HTML_NAME);
        Change change = AttributeMapper.ofChange(select);
        assertEquals("마나 소모량", change.getAttribute());
        assertEquals("60/70/80/90/100", change.getBeforeContent());
        assertEquals("40/55/70/85/100", change.getAfterContent());
    }

    @Test
    public void 하나의_Attribute_생성_확인_REMOVE() throws IOException {
        Element select = beforeSetUpHtmlFile(REMOVE_HTML_NAME);
        Remove remove = AttributeMapper.ofRemove(select);
        assertEquals("탱탱볼 튀기기", remove.getAttribute());
        assertEquals("이제 퍼져나간 전이 표식이 적에게 피해를 입히지 않습니다.", remove.getContent());
    }

    @Test
    public void 하나의_Attribute_생성_확인_NEW() throws IOException {
        Element select = beforeSetUpHtmlFile(NEW_HTML_NAME);
        New aNew = AttributeMapper.ofNew(select);
        assertEquals("멀리 멀리 퍼져라", aNew.getAttribute());
        assertEquals("이제 첫 번째 대상 주변의 적에게 항상 전이 표식을 남깁니다.", aNew.getContent());
    }

    private Element beforeSetUpHtmlFile(String attributeTypeFile) throws IOException {
        ClassPathResource resourceHTMLFile = new ClassPathResource(ATTRIBUTE_DIRECTORY_PATH + attributeTypeFile);
        Document document = DocumentUtil.convertFromHtmlFile(resourceHTMLFile.getFile());
        return document.child(0);
    }
}