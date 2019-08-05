package jsoupUtil;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;

/**
 * Document : 하나의 html 문서
 */

public class DocumentUtil {

    private final static String CHARSET_KOREAN = "UTF-8";

    public static Document convertFromUrlConnection(String url) throws IOException {
        return Jsoup.connect(url).get();
    }

    public static Document convertFromHtmlString(String htmlString) {
        return Jsoup.parse(htmlString);
    }

    public static Document convertFromHtmlFile(File htmlFile) throws IOException {
        return Jsoup.parse(htmlFile, CHARSET_KOREAN);
    }

}
