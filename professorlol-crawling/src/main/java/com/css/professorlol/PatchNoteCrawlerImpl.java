package com.css.professorlol;

import com.css.professorlol.domain.champion.ChampionFactory;
import com.css.professorlol.jsoupUtil.DocumentUtil;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;

import static com.css.professorlol.jsoupUtil.DocumentUtil.convertFromUrlConnection;

public class PatchNoteCrawlerImpl implements PatchNoteCrawler {

    private static String BASE_URL_FRONT = "https://www.leagueoflegends.co.kr/?m=news&cate=update&mod=view&schwrd=&p=2&idx=";
    private static String BASE_URL_BACK = "#.XUWOZugzZPZ";
//    262762

    @Override
    public ChampionFactory getChampionPatchById(Long id) throws IOException {
        String completeURL = BASE_URL_FRONT + id + BASE_URL_BACK;
        Document document = convertFromUrlConnection(completeURL);
        return new ChampionFactory(document);
    }

    @Override
    public ChampionFactory getChampionPatchByHtml(File file) throws IOException {
        Document document = DocumentUtil.convertFromHtmlFile(file);
        return new ChampionFactory(document);
    }
}
