package jsoupUtil;

import org.jsoup.select.Elements;

public class ElementContextUtil {

    public static String getTextFromElement(Elements elements) {
        return elements.isEmpty() ? "" : elements.text();
    }

    public static String getUrlFromElement(Elements elements) {
        return elements.isEmpty() ? "" : elements.attr("src");
    }
}
