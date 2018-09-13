package com.krzymianowski.application.model.car;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "rating")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rating_id")
    private int id;

    @Column(name = "economy")
    private int economy;

    @Column(name = "comfort")
    private int comfort;

    @Column(name = "power")
    private int power;
}
