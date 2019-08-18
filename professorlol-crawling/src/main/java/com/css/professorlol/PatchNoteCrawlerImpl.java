package com.css.professorlol;

import com.css.professorlol.domain.champion.ChampionFactory;
import org.jsoup.nodes.Document;

import static com.css.professorlol.util.DocumentUtil.convertFromUrlConnection;

public class PatchNoteCrawlerImpl implements PatchNoteCrawler {

    private static String BASE_URL_FRONT = "https://www.leagueoflegends.co.kr/?m=news&cate=update&mod=view&schwrd=&p=2&idx=";
    private static String BASE_URL_BACK = "#.XUWOZugzZPZ";
//    262762

    @Override
    public ChampionFactory getChampionPatchById(Long id) {
        String completeURL = BASE_URL_FRONT + id + BASE_URL_BACK;
        Document document = convertFromUrlConnection(completeURL);
        return new ChampionFactory(document);
    }
}
