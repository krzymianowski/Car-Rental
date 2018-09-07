package com.krzymianowski.application.service;

import com.krzymianowski.application.model.FuelType;

public interface FuelTypeService {
    FuelType getFuelTypeByTypeName(String fuelTypeName);

    void save(FuelType fuelType);
}
