package com.css.professorlol;

import com.css.professorlol.dto.bug.BugFix;
import com.css.professorlol.dto.bug.BugFixFactory;
import java.util.List;

import org.jsoup.nodes.Document;

public class RiotPageBugFixCrawler implements BugFixPatchCrawler {
    @Override
    public List<BugFix> findBugFixPatchByDocument(Document document) {
        return new BugFixFactory(document).getBugFixes();
    }
}
