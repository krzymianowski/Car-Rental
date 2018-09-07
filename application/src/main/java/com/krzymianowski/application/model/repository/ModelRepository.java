package com.krzymianowski.application.model.repository;

import com.krzymianowski.application.model.Brand;
import com.krzymianowski.application.model.Model;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRepository extends CrudRepository<Model, Integer> {

    Model getModelByBrandAndModelName(Brand brand, String modelName);
}
