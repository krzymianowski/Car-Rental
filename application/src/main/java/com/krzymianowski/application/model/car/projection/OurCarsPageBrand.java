package com.krzymianowski.application.model.car.projection;

import org.springframework.beans.factory.annotation.Value;

public interface OurCarsPageBrand {

    @Value("#{target.brandName}")
    String getBrandName();

}
