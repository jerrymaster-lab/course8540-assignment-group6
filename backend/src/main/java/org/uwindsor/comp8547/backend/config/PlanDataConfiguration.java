package org.uwindsor.comp8547.backend.config;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.uwindsor.comp8547.backend.bean.Plan;
import org.uwindsor.comp8547.backend.bean.PlanDataSet;
import org.uwindsor.comp8547.backend.bean.XfinityPlan;

import java.io.FileReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Configuration
public class PlanDataConfiguration {
    private final Gson gson = new Gson();

    @Bean
    public PlanDataSet configurePlanData() {
        PlanDataSet planData = new PlanDataSet();
        List<Plan> plans = new ArrayList<>();
        planData.setPlans(plans);

        plans.addAll(loadXfinityPlans());
        return planData;
    }

    private List<Plan> loadXfinityPlans() {
        try {
            // 读取文件
            Reader reader = new FileReader("src/main/resources/plans/xfinity.json");

            // 定义泛型类型
            Type planListType = new TypeToken<List<XfinityPlan>>(){}.getType();

            List<XfinityPlan> plans = gson.fromJson(reader, planListType);

            reader.close();
            return plans.stream().map(this::convertPlan).collect(Collectors.toList());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return List.of();
    }

    private Plan convertPlan(XfinityPlan xfinityPlan) {
        Plan plan = new Plan();
        plan.setName(xfinityPlan.getName());
        plan.setPrice(String.format("$%.2f/Mon.", xfinityPlan.getPrice()));
        plan.setDownload(xfinityPlan.getSpeedTier());
        plan.setUpload(xfinityPlan.getSpeedTier());
        plan.setVendor("Xfinity");
        plan.setAdditionalFeatures(String.join(", ", xfinityPlan.getAdditionalFeatures()));
        return plan;
    }

    public static void main(String[] args) {
        PlanDataConfiguration planDataConfiguration = new PlanDataConfiguration();
        List<Plan> plans = planDataConfiguration.loadXfinityPlans();
        // 打印验证
        for (Plan plan : plans) {
            System.out.println(plan);
        }
    }
}
