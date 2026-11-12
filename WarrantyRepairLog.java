package com.example.iphoneqcstore.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "warranty_repair_logs")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WarrantyRepairLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "repair_log_id")
    private Integer repairLogId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "request_id", nullable = false)
    private WarrantyRequest warrantyRequest;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "technician_id", nullable = false)
    private User technician;

    @Column(name = "fault_diagnosed", length = 255)
    private String faultDiagnosed;

    @Column(name = "replaced_part_name", length = 100)
    private String replacedPartName;

    @Column(name = "repair_result", columnDefinition = "NVARCHAR(MAX)")
    private String repairResult;

    @Column(name = "completed_at")
    private LocalDateTime completedAt;
}