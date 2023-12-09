package com.example.sys_dev.entity.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Assign_Master {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int a_M_Id;


    @OneToOne
    @JoinColumn(name = "deptId")
    private Department department;



}
