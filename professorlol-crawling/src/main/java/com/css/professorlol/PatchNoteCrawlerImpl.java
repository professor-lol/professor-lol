package com.css.professorlol;

import com.css.professorlol.domain.champion.Champion;
import com.css.professorlol.domain.champion.ChampionFactory;
import org.jsoup.nodes.Document;

import java.util.List;

import static com.css.professorlol.util.DocumentUtil.convertFromUrlConnection;

public class PatchNoteCrawlerImpl implements PatchNoteCrawler {
    public static final String PATCH_NOTE_QUERY = "?m=news&cate=update&mod=view&schwrd=&p=2&idx=%d#.XUWOZugzZPZ";
    private RiotPageProperties riotPageProperties;

    public PatchNoteCrawlerImpl(RiotPageProperties riotPageProperties) {
        this.riotPageProperties = riotPageProperties;
    }

    @Override
    public List<Champion> getChampionPatchById(Long id) {
        String completeURL = riotPageProperties.getHost() + String.format(PATCH_NOTE_QUERY, id);
        Document document = convertFromUrlConnection(completeURL);
        return new ChampionFactory(document).getChampions();
    }
}
