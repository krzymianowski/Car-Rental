package com.krzymianowski.application.service.car;

import com.krzymianowski.application.model.car.FuelType;
import com.krzymianowski.application.model.car.projection.OurCarsPageFuelType;

import java.util.List;

public interface FuelTypeService {
    FuelType getFuelTypeByTypeName(String fuelTypeName);

    void save(FuelType fuelType);

    List<OurCarsPageFuelType> getOurCarsPageFuelTypes();
}
