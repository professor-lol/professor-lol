package com.ccs.professorlol;

import com.ccs.professorlol.dto.champion.Champion;
import com.ccs.professorlol.dto.champion.ChampionFactory;
import lombok.RequiredArgsConstructor;
import org.jsoup.nodes.Document;

import java.util.List;

@RequiredArgsConstructor
public class RiotPagePatchNoteCrawler implements PatchNoteCrawler {
    public static final String PATCH_NOTE_QUERY = "?m=news&cate=update&mod=view&schwrd=&p=2&idx=%d#.XUWOZugzZPZ";
    private final RiotPageJsoupConnection riotPageJsoupConnection;

    @Override
    public List<Champion> findChampionPatchById(Long id) {
        String url = String.format(PATCH_NOTE_QUERY, id);
        Document document = riotPageJsoupConnection.getForDocument(url);
        return new ChampionFactory(document).getChampions();
    }
}
