import com.css.professorlol.PatchNoteCrawler;
import com.css.professorlol.PatchNoteCrawlerImpl;
import com.css.professorlol.domain.champion.ChampionFactory;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

import static org.junit.Assert.assertEquals;


public class PatchNoteCrawlerTest {

    private final String PATCH_NOTE_0912_HTML = "com/css/professorlol/PatchNote_9_12.html";
    private final long PATCH_NOTE_0912_ID = 262330;
    PatchNoteCrawler patchNoteCrawler = new PatchNoteCrawlerImpl();

    @Test
//    @Ignore
    public void id에_따른_CONNECTION_크롤링_성공_객체생성_확인() throws IOException {
        //given
        ChampionFactory championFactory = patchNoteCrawler.getChampionPatchById(PATCH_NOTE_0912_ID);
        //then
        assertEquals(18, championFactory.getChampions().size());
    }

    @Test
    public void html_로_크롤링_성공_객체생성_확인() throws IOException {
        //given
        ClassPathResource resourceHTMLFile = new ClassPathResource(PATCH_NOTE_0912_HTML);
        ChampionFactory championFactory = patchNoteCrawler.getChampionPatchByHtml(resourceHTMLFile.getFile());
        //then
        assertEquals(18, championFactory.getChampions().size());
    }

    @Test
//    @Ignore
    public void id로_CONNECTION_하여_생성것과_html_로_생성한_객체가_같은지_확인() throws IOException {
        //given
        ChampionFactory championFactoryFromConnection = patchNoteCrawler.getChampionPatchById(PATCH_NOTE_0912_ID);
        ClassPathResource resourceHTMLFile = new ClassPathResource(PATCH_NOTE_0912_HTML);
        ChampionFactory championFactoryFromFile = patchNoteCrawler.getChampionPatchByHtml(resourceHTMLFile.getFile());
        //then
        assertEquals(championFactoryFromConnection.getChampions().size(),
                championFactoryFromFile.getChampions().size());

        // TODO : 객체마다 COMPARE Overriding
//        assertEquals(championFactoryFromConnection.getChampions().toString(),
//                championFactoryFromFile.getChampions().toString());

    }
}