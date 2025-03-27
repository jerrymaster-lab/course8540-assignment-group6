package org.uwindsor.comp8547.backend.service;

import org.springframework.stereotype.Service;
import org.uwindsor.comp8547.backend.bean.TextItem;

import java.util.List;

@Service
public class TextSearchService {
    public List<TextItem> search(String searchType, String keyword) {
        if (!searchType.equalsIgnoreCase("text")) {
            return List.of();
        }
        TextItem textItem = new TextItem();
        textItem.setKeyword("Google");
        textItem.setUrl("https://www.google.com");
        textItem.setOccurrences(3);
        return List.of(textItem);
    }
}
