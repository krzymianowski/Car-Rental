package com.krzymianowski.application.service.car;

import com.krzymianowski.application.model.car.FuelType;

public interface FuelTypeService {
    FuelType getFuelTypeByTypeName(String fuelTypeName);

    void save(FuelType fuelType);
}
