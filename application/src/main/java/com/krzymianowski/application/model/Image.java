package com.krzymianowski.application.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "images", uniqueConstraints = {@UniqueConstraint(columnNames = {"url"})})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_id")
    private int id;

    @Column(name = "url")
    private String url;
}