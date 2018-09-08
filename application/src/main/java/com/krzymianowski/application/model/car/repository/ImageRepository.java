package com.krzymianowski.application.model.car.repository;

import com.krzymianowski.application.model.car.Image;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends CrudRepository<Image, Integer> {
}
