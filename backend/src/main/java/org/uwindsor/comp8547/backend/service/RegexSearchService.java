package org.uwindsor.comp8547.backend.service;

import org.springframework.stereotype.Service;
import org.uwindsor.comp8547.backend.bean.Plan;
import org.uwindsor.comp8547.backend.bean.ReItem;

import java.util.List;

@Service
public class RegexSearchService {
    public List<ReItem> search(String searchType, String keyword) {
        if (!searchType.equalsIgnoreCase("email") && !searchType.equalsIgnoreCase("phone")) {
            return List.of();
        }

        ReItem reItem = new ReItem();
        reItem.setName("Google");
        reItem.setUrl("https://www.google.com");
        reItem.setResults(List.of("john@gmail.com", "lisi@gmail.com"));
        return List.of(reItem);
    }
}
