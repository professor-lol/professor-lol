package com.ccs.professorlol.crawler;

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
    public PatchResponseDto<Champion> findChampionPatchById(Long id) {
        String url = String.format(PATCH_NOTE_QUERY, id);
        Document document = riotPageJsoupConnection.getForDocument(url);
        String version = "123"; //TODO : 버전 가져오는 클래스 필요
        // 수정된 버전일 경우의 밸리데이션 체크 로직이 필요할 듯
        List<Champion> champions = new ChampionFactory(document).getChampions();
        return new PatchResponseDto<>(version, champions);
    }
}
