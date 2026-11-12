package com.example.iphoneqcstore.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "warranty_packages")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WarrantyPackage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "package_id")
    private Integer packageId;

    @Column(name = "package_name", nullable = false, length = 100)
    private String packageName;

    @Column(name = "duration_months", nullable = false)
    private Integer durationMonths;

    @Column(name = "coverage_terms", columnDefinition = "NVARCHAR(MAX)")
    private String coverageTerms;

    @Column(name = "quality_tier_applied", length = 10)
    private String qualityTierApplied;
}