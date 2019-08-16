import com.css.professorlol.PatchNoteCrawler;
import com.css.professorlol.PatchNoteCrawlerImpl;
import com.css.professorlol.domain.champion.Champion;
import com.css.professorlol.domain.champion.ChampionFactory;
import org.junit.Test;

import java.io.IOException;


public class PatchNoteCrawlerTest {

    @Test
    public void id에_따른_크롤링_성공_객체생성_확인() throws IOException {
        PatchNoteCrawler patchNoteCrawler = new PatchNoteCrawlerImpl();

        ChampionFactory championFactory = patchNoteCrawler.getChampionPatchById((long) 262762);
        for (Champion champion : championFactory.getChampions()) {
            System.out.println(champion.toString());
        }

    }
}