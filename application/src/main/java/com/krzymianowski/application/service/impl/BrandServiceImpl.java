package com.krzymianowski.application.service.impl;

import com.krzymianowski.application.model.Brand;
import com.krzymianowski.application.model.repository.BrandRepository;
import com.krzymianowski.application.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
