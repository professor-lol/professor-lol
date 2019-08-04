package com.ccs.crawler.parser;

import com.ccs.crawler.domain.champion.PatchChampion;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

//@Getter
@Slf4j
public class JsoupParser implements Parser {
    private Document document;

    public JsoupParser(String htmlText) {
        this.document = Jsoup.parse(htmlText);
    }

    public JsoupParser(Document document) {
        this.document = document;
    }

    public Document getDocument() {
        return document;
    }

//    public void isElementsEmpty(Elements elements) {
//        if (elements == null || elements.size() == 0) {
////            log.warn("elements 가 없습니다");
//            System.out.println("elements 가 없습니다");
//            throw new RuntimeException();
//        }
//    }

    public boolean isElementsEmpty(Elements elements) {
        return elements == null || elements.size() == 0;
    }

    public String single(String cssSelector) {
        Elements elements = getDocument().select(cssSelector);
        String result = isElementsEmpty(elements) ? "" : getValue(elements.get(0), null);
        return result;
    }

    public String single(String cssSelector, String attrName) {
        Elements elements = getDocument().select(cssSelector);
        String result = isElementsEmpty(elements) ? "" : getValue(elements.get(0), attrName);
        return result;
    }

    public List<String> list(String cssSelector) {
        List<String> responseList = new ArrayList<String>();
        Elements elements = getDocument().select(cssSelector);
        if (!isElementsEmpty(elements)) {
            for (Element e : elements) {
                responseList.add(getValue(e, null));
            }
        }
        return responseList;
    }

    public List<String> list(String cssSelector, String attrName) {
        List<String> responseList = new ArrayList<String>();
        Elements elements = getDocument().select(cssSelector);
        if (!isElementsEmpty(elements)) {
            for (Element e : elements) {
                responseList.add(getValue(e, attrName));
            }
        }
        return responseList;
    }


    private String getValue(Element element, String attrName) {
        if (attrName == null) {
            return element.outerHtml();
        } else if ("innerHtml".equalsIgnoreCase(attrName)) {
            return element.html();
        } else if ("text".equalsIgnoreCase(attrName)) {
            return getText(element);
        } else if ("allText".equalsIgnoreCase(attrName)) {
            return element.text();
        } else {
            return element.attr(attrName);
        }
    }

    protected String getText(Element element) {
        StringBuilder accum = new StringBuilder();
        for (Node node : element.childNodes()) {
            if (node instanceof TextNode) {
                TextNode textNode = (TextNode) node;
                accum.append(textNode.text());
            }
        }
        return accum.toString();
    }

    public Element element(String cssSelector) {
        Elements elements = getDocument().select(cssSelector);
        Element result = isElementsEmpty(elements) ? null : elements.get(0);
        return result;
    }

    public Elements elements(String cssSelector) {
        Elements elements = getDocument().select(cssSelector);
        return elements;
    }

    @Override
    public PatchChampion parse(Long id) {
        return null;
    }

//    public String script(String cssSelector) {
//        return single(cssSelector,Const.CssAttr.innerHtml.name());
//    }
//    public List<String> scripts(String cssSelector) {
//        return list(cssSelector,Const.CssAttr.innerHtml.name());
//    }


}
