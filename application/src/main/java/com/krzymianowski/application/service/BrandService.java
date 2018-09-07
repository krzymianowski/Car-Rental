package com.krzymianowski.application.service;

import com.krzymianowski.application.model.Brand;

public interface BrandService {
    Brand getBrandByBrandName(String brand_name);

    void save(Brand brand);
}
