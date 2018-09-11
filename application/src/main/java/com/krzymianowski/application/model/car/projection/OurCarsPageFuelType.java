package com.krzymianowski.application.model.car.projection;

import org.springframework.beans.factory.annotation.Value;

public interface OurCarsPageFuelType {

    @Value("#{target.typeName}")
    String getFuelTypeName();

}
