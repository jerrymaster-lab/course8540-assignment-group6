package org.uwindsor.comp8547.backend.bean;

import lombok.Data;

@Data
public class Plan {
    /**
     * Name of the plan e.g., Starter, Popular, Premium
     */
    private String name;

    /**
     * Vendor name e.g., Bell, Rogers, TekSavvy
     */
    private String vendor;

    /**
     * Price in CAD e.g., $50, $80, $100
     */
    private String price;

    /**
     * Data cap in GB e.g., 100 GB, 500 GB, unlimited
     */
    private String download;

    /**
     * Speed tier e.g., 10 Mbps, 50 Mbps, 100 Mbps, 1 Gbps
     */
    private String upload;

    /**
     * Additional features e.g., customer support, contracts, early termination fees
     */
    private String additionalFeatures;

    /**
     * Special service e.g., bundle offers with TV or phone, free installation, modem/router rental
     */
    private String specialService;

}
