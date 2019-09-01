package com.css.professorlol;

import lombok.RequiredArgsConstructor;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

@RequiredArgsConstructor
public class RiotPageJsoupConnection {

    private final RiotPageProperties riotPageProperties;

    public Document getForDocument(String url) {
        try {
            return Jsoup.connect(riotPageProperties.getHost() + url)
                    .timeout(riotPageProperties.getTimeout())
                    .get();
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
