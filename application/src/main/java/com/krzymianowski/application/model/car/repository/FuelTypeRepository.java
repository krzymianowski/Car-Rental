package com.krzymianowski.application.model.car.repository;

import com.krzymianowski.application.model.car.FuelType;
import com.krzymianowski.application.model.car.projection.OurCarsPageFuelType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface FuelTypeRepository extends CrudRepository<FuelType, Integer> {

    FuelType getFuelTypeByTypeName(String fuelTypeName);

    <T> Collection<T> findAllBy(Class<T> tClass);

    default <T> Collection<T> getAll(Class<T> tClass) {
        return findAllBy(tClass);
    }
}
