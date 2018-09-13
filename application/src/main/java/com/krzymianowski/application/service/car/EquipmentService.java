package com.krzymianowski.application.service.car;

import com.krzymianowski.application.model.car.Equipment;

public interface EquipmentService {
    Equipment getEquipmentByItemName(String itemName);

    void save(Equipment equipment);
}
