package com.krzymianowski.application.service;

import com.krzymianowski.application.model.car.FuelType;

public interface FuelTypeService {
    FuelType getFuelTypeByTypeName(String fuelTypeName);

    void save(FuelType fuelType);
}
