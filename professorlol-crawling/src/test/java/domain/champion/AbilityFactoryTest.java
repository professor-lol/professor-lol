package domain.champion;

import jsoupUtil.DocumentUtil;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Before;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;

import java.util.List;

public class AbilityFactoryTest {

    Elements select;

    @Before
    public void setUp() throws Exception {
        ClassPathResource resourceHTMLFile = new ClassPathResource("domain.champion.ability/AttributeElements");
        Document document = DocumentUtil.convertFromHtmlFile(resourceHTMLFile.getFile());
        select = document.selectFirst(".elt").children();
    }

    @Test
    public void of() {
        List<Ability> abilities = AbilityFactory.of(select);
        System.out.println(abilities);
    }
}