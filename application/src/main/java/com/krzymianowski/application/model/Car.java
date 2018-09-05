package com.krzymianowski.application.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity @Table(name = "car")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor @Builder
public class Car {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private int id;

    @Column(name = "production_date")
    private Date productionDate;

    @Column(name = "mileage")
    private int mileage;

    @Column(name = "fuel_condition")
    private float fuelCondition;

    @Column(name = "rent_price")
    private double rentPrice;
}
