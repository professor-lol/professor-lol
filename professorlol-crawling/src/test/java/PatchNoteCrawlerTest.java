<<<<<<< HEAD
import com.ccs.professorlol.crawler.*;
import com.ccs.professorlol.dto.champion.Champion;
import com.ccs.professorlol.dto.champion.ChampionFactory;
=======
import com.css.professorlol.PatchNoteCrawler;
import com.css.professorlol.RiotPageJsoupConnection;
import com.css.professorlol.RiotPagePatchNoteCrawler;
import com.css.professorlol.RiotPageProperties;
import com.css.professorlol.dto.champion.Champion;
import com.css.professorlol.dto.champion.ChampionParser;
>>>>>>> 리뷰 반영
import org.jsoup.nodes.Document;
import org.junit.Ignore;
import org.junit.Test;

import java.io.File;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static support.DocumentTestUtil.convertFromHtmlFile;
import static support.DocumentTestUtil.getFileFromPath;


public class PatchNoteCrawlerTest {

    private static final String PATCH_NOTE_0912_HTML = "PatchNote_9_12.html";
    private static final long PATCH_NOTE_0912_ID = 262330;

    @Test
    @Ignore
    public void id에_따른_CONNECTION_크롤링_성공_객체생성_확인() {
        //given
        PatchNoteCrawler patchNoteCrawler = new RiotPagePatchNoteCrawler(createJsoupConnection());

        PatchResponseDto<Champion> patchResponseDtos = patchNoteCrawler.findChampionPatchById(PATCH_NOTE_0912_ID);
        List<Champion> champions = patchResponseDtos.getPatch();

        //then
        assertEquals(18, champions.size());
    }

    private RiotPageJsoupConnection createJsoupConnection() {
        RiotPageProperties riotMockProperties = new RiotPageProperties();
        return new RiotPageJsoupConnection(riotMockProperties);
    }

    @Test
    public void html_로_크롤링_성공_객체생성_확인() {
        //given
        File resourceFile = getFileFromPath(PATCH_NOTE_0912_HTML);
        Document document = convertFromHtmlFile(resourceFile);
        ChampionParser championParser = new ChampionParser(document);
        //then
        assertEquals(18, championParser.getChampions().size());
    }


}