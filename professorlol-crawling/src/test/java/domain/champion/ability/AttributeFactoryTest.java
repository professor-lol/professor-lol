package domain.champion.ability;

import ch.qos.logback.classic.Logger;
import jsoupUtil.DocumentUtil;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Before;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;

import java.util.List;

import static org.junit.Assert.*;

public class AttributeFactoryTest {

    Elements select;

    @Before
    public void setUp() throws Exception {
        ClassPathResource resourceHTMLFile = new ClassPathResource("domain.champion.ability/AttributeElements");
        Document document = DocumentUtil.convertFromHtmlFile(resourceHTMLFile.getFile());
        select = document.selectFirst(".elt").children();
    }

    @Test
    public void ofChanges() {
        List<Change> changes = AttributeFactory.ofChanges(select);
        System.out.println(changes);
    }

    @Test
    public void ofRemoves() {
        List<Remove> removes = AttributeFactory.ofRemoves(select);
        System.out.println(removes);
    }

    @Test
    public void ofNews() {
        List<New> news = AttributeFactory.ofNews(select);
        System.out.println(news);
    }
}