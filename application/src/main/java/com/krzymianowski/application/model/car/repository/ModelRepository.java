package com.krzymianowski.application.model.car.repository;

import com.krzymianowski.application.model.car.Brand;
import com.krzymianowski.application.model.car.Model;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface ModelRepository extends CrudRepository<Model, Integer> {

    Model getModelByBrandAndModelName(Brand brand, String modelName);

    <T> Collection<T> findByBrand_BrandNameOrderByModelNameAsc(@Param("brandName") String brandName, Class<T> tClass);

    default <T> Collection<T> getBrandName(String brandName, Class<T> tClass) {
        return findByBrand_BrandNameOrderByModelNameAsc(brandName, tClass);
    }
}
