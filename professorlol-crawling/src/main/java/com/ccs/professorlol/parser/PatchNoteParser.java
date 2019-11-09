package com.ccs.professorlol.parser;


import org.jsoup.nodes.Document;

import java.util.List;

public interface PatchNoteParser<T> {
    List<T> parse(Document document);
}
