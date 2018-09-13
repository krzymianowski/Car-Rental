package com.krzymianowski.application.service.car.impl;

import com.krzymianowski.application.model.car.Equipment;
import com.krzymianowski.application.model.car.repository.EquipmentRepository;
import com.krzymianowski.application.service.car.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipmentServiceImpl implements EquipmentService {

    @Autowired
    private EquipmentRepository equipmentRepository;

    @Override
    public Equipment getEquipmentByItemName(String itemName) {
        return equipmentRepository.getEquipmentByItemName(itemName);
    }

    @Override
    public void save(Equipment equipment) {
        equipmentRepository.save(equipment);
    }
}
