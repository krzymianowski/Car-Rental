package com.krzymianowski.application.model.car.projection;

import org.springframework.beans.factory.annotation.Value;

public interface OurCarsPageModel {

    @Value("#{target.modelName}")
    String getModelName();

}
