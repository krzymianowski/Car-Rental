package com.krzymianowski.application.model.car;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "car_equipment", uniqueConstraints = {@UniqueConstraint(columnNames = {"item_name"})})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_equipment_id")
    private int id;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "item_description")
    private String itemDescription;

}
