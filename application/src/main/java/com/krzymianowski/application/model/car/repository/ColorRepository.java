package com.krzymianowski.application.model.car.repository;

import com.krzymianowski.application.model.car.Color;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorRepository extends CrudRepository<Color, Integer> {

    Color getColorByColorName(String colorName);
}
