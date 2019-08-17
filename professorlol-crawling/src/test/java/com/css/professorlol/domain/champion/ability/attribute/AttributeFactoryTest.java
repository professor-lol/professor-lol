package com.css.professorlol.domain.champion.ability.attribute;

import com.css.professorlol.jsoupUtil.DocumentUtil;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Before;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class AttributeFactoryTest {

    public final static String ATTRIBUTE_FILE_PATH = "com/css/professorlol/domain/champion/ability/attribute/AttributeAllElements";

    Elements select;

    @Before
    public void setUp() throws Exception {
        ClassPathResource resourceHTMLFile = new ClassPathResource(ATTRIBUTE_FILE_PATH);
        Document document = DocumentUtil.convertFromHtmlFile(resourceHTMLFile.getFile());
        select = document.children();
    }

    @Test
    public void 여러개의_NEW_attribute_생성_확인() {
        List<New> news = AttributeFactory.ofNews(select);
        assertEquals(news.size(), 1);
        assertEquals("멀리 멀리 퍼져라", news.get(0).getAttribute());
        assertEquals("이제 첫 번째 대상 주변의 적에게 항상 전이 표식을 남깁니다.", news.get(0).getContent());
    }

    @Test
    public void 여러개의_CHANGE_attribute_생성_확인() {
        List<Change> changes = AttributeFactory.ofChanges(select);
        assertEquals(changes.size(), 2);
        assertEquals("마나 소모량", changes.get(1).getAttribute());
        assertEquals("60/70/80/90/100", changes.get(1).getBeforeContent());
        assertEquals("40/55/70/85/100", changes.get(1).getAfterContent());
    }

    @Test
    public void 여러개의_REMOVED_attribute_생성_확인() {
        List<Remove> removes = AttributeFactory.ofRemoves(select);
        assertEquals(removes.size(), 2);
        assertEquals("전이된 폭탄", removes.get(1).getAttribute());
        assertEquals("이제 스킬을 사용해 전이 표식이 남은 적을 처치해도 " +
                        "주변의 모든 적에게 전이 표식을 남기지 않습니다.",
                removes.get(1).getContent());
    }


}