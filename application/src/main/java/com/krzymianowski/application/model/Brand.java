package com.krzymianowski.application.model;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "car_brand", uniqueConstraints = {@UniqueConstraint(columnNames = {"brand_name"})})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "brand_id")
    private Long id;

    @OneToMany(
            fetch = FetchType.LAZY,
            mappedBy = "brand",
            cascade = CascadeType.ALL)
    private List<Model> models;

    @Column(name = "brand_name")
    private String brandName;
}