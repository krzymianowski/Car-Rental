package com.krzymianowski.application.model.car.projection;

import org.springframework.beans.factory.annotation.Value;

public interface OurCarsPageCar {

    @Value("#{target.id}")
    int getId();

    @Value("#{target.model.brand.brandName} #{target.model.modelName}")
    String getFullName();

    @Value("#{target.images.size() > 0 ? target.images.get(0).url : 'no-image.jpg'}")
    String getImageUrl();

    @Value("#{target.color.colorName}")
    String getColor();

    @Value("#{target.fuelType.typeName}")
    String getFuelType();

    @Value("#{target.rentPrice}")
    Double getRentPrice();

    @Value("#{target.state.stateName}")
    String getState();

    @Value("#{target.type.typeName}")
    String getType();
}
