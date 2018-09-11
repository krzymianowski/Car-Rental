package com.krzymianowski.application.service.car;

import com.krzymianowski.application.model.car.Brand;
import com.krzymianowski.application.model.car.projection.OurCarsPageBrand;

import java.util.List;

public interface BrandService {
    Brand getBrandByBrandName(String brand_name);

    void save(Brand brand);

    List<OurCarsPageBrand> getOurCarsPageBrands();
}
