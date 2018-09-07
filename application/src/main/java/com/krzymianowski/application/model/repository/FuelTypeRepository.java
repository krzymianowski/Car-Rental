package com.krzymianowski.application.model.repository;

import com.krzymianowski.application.model.FuelType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuelTypeRepository extends CrudRepository<FuelType, Integer> {

    FuelType getFuelTypeByTypeName(String fuelTypeName);
}
