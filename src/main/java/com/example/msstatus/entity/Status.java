package com.example.msstatus.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "t_status")
@Data
@Builder
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "client_user_id")
    private Long clientUserId;
    @Column(name = "doctor_id")
    private Long doctorId;
    @Column(name = "date_create_schedule")
    private Date dateCreateSchedule;
    @Column(name = "date_operation")
    private Date dateOperation;
    @Column(name = "status")
    private String status;
}
