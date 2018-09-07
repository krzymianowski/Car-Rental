package com.krzymianowski.application.model.repository;

import com.krzymianowski.application.model.Brand;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends CrudRepository<Brand, Integer> {

    Brand getBrandByBrandName(String brand_name);
}
