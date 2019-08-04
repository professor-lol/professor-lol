package com.ccs.crawler.parser;

import com.ccs.crawler.domain.champion.PatchChampion;

// 라이브러리 만들 듯이
// 외부환경을 로컬환경으로 임베디드 테스팅
// 크롤러 테스트코드

public interface Parser {
    PatchChampion parse(Long id);
}
