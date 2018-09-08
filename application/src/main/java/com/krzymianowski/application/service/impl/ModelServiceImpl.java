package com.krzymianowski.application.service.impl;

import com.krzymianowski.application.model.car.Brand;
import com.krzymianowski.application.model.car.Model;
import com.krzymianowski.application.model.car.repository.ModelRepository;
import com.krzymianowski.application.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelServiceImpl implements ModelService {

    @Autowired
    private ModelRepository modelRepository;

    @Override
    public Model getModelByBrandAndModelName(Brand brand, String modelName) {
        return modelRepository.getModelByBrandAndModelName(brand, modelName);
    }

    @Override
    public void save(Model model) {
        modelRepository.save(model);
    }
}
