package com.example.shift_lab_final.service.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "store.harddrive")
@NoArgsConstructor
@AllArgsConstructor
public class HardDriveEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer id;

    @Column(name = "serial_number")
    private String serialNumber;

    @Column
    private String maker;

    @Column
    private Integer price;

    @Column
    private Integer volume;

    @Column
    private Integer count;

}
