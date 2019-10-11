import com.css.professorlol.RiotPageBugFixCrawler;
import java.util.List;

import com.css.professorlol.dto.bug.BugFix;
import com.css.professorlol.dto.bug.BugFixParser;
import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.File;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static support.DocumentTestUtil.convertFromHtmlFile;
import static support.DocumentTestUtil.getFileFromPath;


public class RiotPageBugFixCrawlerTest {
    private final String PATCH_NOTE_0916_HTML = "PatchNote_9_16.html";
    private final String PATCH_NOTE_0916_HTML_EXCLUDE_BUG = "PatchNote_9_16_Exclude_Bug.html";

    @Test
    public void Document_객체에서_크롤링되는것_확인() {
        //given
        File resourceFile = getFileFromPath(PATCH_NOTE_0916_HTML);
        Document document = convertFromHtmlFile(resourceFile);
        List<BugFix> bugFixes = new RiotPageBugFixCrawler(new BugFixParser(document)).findBugFixPatchByDocument(document);
        bugFixes.stream()
                .forEach(bugFix -> System.out.println(bugFix.getContext()));
        assertEquals(bugFixes.get(0).getContext(),"나르가 미니언에게 도약하기 전 R - 나르!로 변신한 후 E - 폴짝의 방향을 바꿀 수 있었던 버그를 수정했습니다.");
        assertEquals(bugFixes.get(1).getContext(),"오리아나의 명령: 보호가 걸린 아군이 오리아나를 중심으로 하는 구체 거리 표시를 볼 수 없는 버그를 수정했습니다.");
        assertEquals(bugFixes.get(2).getContext(),"말자하의 R - 황천의 손아귀가 대상에게 발각됨 표식을 나타내지 않는 버그를 수정했습니다(은신한 대상 포함).");
    }

    @Test
    public void 버그패치가_없는_경우_빈_리스트_출력되는것_확인(){
        File resourceFile = getFileFromPath(PATCH_NOTE_0916_HTML_EXCLUDE_BUG);
        Document document = convertFromHtmlFile(resourceFile);
        List<BugFix> bugFixes = new RiotPageBugFixCrawler(new BugFixParser(document)).findBugFixPatchByDocument(document);
        assertThat(bugFixes.size(), is(0));
    }
}