package com.krzymianowski.application.model.car.repository;

import com.krzymianowski.application.model.car.Brand;
import com.krzymianowski.application.model.car.Model;
import com.krzymianowski.application.model.car.projection.OurCarsPageModel;
import org.hibernate.annotations.Parameter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface ModelRepository extends CrudRepository<Model, Integer> {

    Model getModelByBrandAndModelName(Brand brand, String modelName);

    <T> Collection<T> findByBrand_BrandName(@Param("brandName") String brandName, Class<T> tClass);

    default <T> Collection<T> getBrandName(String brandName, Class<T> tClass){
        return findByBrand_BrandName(brandName, tClass);
    };
}
