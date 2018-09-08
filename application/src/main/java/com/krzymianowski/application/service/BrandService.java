package com.krzymianowski.application.service;

import com.krzymianowski.application.model.car.Brand;

public interface BrandService {
    Brand getBrandByBrandName(String brand_name);

    void save(Brand brand);
}
