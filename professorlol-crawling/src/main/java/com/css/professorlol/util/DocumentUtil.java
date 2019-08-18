package com.css.professorlol.util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;

/**
 * Document : 하나의 html 문서
 */

public class DocumentUtil {

    private final static String CHARSET_KOREAN = "UTF-8";

    public static Document convertFromUrlConnection(String url) {
        try {
            return Jsoup.connect(url).get();
        } catch (IOException e) {
            throw new RuntimeException("jsoup connection 오류");
        }
    }

    public static Document convertFromHtmlFile(File htmlFile) {
        try {
            return Jsoup.parse(htmlFile, CHARSET_KOREAN);
        } catch (IOException e) {
            throw new RuntimeException("jsoup html file parsing exception");
        }
    }

}
