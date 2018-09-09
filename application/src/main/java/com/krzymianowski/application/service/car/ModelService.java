package com.krzymianowski.application.service.car;

import com.krzymianowski.application.model.car.Brand;
import com.krzymianowski.application.model.car.Model;

public interface ModelService {
    Model getModelByBrandAndModelName(Brand brand, String modelName);

    void save(Model model);
}
