package org.uwindsor.comp8547.backend.bean;

import lombok.Data;

import java.util.List;

@Data
public class ReItem {
    private String name;
    private String url;
    private List<String> results;
}
