import domain.champion.Champion;
import domain.champion.PatchChampion;
import org.junit.Test;

import java.io.IOException;


public class PatchNoteCrawlerTest {

    @Test
    public void id에_따른_크롤링_성공_객체생성_확인() throws IOException {
        PatchNoteCrawler patchNoteCrawler = new PatchNoteCrawlerImpl();

        PatchChampion patchChampion = patchNoteCrawler.getChampionPatchById((long) 262762);
        for (Champion champion : patchChampion.getChampions()) {
            System.out.println(champion.toString());
        }

    }
}