package com.ccs.professorlol.config;

import com.ccs.professorlol.PatchNoteCrawler;
import com.ccs.professorlol.RiotPageJsoupConnection;
import com.ccs.professorlol.RiotPagePatchNoteCrawler;
import com.ccs.professorlol.RiotPageProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CrawlerConfig {

    @Bean
    public PatchNoteCrawler patchNoteCrawler() {
        return new RiotPagePatchNoteCrawler(new RiotPageJsoupConnection(new RiotPageProperties()));
    }

}
