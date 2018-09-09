package com.krzymianowski.application.service.car.impl;

import com.krzymianowski.application.model.car.FuelType;
import com.krzymianowski.application.model.car.repository.FuelTypeRepository;
import com.krzymianowski.application.service.car.FuelTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuelTypeServiceImpl implements FuelTypeService {

    @Autowired
    private FuelTypeRepository fuelTypeRepository;

    @Override
    public FuelType getFuelTypeByTypeName(String fuelTypeName) {
        return fuelTypeRepository.getFuelTypeByTypeName(fuelTypeName);
    }

    @Override
    public void save(FuelType fuelType) {
        fuelTypeRepository.save(fuelType);
    }
}