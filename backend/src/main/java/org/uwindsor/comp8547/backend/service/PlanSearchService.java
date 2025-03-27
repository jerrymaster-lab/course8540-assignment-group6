package org.uwindsor.comp8547.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.uwindsor.comp8547.backend.bean.Plan;
import org.uwindsor.comp8547.backend.bean.PlanDataSet;

import java.util.List;

@Service
public class PlanSearchService {
    @Autowired
    private PlanDataSet planDataSet;

    public List<Plan> search(String searchType, String keyword) {
        if (!searchType.equalsIgnoreCase("Plan")) {
            return List.of();
        }
        return planDataSet.getPlans().stream().filter(plan ->
                containsIgnoreCase(plan.getName(), keyword)
                        || containsIgnoreCase(plan.getDownload(), keyword)
                        || containsIgnoreCase(plan.getUpload(), keyword)
                        || containsIgnoreCase(plan.getPrice(), keyword)
                        || containsIgnoreCase(plan.getVendor(), keyword)
                        || containsIgnoreCase(plan.getSpecialService(), keyword)
                        || containsIgnoreCase(plan.getAdditionalFeatures(), keyword)
        ).toList();
    }

    public boolean containsIgnoreCase(String str, String subString) {
        return str != null && str.toLowerCase().contains(subString.toLowerCase());
    }
}
