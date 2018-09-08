package com.krzymianowski.application.model.car.repository;

import com.krzymianowski.application.model.car.Brand;
import com.krzymianowski.application.model.car.Model;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRepository extends CrudRepository<Model, Integer> {

    Model getModelByBrandAndModelName(Brand brand, String modelName);
}
