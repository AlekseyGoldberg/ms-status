package com.example.msstatus.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StatusConsumerDto {
    private String status;
    private Long clientUserId;
    private Long doctorId;
    private Date dateCreateSchedule;
    private Date dateOperation = new Date();
}
