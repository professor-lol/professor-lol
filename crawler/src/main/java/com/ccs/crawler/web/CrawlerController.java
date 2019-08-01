package com.ccs.crawler.web;

import com.ccs.crawler.domain.champion.PatchChampion;
import com.ccs.crawler.parser.JsoupParser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;


@RestController
public class CrawlerController {

    public static String testURL = "https://www.leagueoflegends.co.kr/?m=news&cate=update&mod=view&schwrd=&p=2&idx=262456#.XUWOZugzZPZ";

    public static void main(String args[]) throws IOException {
        Document document = Jsoup.connect(testURL).get();
        JsoupParser jsoupParser = new JsoupParser(document);
        List<String> list = jsoupParser.list(".content-border .patch-change-block");
        // champion 정보만 가져올 때 id 값 enum

        for (String str : list) {
            System.out.println(str);
        }

        System.out.println();
        PatchChampion patchChampion = new PatchChampion(jsoupParser.list(".content-border"));
    }

    //오잉 왜 스프링이 안뜨지??
    public void getPatchNoteCrawling(@RequestParam String url) throws IOException {
        Document document = Jsoup.connect(url).get();
        JsoupParser jsoupParser = new JsoupParser(document);
        PatchChampion patchChampion = new PatchChampion(jsoupParser.list(".content-border"));
    }

    public void getEditPatchNoteCrawling(String url) {

    }
}
