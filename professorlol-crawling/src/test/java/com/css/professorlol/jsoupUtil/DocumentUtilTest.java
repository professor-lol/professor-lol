package com.css.professorlol.jsoupUtil;

import org.jsoup.nodes.Document;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DocumentUtilTest {


    private final String ERROR_PAGE_FILE = "com/css/professorlol/LoLNotExistPageError.html";
    private final String PATCH_FILE = "com/css/professorlol/PatchNote_9_12.html";

    private final String PATCH_URL = "https://www.leagueoflegends.co.kr/?m=news&cate=update&mod=view&schwrd=&p=1&idx=262330#.XU6i8egzZPZ";
    private final String PATCH_URL_INVALID = "https://www.leagueoflegends.co.kr/?m=news&cate=update&mod=view&schwrd=&p=1&idx=262453#.XU6i8egzZPZ";

//    @Ignore
    @Test
    public void URL_CONNECTION_성공_테스트() throws IOException {
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
    public void URL_연결_실패_테스트() throws IOException {
        Document document = DocumentUtil.convertFromUrlConnection(PATCH_URL_INVALID);
        ClassPathResource resourceHTMLFile = new ClassPathResource(ERROR_PAGE_FILE);
        Document errorDocument = DocumentUtil.convertFromHtmlFile(resourceHTMLFile.getFile());
        assertEquals(document.val(), errorDocument.val());
    }

}