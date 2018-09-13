package com.krzymianowski.application.model.car.projection;

import org.springframework.beans.factory.annotation.Value;

public interface CarDetailsPageEquipment {

    @Value("#{target.itemName}")
    String getItemName();
}
