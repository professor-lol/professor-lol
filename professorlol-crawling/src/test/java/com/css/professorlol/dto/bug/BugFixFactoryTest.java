package com.css.professorlol.dto.bug;

import org.jsoup.nodes.Document;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import  java.util.List;
import static org.junit.Assert.*;
import static support.DocumentTestUtil.convertFromHtmlFile;
import static support.DocumentTestUtil.getFileFromPath;

public class BugFixFactoryTest {
    private Document document;
    public static final String CHAMPION_FACTORY_PATCH_FILE = "PatchNote_9_16.html";

    @Before
    public void setUp() throws IOException {
        File resourceFile = getFileFromPath(CHAMPION_FACTORY_PATCH_FILE);
        document = convertFromHtmlFile(resourceFile);
    }

    @Test
    public void getBugFixes() {
        BugFixFactory bugFixFactory = new BugFixFactory(document);
        List<BugFix> bugFixes = bugFixFactory.getBugFixes();
        assertEquals(bugFixes.get(0).getContext(),"나르가 미니언에게 도약하기 전 R - 나르!로 변신한 후 E - 폴짝의 방향을 바꿀 수 있었던 버그를 수정했습니다.");
        assertEquals(bugFixes.get(1).getContext(),"오리아나의 명령: 보호가 걸린 아군이 오리아나를 중심으로 하는 구체 거리 표시를 볼 수 없는 버그를 수정했습니다.");
        assertEquals(bugFixes.get(2).getContext(),"말자하의 R - 황천의 손아귀가 대상에게 발각됨 표식을 나타내지 않는 버그를 수정했습니다(은신한 대상 포함).");

    }

}