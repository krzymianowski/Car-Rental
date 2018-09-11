package com.krzymianowski.application.service.car.impl;

import com.krzymianowski.application.model.car.Brand;
import com.krzymianowski.application.model.car.projection.OurCarsPageBrand;
import com.krzymianowski.application.model.car.repository.BrandRepository;
import com.krzymianowski.application.service.car.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandRepository brandRepository;

    @Override
    public Brand getBrandByBrandName(String brand_name) {
        return brandRepository.getBrandByBrandName(brand_name);
    }

    @Override
    public void save(Brand brand) {
        brandRepository.save(brand);
    }

    @Override
    public List<OurCarsPageBrand> getOurCarsPageBrands() {
        return (List<OurCarsPageBrand>) brandRepository.getAll(OurCarsPageBrand.class);
    }
}
