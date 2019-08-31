import com.css.professorlol.PatchNoteCrawler;
import com.css.professorlol.PatchNoteCrawlerImpl;
import com.css.professorlol.RiotPageProperties;
import com.css.professorlol.domain.champion.Champion;
import com.css.professorlol.domain.champion.ChampionFactory;
import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.File;
import java.util.List;

import static com.css.professorlol.util.DocumentUtil.convertFromHtmlFile;
import static com.css.professorlol.util.DocumentUtilTest.getFileFromPath;
import static org.junit.Assert.assertEquals;


public class PatchNoteCrawlerTest {

    private static final String PATCH_NOTE_0912_HTML = "com/css/professorlol/PatchNote_9_12.html";
    private static final long PATCH_NOTE_0912_ID = 262330;

    @Test
    public void id에_따른_CONNECTION_크롤링_성공_객체생성_확인() {
        //given
        PatchNoteCrawler patchNoteCrawler = new PatchNoteCrawlerImpl(new RiotPageProperties());

        List<Champion> champions = patchNoteCrawler.getChampionPatchById(PATCH_NOTE_0912_ID);
        //then
        assertEquals(18, champions.size());
    }

    @Test
    public void html_로_크롤링_성공_객체생성_확인()  {
        //given
        File resourceFile = getFileFromPath(PATCH_NOTE_0912_HTML);
        Document document = convertFromHtmlFile(resourceFile);
        ChampionFactory championFactory = new ChampionFactory(document);
        //then
        assertEquals(18, championFactory.getChampions().size());
    }
}