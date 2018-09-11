package com.krzymianowski.application.model.car.projection;

import org.springframework.beans.factory.annotation.Value;

public interface OurCarsPageType {

    @Value("#{target.typeName}")
    String getTypeName();

    @Value("#{target.description}")
    String getTypeDescription();

}
