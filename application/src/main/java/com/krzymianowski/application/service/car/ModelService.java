package com.krzymianowski.application.service.car;

import com.krzymianowski.application.model.car.Brand;
import com.krzymianowski.application.model.car.Model;
import com.krzymianowski.application.model.car.projection.OurCarsPageModel;

import java.util.List;

public interface ModelService {
    Model getModelByBrandAndModelName(Brand brand, String modelName);

    void save(Model model);

    List<OurCarsPageModel> getOurCarsPageModels(String brandName);
}
