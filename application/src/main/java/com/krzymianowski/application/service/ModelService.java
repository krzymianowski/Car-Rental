package com.krzymianowski.application.service;

import com.krzymianowski.application.model.Brand;
import com.krzymianowski.application.model.Model;

public interface ModelService {
    Model getModelByBrandAndModelName(Brand brand, String modelName);

    void save(Model model);
}
