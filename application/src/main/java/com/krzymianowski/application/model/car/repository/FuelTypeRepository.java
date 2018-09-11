package com.krzymianowski.application.model.car.repository;

import com.krzymianowski.application.model.car.FuelType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface FuelTypeRepository extends CrudRepository<FuelType, Integer> {

    FuelType getFuelTypeByTypeName(String fuelTypeName);

    <T> Collection<T> findAllByOrderByTypeNameAsc(Class<T> tClass);

    default <T> Collection<T> getAll(Class<T> tClass) {
        return findAllByOrderByTypeNameAsc(tClass);
    }
}
