package org.uwindsor.comp8547.backend.bean;

import lombok.Data;

import java.util.List;

@Data
public class XfinityPlan {

    /**
     * Name of the plan e.g., Starter, Popular, Premium
     */
    private String name;

    /**
     * Price in CAD e.g., $50, $80, $100
     */
    private double price;

    /**
     * Data cap in GB e.g., 100 GB, 500 GB, unlimited
     */
    private String dataCap;

    /**
     * Speed tier e.g., 10 Mbps, 50 Mbps, 100 Mbps, 1 Gbps
     */
    private String speedTier;

    /**
     * Connection type e.g., fiber, cable, DSL, satellite
     */
    private String connectionType;

    /**
     * Special service e.g., bundle offers with TV or phone, free installation, modem/router rental
     */
    private String specialService;

    /**
     * Availability e.g., urban, suburban, rural
     */
    private String availability;

    /**
     * Additional features e.g., customer support, contracts, early termination fees
     */
    private List<String> additionalFeatures;
}
