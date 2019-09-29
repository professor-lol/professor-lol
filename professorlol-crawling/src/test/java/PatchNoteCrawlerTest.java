import com.ccs.professorlol.PatchNoteCrawler;
import com.ccs.professorlol.RiotPageJsoupConnection;
import com.ccs.professorlol.RiotPagePatchNoteCrawler;
import com.ccs.professorlol.RiotPageProperties;
import com.ccs.professorlol.dto.champion.Champion;
import com.ccs.professorlol.dto.champion.ChampionFactory;
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

        List<Champion> champions = patchNoteCrawler.findChampionPatchById(PATCH_NOTE_0912_ID);
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
        ChampionFactory championFactory = new ChampionFactory(document);
        //then
        assertEquals(18, championFactory.getChampions().size());
    }


}