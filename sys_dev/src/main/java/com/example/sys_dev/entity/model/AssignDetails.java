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
public class AssignDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int aDId;

    @ManyToOne
    @JoinColumn(name = "a_M_Id")
    private Assign_Master assign_master;

    @ManyToOne
    @JoinColumn(name="sl")
    private CheckList checkLists ;

}
