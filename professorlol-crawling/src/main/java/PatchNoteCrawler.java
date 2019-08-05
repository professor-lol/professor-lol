import domain.champion.PatchChampion;

import java.io.IOException;

public interface PatchNoteCrawler {

    PatchChampion getChampionPatchById(Long id) throws IOException;


}
