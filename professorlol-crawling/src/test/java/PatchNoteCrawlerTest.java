import com.css.professorlol.PatchNoteCrawler;
import com.css.professorlol.PatchNoteCrawlerImpl;
import com.css.professorlol.domain.champion.ChampionFactory;
import org.jsoup.nodes.Document;
import org.junit.Ignore;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static com.css.professorlol.util.DocumentUtil.convertFromHtmlFile;
import static com.css.professorlol.util.DocumentUtilTest.getFileFromPath;
import static org.junit.Assert.assertEquals;


public class PatchNoteCrawlerTest {

    private final String PATCH_NOTE_0912_HTML = "com/css/professorlol/PatchNote_9_12.html";
    private final long PATCH_NOTE_0912_ID = 262330;

    @Test
    @Ignore
    public void id에_따른_CONNECTION_크롤링_성공_객체생성_확인() {
        //given
        PatchNoteCrawler patchNoteCrawler = new PatchNoteCrawlerImpl();

        ChampionFactory championFactory = patchNoteCrawler.getChampionPatchById(PATCH_NOTE_0912_ID);
        //then
        assertEquals(18, championFactory.getChampions().size());
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