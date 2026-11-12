package com.example.iphoneqcstore.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "warranty_requests")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WarrantyRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "request_id")
    private Integer requestId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "card_id", nullable = false)
    private EWarrantyCard eWarrantyCard;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "reported_fault_description", columnDefinition = "NVARCHAR(MAX)", nullable = false)
    private String reportedFaultDescription;

    @Column(name = "request_type", nullable = false, length = 20)
    private String requestType;

    @Column(name = "status", length = 30)
    private String status;

    @Column(name = "rejection_reason", length = 500)
    private String rejectionReason;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;
}