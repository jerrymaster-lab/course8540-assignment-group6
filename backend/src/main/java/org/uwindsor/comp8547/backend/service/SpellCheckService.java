package org.uwindsor.comp8547.backend.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpellCheckService {

    public List<String> check(String text) {
        return List.of("spell", "check", "service");
    }
}
