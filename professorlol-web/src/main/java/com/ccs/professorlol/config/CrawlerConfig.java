package com.ccs.professorlol.config;

import com.ccs.professorlol.crawler.PatchNoteCrawler;
import com.ccs.professorlol.crawler.RiotPageJsoupConnection;
import com.ccs.professorlol.crawler.RiotPagePatchNoteCrawler;
import com.ccs.professorlol.crawler.RiotPageProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CrawlerConfig {

    @Bean
    public PatchNoteCrawler patchNoteCrawler() {
        return new RiotPagePatchNoteCrawler(new RiotPageJsoupConnection(new RiotPageProperties()));
    }

}
