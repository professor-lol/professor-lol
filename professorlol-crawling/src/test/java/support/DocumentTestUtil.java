package support;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;

/**
 * Document : 하나의 html 문서
 */

public class DocumentTestUtil {

    private final static String CHARSET_KOREAN = "UTF-8";
    private final static String DIRECTORY_NAME = "support/";

    public static Document convertFromHtmlFile(File htmlFile) {
        try {
            return Jsoup.parse(htmlFile, CHARSET_KOREAN);
        } catch (IOException e) {
            throw new RuntimeException("jsoup html file parsing exception");
        }
    }

    public static File getFileFromPath(String fileName) {
        return new File(DocumentTestUtil.class.getClassLoader().getResource(DIRECTORY_NAME + fileName).getFile());
    }
}
