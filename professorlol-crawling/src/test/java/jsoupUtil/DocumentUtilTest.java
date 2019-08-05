package jsoupUtil;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class DocumentUtilTest {


    private final String ERROR_PAGE_FILE = "LoLNotExistPageError.html";
    private final String PATCH_FILE = "PatchNote_9_14.html";

    private final String PATCH_URL = "https://www.leagueoflegends.co.kr/?m=news&cate=update&mod=view&schwrd=&p=1&idx=262456#.XU6i8egzZPZ";
    private final String PATCH_URL_INVALID = "https://www.leagueoflegends.co.kr/?m=news&cate=update&mod=view&schwrd=&p=1&idx=262453#.XU6i8egzZPZ";

    @Ignore
    @Test
    public void URL_연결_성공_테스트() throws IOException {
        Document document = DocumentUtil.convertFromUrlConnection(PATCH_URL);
        assertNotNull(document);
    }

    @Test
    public void File_연결_성공_테스트() throws IOException {
        ClassPathResource resourceHTMLFile = new ClassPathResource(PATCH_FILE);
        Document document = DocumentUtil.convertFromHtmlFile(resourceHTMLFile.getFile());
        assertNotNull(document);
    }

    @Test
    public void File_Elements_변환_성공_테스트() throws IOException {
        ClassPathResource resourceHTMLFile = new ClassPathResource("domain.champion.ability/AttributeElements");
        Document document = DocumentUtil.convertFromHtmlFile(resourceHTMLFile.getFile());
        Elements select = document.select(".elt");
        assertNotNull(document);
    }


    @Ignore
    @Test
    public void URL_연결_실패_테스트() throws IOException {
        Document document = DocumentUtil.convertFromUrlConnection(PATCH_URL_INVALID);
        ClassPathResource resourceHTMLFile = new ClassPathResource(ERROR_PAGE_FILE);
        Document errorDocument = DocumentUtil.convertFromHtmlFile(resourceHTMLFile.getFile());
        assertThat(document.text(), is(errorDocument.text()));
    }



}