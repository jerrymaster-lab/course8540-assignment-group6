package org.uwindsor.comp8547.backend.bean;

import lombok.Data;

@Data
public class TextItem {
    private String keyword;
    private String url;
    private int occurrences;
}
