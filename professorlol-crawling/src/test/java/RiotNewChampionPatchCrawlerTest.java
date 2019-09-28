import com.css.professorlol.RiotNewChampionPatchCrawler;
import com.css.professorlol.dto.champion.NewChampion;
import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.File;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static support.DocumentTestUtil.convertFromHtmlFile;
import static support.DocumentTestUtil.getFileFromPath;

public class RiotNewChampionPatchCrawlerTest {
    private static final String PATCH_NOTE_0916_HTML = "PatchNote_9_16.html";

    @Test
    public void Document_객체에서_크롤링되는것_확인() {
        //given
        File resourceFile = getFileFromPath(PATCH_NOTE_0916_HTML);
        Document document = convertFromHtmlFile(resourceFile);
        List<NewChampion> newChampions = new RiotNewChampionPatchCrawler().findNewChampionPatchByDocument(document);
        newChampions.forEach(newChampion -> System.out.println(newChampion.toString()));

        //then
        assertThat(newChampions.get(0).getLinkGroups().get(0).getContent(), is("판테온 게임플레이 미리보기"));
        assertThat(newChampions.get(0).getLinkGroups().get(0).getUrl(), is("https://www.youtube.com/watch?v=bQ1SbO21fc4"));
    }
}