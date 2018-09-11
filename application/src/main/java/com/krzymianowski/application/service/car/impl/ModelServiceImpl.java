package com.krzymianowski.application.service.car.impl;

import com.krzymianowski.application.model.car.Brand;
import com.krzymianowski.application.model.car.Model;
import com.krzymianowski.application.model.car.projection.OurCarsPageModel;
import com.krzymianowski.application.model.car.repository.ModelRepository;
import com.krzymianowski.application.service.car.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<OurCarsPageModel> getOurCarsPageModels(String brandName) {
        return (List<OurCarsPageModel>) modelRepository.getBrandName(brandName, OurCarsPageModel.class);
    }
}
