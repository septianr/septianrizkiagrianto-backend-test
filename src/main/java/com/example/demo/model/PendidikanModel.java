package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Table(name = "pendidikan")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PendidikanModel extends AuditTrail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String status;

    @ManyToOne
    @JoinColumn(name = "idMurid", referencedColumnName = "id", nullable = false)
    private MuridModel idMurid;


}
