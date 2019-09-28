package com.css.professorlol;

import com.css.professorlol.dto.bug.BugFix;
import org.jsoup.nodes.Document;
import java.util.List;

public interface BugFixPatchCrawler {
    List<BugFix> findBugFixPatchByDocument(Document document);//일단 파싱하는 부분만
}
