package com.krzymianowski.application.model.car.repository;

import com.krzymianowski.application.model.car.Brand;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface BrandRepository extends CrudRepository<Brand, Integer> {

    Brand getBrandByBrandName(String brand_name);

    <T> Collection<T> findAllByOrderByBrandNameAsc(Class<T> tClass);

    default <T> Collection<T>  getAll(Class<T> tClass){
        return findAllByOrderByBrandNameAsc(tClass);
    }
}
